package padroescomportamentais.memento;

public class VeiculoRetido implements VeiculoEstado {

    private VeiculoRetido() {};
    private static VeiculoRetido instance = new VeiculoRetido();
    public static VeiculoRetido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Retido";
    }

}
