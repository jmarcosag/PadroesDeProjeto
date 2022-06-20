package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiarSuporte(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioSuporte(mensagem);
    }

    public String reclamarSuporte(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoSuporte(mensagem);
    }

    public String sugerirSuporte(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoSuporte(mensagem);
    }


}
