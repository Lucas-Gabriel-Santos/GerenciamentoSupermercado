package supermercado.model;

//Criação da classe abstrata supermercado.model.Produto usando abstract
public abstract class Produto {

    private String nome;
    private int codigoBarras;
    private double precoBase;
    private Fornecedor fornecedor; //Composição com fornecedor

    //Construtor
    public Produto(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.precoBase = precoBase;
        this.fornecedor = fornecedor;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    //Métodos
    public abstract double calcularPrecoFinal();

    public void exibirResumo(){
        System.out.println("Produto: " + this.nome + " || Código: " + this.codigoBarras);
        System.out.printf("Preço Final: R$ %.2f\n", calcularPrecoFinal());
        if (fornecedor != null) {
            fornecedor.exibirDetalhesFornecedor();
        }
        System.out.println("---------------------");
    }
}
