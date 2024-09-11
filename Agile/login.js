document.getElementById('loginForm').addEventListener('submit', function (event) {
    event.preventDefault();

    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;

    // Validação simples de exemplo
    if (email && senha) {
        alert('Login realizado com sucesso!');
        // Aqui você pode redirecionar o usuário para outra página, por exemplo.
        // window.location.href = 'dashboard.html';
    } else {
        alert('Por favor, preencha todos os campos.');
    }
});
