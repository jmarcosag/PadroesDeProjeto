package padroescomportamentais.mediator;

public class Suporte implements Setor {

    private static Suporte instancia = new Suporte();

    private Suporte() {}

    public static Suporte getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Suporte vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Suporte agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Suporte vai analisar a sugestão: " + mensagem;
    }
}
