package padroesestruturais.facade;

public class Receita extends Orgao {

    private static Receita receita = new Receita();

    private Receita() {};

    public static Receita getInstancia() {
        return receita;
    }
}
