package padroesestruturais.facade;

public class Policia extends Orgao {

    private static Policia finaceiro = new Policia();

    private Policia() {};

    public static Policia getInstancia() {
        return finaceiro;
    }
}
