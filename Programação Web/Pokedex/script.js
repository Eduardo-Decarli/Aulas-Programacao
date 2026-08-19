const pokemonGrid = document.getElementById('pokemonGrid');
const searchInput = document.getElementById('searchInput');
const typeFilter = document.getElementById('typeFilter');
const loader = document.getElementById('loader');

const POKEMON_COUNT = 151; // Primeira Geração
let allPokemon = [];

// Iniciar a busca dos dados
fetchPokemons();

async function fetchPokemons() {
    showLoader(true);
    const promises = [];

    for (let i = 1; i <= POKEMON_COUNT; i++) {
        promises.push(fetch(`https://pokeapi.co/api/v2/pokemon/${i}`).then(res => res.json()));
    }

    // Executa todas as requisições em paralelo
    allPokemon = await Promise.all(promises);
    showLoader(false);
    displayPokemons(allPokemon);
}

function displayPokemons(pokemons) {
    pokemonGrid.innerHTML = '';

    pokemons.forEach(pokemon => {
        const card = document.createElement('div');
        card.classList.add('pokemon-card');

        const typesHtml = pokemon.types.map(t => {
            const typeName = t.type.name;
            return `<span class="type-badge" style="background-color: var(--type-${typeName}, var(--type-default))">${typeName}</span>`;
        }).join('');

        card.innerHTML = `
            <span class="pokemon-id">#${String(pokemon.id).padStart(3, '0')}</span>
            <img src="${pokemon.sprites.other['official-artwork'].front_default}" alt="${pokemon.name}">
            <h3 class="pokemon-name">${pokemon.name}</h3>
            <div class="types-container">${typesHtml}</div>
        `;

        pokemonGrid.appendChild(card);
    });
}

// Filtro por Busca e Tipo em tempo real
function filterPokemons() {
    const searchTerm = searchInput.value.toLowerCase().trim();
    const selectedType = typeFilter.value;

    const filtered = allPokemon.filter(pokemon => {
        const matchesNameOrId = pokemon.name.toLowerCase().includes(searchTerm) || 
                                String(pokemon.id).includes(searchTerm);
        
        const matchesType = selectedType === 'all' || 
                            pokemon.types.some(t => t.type.name === selectedType);

        return matchesNameOrId && matchesType;
    });

    displayPokemons(filtered);
}

// Eventos de Busca
searchInput.addEventListener('input', filterPokemons);
typeFilter.addEventListener('change', filterPokemons);

function showLoader(visible) {
    if (visible) loader.classList.remove('hidden');
    else loader.classList.add('hidden');
}