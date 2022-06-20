package padroescomportamentais.visitor;

public class FuncionarioExtra implements Pessoa {

    private int codigo;
    private String nome;
    private float valorDiaria;

    public FuncionarioExtra(int codigo, String nome, float valorDiaria) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorDiaria = valorDiaria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFuncionarioExtra(this);
    }

}
