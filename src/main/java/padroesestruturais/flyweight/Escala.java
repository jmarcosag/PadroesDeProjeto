package padroesestruturais.flyweight;

public class Escala {

    private String designacao;
    private String funcao;

    public Escala(String designacao, String funcao) {
        this.designacao = designacao;
        this.funcao = funcao;
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getFuncao() {
        return funcao;
    }
}
