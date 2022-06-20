package padroescomportamentais.iterator;

import java.util.Iterator;


public class Presenca {

    public static Integer InscritosPresentes(DataEvento dataEvento) {
        int quantidade = 0;
        for (Inscrito Inscrito : dataEvento) {
            if (Inscrito.isPresenca()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer totalInscritosMatriculados(DataEvento dataEvento) {
        int quantidade = 0;
        for (Iterator a = dataEvento.iterator(); ((Iterator<?>) a).hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }


}