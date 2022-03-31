package padroesestruturais.bridge;

public class Spear extends Item {

    public Spear(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.valorBase;
    }
}
