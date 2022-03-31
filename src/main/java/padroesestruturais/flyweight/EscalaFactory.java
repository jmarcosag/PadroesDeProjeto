package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EscalaFactory {
    private static Map<String, Escala> escala = new HashMap<>();

    public static Escala getEscala(String designacao, String funcao) {
        Escala escala = EscalaFactory.escala.get(designacao);
        if (escala == null) {
            escala = new Escala(designacao, funcao);
            EscalaFactory.escala.put(designacao, escala);
        }
        return escala;
    }

    public static int getTotalEscalas() {
        return escala.size();
    }

}




