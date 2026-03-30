package supermercado.service;

//Imports
import supermercado.model.Produto;
import java.util.LinkedList;

//Classe aplicando LinkedList
public class CarrinhoDeCompras {
    private LinkedList<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new LinkedList<>();
    }

    //Metodos
    public void adicionarItem(Produto produto){
        this.itens.add(produto);
    }

    //Metodo processarCompra utilizando o For-Each
    public void processarCompra(){
        double valorTotal = 0;
        for(Produto produto : itens){//Pega cada produto dentro da lista itens
            produto.exibirResumo();
            double calcularpreco = produto.calcularPrecoFinal();
            valorTotal += calcularpreco;
        }
        System.out.printf("O valor Total a pagar: R$ %.2f\n", valorTotal);
    }


}
