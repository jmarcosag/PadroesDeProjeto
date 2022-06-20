package padroescomportamentais.templatemethod;

public class CargueiroMedio extends Cargueiro {

    public String verificacao() {
        if (this.calcularPesoTotal() <= 60) {
            return "Peso permitido para decolagem";
        }
        else {
            return "Peso acima do permitido!";
        }
    }

    @Override
    public String getTipo() {
        return "Cargueiro Médio";
    }
}
