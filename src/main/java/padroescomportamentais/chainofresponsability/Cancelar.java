package padroescomportamentais.chainofresponsability;

public class Cancelar implements TipoServico {
    private static Cancelar cancelar = new Cancelar();

    private Cancelar(){};

    public static Cancelar getCancelar() {
        return cancelar;
    }

    @Override
    public String tipoServicoRealizado() {
        return "Cancelamento";
    }
}