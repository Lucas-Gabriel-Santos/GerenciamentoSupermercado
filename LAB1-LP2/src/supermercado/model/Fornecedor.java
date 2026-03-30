package supermercado.model;

public class Fornecedor {

    private String nomeEmpresa;
    private String nif;
    private String paisOrigem;

    //Construtor
    public Fornecedor(String nomeEmpresa, String nif, String paisOrigem) {
        this.nomeEmpresa = nomeEmpresa;
        this.nif = nif;
        this.paisOrigem = paisOrigem;
    }

    //Getters e Setters
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    //Metodo
    public void exibirDetalhesFornecedor() {
        System.out.println("Nome: " + this.nomeEmpresa);
        System.out.println("NIF: " + this.nif);
        System.out.println("PAÍS: " + this.paisOrigem);
    }

}
