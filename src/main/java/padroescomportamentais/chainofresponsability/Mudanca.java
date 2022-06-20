package padroescomportamentais.chainofresponsability;

public class Mudanca implements TipoServico{
    private static Mudanca mudanca = new Mudanca();

    private Mudanca(){};

    public static Mudanca getMudanca() {
        return mudanca;
    }

    @Override
    public String tipoServicoRealizado() {
        return "Mudança";
    }
}