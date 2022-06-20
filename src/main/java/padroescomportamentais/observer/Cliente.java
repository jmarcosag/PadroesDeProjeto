package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void listaDesejados(Casaco casaco) {
        casaco.addObserver(this);
    }

    public void update(Observable casaco, Object arg1) {
        this.ultimaNotificacao = "Olá " + this.nome +
                ", o " + casaco.toString() +
                ", está disponível!";
    }
}
