package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlTest {

    @Test
    public void deveRetornarEndpoint() {
        Url.getInstance().setEndpoint("https://servico.com.br/operacao.api/");
        assertEquals("https://servico.com.br/operacao.api/", Url.getInstance().getEndpoint());
    }

    @Test
    public void deveRetornarLocal() {
        Url.getInstance().setLocal("cadastro/inserircadastro");
        assertEquals("cadastro/inserircadastro", Url.getInstance().getLocal());
    }

}