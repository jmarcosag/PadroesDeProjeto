package padroescomportamentais.observer;

import java.util.Observable;

public class Casaco extends Observable {
    private String cor;
    private String nome;

    public Casaco(String nome, String cor) {
        this.cor = cor;
        this.nome = nome;
    }

    public void atualizarEstoque() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        String retornarProduto = "produto " + nome + ", cor " + cor;
        return retornarProduto;
    }
}
