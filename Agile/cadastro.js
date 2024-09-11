document.getElementById('contactForm').addEventListener('submit', function (event) {
    event.preventDefault();

    const nome = document.getElementById('nome').value;
    const sexo = document.getElementById('sexo').value;
    const email = document.getElementById('email').value;
    const telefone = document.getElementById('telefone').value;
    const cep = document.getElementById('cep').value;
    const logradouro = document.getElementById('logradouro').value;
    const numero = document.getElementById('numero').value;
    const bairro = document.getElementById('bairro').value;
    const cidade = document.getElementById('cidade').value;
    const dataNascimento = document.getElementById('dataNascimento').value;
    const mensagem = document.getElementById('mensagem').value;

    // Validação básica
    if (nome && sexo && email && telefone && logradouro && numero && bairro && cep && cidade && dataNascimento && mensagem) {
        alert('Formulário enviado com sucesso!');
        this.reset();
    } else {
        alert('Por favor, preencha todos os campos.');
    }
});
