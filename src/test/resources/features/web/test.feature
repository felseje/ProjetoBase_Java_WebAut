#language: pt
#encoding: UTF-8
#author: Feliphe Jesus

Funcionalidade: Teste de execução do site https://www.sitequalquer.com

  Contexto: Acessar website
    Dado que acesso o site "https://www.sitequalquer.com"

  @web
  Cenario: Cenário qualquer
    E estou executando o teste
      | Projeto | Número CT | Nome CT | Executor | Sprint   |
      | (Nome)  | (Número)  | (Nome)  | (Nome)   | (Número) |