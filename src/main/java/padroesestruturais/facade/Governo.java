package padroesestruturais.facade;

public class Governo extends Orgao {

    private static Governo governo = new Governo();

    private Governo() {};

    public static Governo getInstancia() {
        return governo;
    }

}
