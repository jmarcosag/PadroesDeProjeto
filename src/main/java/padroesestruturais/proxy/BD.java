package padroesestruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Atleta> atletas = new HashMap<>();

    public static Atleta getAluno(Integer codigoInscricao) {
        return atletas.get(codigoInscricao);
    }

    public static void addAluno(Atleta atleta) {
        atletas.put(atleta.getCodigoInscricao(), atleta);
    }
}
