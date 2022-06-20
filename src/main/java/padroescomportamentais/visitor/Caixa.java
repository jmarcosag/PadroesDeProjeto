package padroescomportamentais.visitor;

public class Caixa implements Pessoa {

    private int cpf;
    private String nome;
    private Cargo cargo;

    public Caixa(int cpf, String nome, Cargo cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCargo() {
        return this.cargo.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCaixa(this);
    }

}
