const API = "http://localhost:8080/cards";

document.getElementById("formCard").addEventListener("submit", async (e) => {
    e.preventDefault();

    const formData = new FormData(e.target);

    await fetch(API, {
        method: "POST",
        body: formData
    });

    e.target.reset();
    loadCards();
});

async function loadCards() {
    const res = await fetch(API);
    const cards = await res.json();

    const div = document.getElementById("cards");
    div.innerHTML = "";

    cards.forEach(c => {
        div.innerHTML += `
            <div class="card">
                <img src="${c.imagem}">
                <h3>${c.nome}</h3>
                <p>${c.descricao}</p>
                <p>R$ ${c.preco}</p>
            </div>
        `;
    });
}

loadCards();