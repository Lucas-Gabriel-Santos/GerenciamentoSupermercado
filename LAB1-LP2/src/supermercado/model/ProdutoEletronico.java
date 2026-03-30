package supermercado.model;

public class ProdutoEletronico extends Produto {

    private int mesesGarantia;

    //Construtor
    public ProdutoEletronico(String nome, int codigoBarras, int precoBase, int mesesGarantia, Fornecedor fornecedor) {
        super(nome, codigoBarras, precoBase, fornecedor);
        this.mesesGarantia = mesesGarantia;
    }

    //Getters e Setters
    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    //Metodo da superclasse
    @Override
    public double calcularPrecoFinal(){
        //preço base mais a margem de 50%
        double precoComMargem = this.getPrecoBase() * 1.50;

        //Se a garantia for maior que 12 meses, será aplicado 15% sobre o valor anterior
        if(this.mesesGarantia > 12){
            return precoComMargem * 1.15;
        }
        else{
            return precoComMargem;
        }
    }
}
