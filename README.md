# GerenciamentoSupermercado
Laboratorio 1: Sistema de Supermercado - Projeto de Programação Orientada a Objetos, 
desenvolvido em Java para a disciplina de Linguagem de Programação II

## 📝 Conceitos de Programação que ele exercita
- Abstração: Uso da classe abstrata Produto. Ela serve como um molde e impede que alguém crie um produto "genérico" sem categoria no sistema.
- Herança: As classes ProdutoAlimenticio e ProdutoEletronico herdam as características básicas da classe Produto.
- Composição: A relação de que um produto "tem um" fornecedor obrigatoriamente.
- Polimorfismo: No carrinho de compras, o sistema chama o método calcularPrecoFinal() para todos os itens da lista. A própria linguagem Java se encarrega de descobrir se deve aplicar a regra do alimento ou do eletrônico em tempo de execução.

## 💻 Funcionalidades
- Gestão de Fornecedores
- Gestão de Produtos
- Carrinho de Compras: Adiciona diferentes tipos de produtos em uma LinkedList e processa a compra, calculando o valor total do cliente.

## ⚒️ Tecnologias
- Java 25
- Intellij IDE
  
## 📁 Estrutura
```text
src/
└── supermercado/
    ├── main/
    │   └── Main.java
    ├── model/
    │   ├── Fornecedor.java
    │   ├── Produto.java
    │   ├── ProdutoAlimenticio.java
    │   └── ProdutoEletronico.java
    └── service/
        └── CarrinhoDeCompras.java
```
