package padroescomportamentais.memento;

public class VeiculoConfiscado implements VeiculoEstado {

    private VeiculoConfiscado() {};
    private static VeiculoConfiscado instance = new VeiculoConfiscado();
    public static VeiculoConfiscado getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Confiscado";
    }

}
