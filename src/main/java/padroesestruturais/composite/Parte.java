package padroesestruturais.composite;

public abstract class Parte {

    private String descricao;

    public Parte(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getConteudo();
}
