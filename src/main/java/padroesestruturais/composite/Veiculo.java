package padroesestruturais.composite;

public class Veiculo {

    private Parte parte;

    public void setParte(Parte peca) {
        this.parte = peca;
    }

    public String getParte() {
        if (this.parte == null) {
            throw new NullPointerException("Veiculo sem parte");
        }
        return this.parte.getConteudo();
    }
}
