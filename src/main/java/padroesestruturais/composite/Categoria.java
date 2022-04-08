package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Parte {

    private List<Parte> partes;

    public Categoria(String descricao) {
        super(descricao);
        this.partes = new ArrayList<Parte>();
    }

    public void addConteudo(Parte parte) {
        this.partes.add(parte);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Categoria: " + this.getDescricao() + "\n";
        for (Parte parte : partes) {
            saida += parte.getConteudo();
        }
        return saida;
    }
}
