package padroescomportamentais.mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioSuporte(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoSuporte(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoSuporte(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Suporte.getInstancia().receberSugestao(mensagem);
    }

}
