const formulario = document.getElementById('form-cadastro');

formulario.addEventListener('submit', async (event) => {
    event.preventDefault(); 
    const dados = {
        email: document.querySelector('#input-email').value,
        senha: document.querySelector('input[name="senha"]').value
    };

    //Enviar para o Back-end (Spring Boot)
    try {
        const resposta = await fetch("http://localhost:8080/lifebloom", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(dados) 
        });

        if (resposta.ok) {
            alert("Cadastro realizado com sucesso!");
            window.location.href = "./login.html"; 
        } else {
            alert("Erro ao cadastrar. Verifique os dados.");
        }
    } catch (erro) {
        console.error("Erro na conexão:", erro);
        alert("O servidor está desligado ou houve um erro de rede.");
    }
});
