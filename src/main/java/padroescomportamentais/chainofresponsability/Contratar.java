package padroescomportamentais.chainofresponsability;

public class Contratar implements TipoServico{
    private static Contratar contratar = new Contratar();

    private Contratar(){};

    public static Contratar getContratacao() {
        return contratar;
    }

    @Override
    public String tipoServicoRealizado() {
        return "Contratar";
    }
}
