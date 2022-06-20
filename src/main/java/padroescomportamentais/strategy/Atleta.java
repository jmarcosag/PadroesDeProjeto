package padroescomportamentais.strategy;

public class Atleta {

    private float pontos;

    public float getPontos() {
        return pontos;
    }

    public void somarPontos(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.pontos = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairPontos(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.pontos = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirPontos(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.pontos = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarPontos(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.pontos = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaPontos(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.pontos = calculadora.calcular(new OperacaoMedia());
    }

}
