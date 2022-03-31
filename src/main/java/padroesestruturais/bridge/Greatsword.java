package padroesestruturais.bridge;

public class Greatsword extends Item {

    public Greatsword(float salarioBase) {
        super(salarioBase);
    }

    public float calcularValor() {
        return this.valorBase * (1 + this.qualidade.percentualAumento());
    }

}
