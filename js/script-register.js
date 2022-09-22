// Função para carregar os campos para cadastrar pessoa física
function formPessoaFisica() {
    //console.log("Carregar formulário pessoa física.");

    // Apresentar o título cadastrar pessoa física
    document.getElementById("titulo-pessoa-fisica").style.display = 'flex';
    document.getElementById("titulo-pessoa-juridica").style.display = 'none';

    // Apresentar o formulário cadastrar pessoa física
    document.getElementById("form-pessoa-fisica").style.display = 'flex';
    document.getElementById("form-pessoa-juridica").style.display = 'none';

    // Carregar o botão cadastrar após o usuário selecionar o tipo de formulário pessoa física ou jurídica
    document.getElementById("form-btn-cadastrar").style.display = 'flex';
}

// Função para carregar os campos para cadastrar pessoa jurídica
function formPessoaJuridica() {
    //console.log("Carregar formulário pessoa jurídica.");

    // Apresentar o título cadastrar pessoa jurídica
    document.getElementById("titulo-pessoa-juridica").style.display = 'flex';
    document.getElementById("titulo-pessoa-fisica").style.display = 'none';

    // Apresentar o formulário cadastrar pessoa jurídica
    document.getElementById("form-pessoa-fisica").style.display = 'none';
    document.getElementById("form-pessoa-juridica").style.display = 'flex';

    // Carregar o botão cadastrar após o usuário selecionar o tipo de formulário pessoa física ou jurídica
    document.getElementById("form-btn-cadastrar").style.display = 'flex';
}