package padroescomportamentais.templatemethod;

public abstract class Cargueiro {
    private String montadora;
    private float pesoAviao;
    private float pesoCarga;

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public float getPesoAviao() {
        return pesoAviao;
    }

    public void setPesoAviao(float pesoAviao) {
        this.pesoAviao = pesoAviao;
    }

    public float getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public float calcularPesoTotal() {
        return (this.pesoCarga + this.pesoAviao);
    }

    public abstract String verificacao();

    public String getTipo() {
        return "Cargueiro Médio";
    }

    public String getInformacoes() {
        return getTipo() +
                "{" + "montadora='" + this.montadora + '\'' + ", " +
                "resultado=" + this.verificacao() + "}";
    }

}
