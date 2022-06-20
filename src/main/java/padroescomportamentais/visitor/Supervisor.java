package padroescomportamentais.visitor;

public class Supervisor implements Pessoa {

    private int cpf;
    private String nome;
    private String setor;

    public Supervisor(int cpf, String nome, String setor) {
        this.cpf = cpf;
        this.nome = nome;
        this.setor = setor;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirSupervisor(this);
    }

}
