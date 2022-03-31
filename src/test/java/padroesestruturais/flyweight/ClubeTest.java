package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClubeTest {

    @Test
    void deveRetornarAlunos() {
        Clube clube = new Clube();
        clube.contratarJogador("Joao", "Streamer", "Suporte");
        clube.contratarJogador("Luisa", "Titular", "Breacher");
        clube.contratarJogador("Ana", "Reserva", "Roamer");
        clube.contratarJogador("Isabella", "Titular", "Breacher");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Joao', designacao='Streamer', funcao='Suporte'}",
                "Jogador{nome='Luisa', designacao='Titular', funcao='Breacher'}",
                "Jogador{nome='Ana', designacao='Reserva', funcao='Roamer'}",
                "Jogador{nome='Isabella', designacao='Titular', funcao='Breacher'}");

        assertEquals(saida, clube.obterJogadores());
    }

    @Test
    void deveRetornarTotalCidades() {
        Clube clube = new Clube();
        clube.contratarJogador("Joao", "Streamer", "Suporte");
        clube.contratarJogador("Luisa", "Titular", "Breacher");
        clube.contratarJogador("Ana", "Reserva", "Roamer");
        clube.contratarJogador("Isabella", "Titular", "Breacher");

        assertEquals(3, EscalaFactory.getTotalEscalas());
    }

}