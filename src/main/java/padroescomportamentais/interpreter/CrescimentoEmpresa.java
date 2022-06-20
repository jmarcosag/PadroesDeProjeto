package padroescomportamentais.interpreter;

public class CrescimentoEmpresa {

    public static String formula = "nota2 - nota1";

    public static double calcularCrescimento(double valor1, double valor2) {
        String expressao;
        expressao = formula.replace("valor1", Double.toString(valor1));
        expressao = expressao.replace("valor2", Double.toString(valor2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
