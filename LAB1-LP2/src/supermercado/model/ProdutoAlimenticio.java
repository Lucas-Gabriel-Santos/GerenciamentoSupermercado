package supermercado.model;

public class ProdutoAlimenticio extends Produto {

     private int diasValidade;

     //Construtor
     public ProdutoAlimenticio(String nome, int codigoBarras, int precoBase, int diasValidade, Fornecedor fornecedor) {
         super(nome, codigoBarras, precoBase, fornecedor);
         this.diasValidade = diasValidade;
     }

    //Getters e Setters
    public int getDiasValidade() {
        return diasValidade;
    }

    public void setDiasValidade(int diasValidade) {
        this.diasValidade = diasValidade;
    }

     //Metodo da superclasse
     @Override
     public double calcularPrecoFinal(){
         //Calcula o preço do produto com a margem de lucro de 20%
         double precoComLucro = this.getPrecoBase() * 1.20;

         //Verifica a validade do produto para aplicar o desconto de 30%
         if(diasValidade <= 5){
             return precoComLucro * 0.70;
         }
         else{
             return precoComLucro;
         }
     }
}
