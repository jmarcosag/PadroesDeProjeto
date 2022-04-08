package padroesestruturais.decorator;

public abstract class CompeticaoDecorator implements Competicao {

    private Competicao competicao;
    public String estrutura;

    public CompeticaoDecorator(Competicao competicao) {
        this.competicao = competicao;
    }

    public Competicao getCompeticao() {
        return competicao;
    }

    public void setCompeticao(Competicao competicao) {
        this.competicao = competicao;
    }

    public abstract float getPercentualBonusDeTempo();

    public float getLimiteTempo() {
        return this.competicao.getLimiteTempo() * (1 + (this.getPercentualBonusDeTempo() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.competicao.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
