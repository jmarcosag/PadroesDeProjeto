package padroesestruturais.flyweight;

public class Jogador {

    private String nome;
    private Escala escalaAtual;

    public Jogador(String nome, Escala escalaAtual) {
        this.nome = nome;
        this.escalaAtual = escalaAtual;
    }

    public String obterJogador() {
        return "Jogador{" +
                "nome='" + this.nome + '\'' +
                ", designacao='" + escalaAtual.getDesignacao() + '\'' +
                ", funcao='" + escalaAtual.getFuncao() + '\'' +
                '}';
    }
}
