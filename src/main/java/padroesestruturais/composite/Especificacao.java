package padroesestruturais.composite;

public class Especificacao extends Parte {

    private int quantidade;

    public Especificacao(String descricao, int quantidade) {
        super(descricao);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getConteudo() {
        return "Especificação: " + this.getDescricao() + " - Quantidade: " + this.quantidade + "\n";
    }

}
