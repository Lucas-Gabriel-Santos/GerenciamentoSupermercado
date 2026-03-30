package supermercado.main;

//Imports
import supermercado.model.Fornecedor;
import supermercado.model.ProdutoAlimenticio;
import supermercado.model.ProdutoEletronico;
import supermercado.service.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        //Instanciar fornecedores
        Fornecedor fornecedor1 = new Fornecedor("Fazenda Local", "123456", "Brasil");
        Fornecedor fornecedor2 = new Fornecedor("TechGlobal", "678910", "Estados Unidos");

        //Instanciar Produtos
        ProdutoAlimenticio ProdAlim = new ProdutoAlimenticio("Leite", 123, 10, 5, fornecedor1);
        ProdutoEletronico ProdElet = new ProdutoEletronico("Mouse", 770, 83, 3, fornecedor2);

        //Gerenciar os itens
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(ProdAlim);
        carrinho.adicionarItem(ProdElet);

        //Finalizar compra e mostrar resumo
        System.out.println("-- Resumo da Compra --");
        carrinho.processarCompra();

    }
}
