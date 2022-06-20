package padroescomportamentais.memento;

public class VeiculoDocumentoEmDia implements VeiculoEstado {

    private VeiculoDocumentoEmDia() {};
    private static VeiculoDocumentoEmDia instance = new VeiculoDocumentoEmDia();
    public static VeiculoDocumentoEmDia getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Em Dia";
    }
    
}

