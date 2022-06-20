package padroescomportamentais.memento;

public class VeiculoDocumentoVencido implements VeiculoEstado {

    private VeiculoDocumentoVencido() {};
    private static VeiculoDocumentoVencido instance = new VeiculoDocumentoVencido();
    public static VeiculoDocumentoVencido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Vencido";
    }

}
