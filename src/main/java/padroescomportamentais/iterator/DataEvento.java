package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataEvento implements Iterable<Inscrito>{
    private List<Inscrito> inscritos = new ArrayList<Inscrito>(  );

    public DataEvento(Inscrito... inscritos) {
        this.inscritos = Arrays.asList(inscritos);
    }

    @Override
    public Iterator<Inscrito> iterator() {
        return inscritos.iterator();
    }
}


