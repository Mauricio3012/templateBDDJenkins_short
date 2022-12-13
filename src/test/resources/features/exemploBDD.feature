#language: pt
@geral
Funcionalidade: Testar acessos a sites conhecidos

  @BDD
  Cenario: Acessar o site do UOL via Google
    Dado carrego a URL do site Google
    Quando realizo a pesquisa informando UOL
    Então acesso a pagina do UOL
