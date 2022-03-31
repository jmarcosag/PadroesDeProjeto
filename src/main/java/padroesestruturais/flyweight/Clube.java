package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Clube {

    private List<Jogador> jogadores = new ArrayList<>();

    public void contratarJogador(String nome, String designacao, String funcao) {
        Escala escala = EscalaFactory.getEscala(designacao, funcao);
        Jogador jogador = new Jogador(nome, escala);
        jogadores.add(jogador);
    }

    public List<String> obterJogadores() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }


}
