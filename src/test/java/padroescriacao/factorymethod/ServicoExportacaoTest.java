package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoExportacaoTest {

    @Test
    void deveExecutarExportacao() {
        IServico servico = ServicoFactory.obterServico("Exportacao");
        assertEquals("Exportacao realizada", servico.executar());
    }

    @Test
    void deveCancelarExportacao() {
        IServico servico = ServicoFactory.obterServico("Exportacao");
        assertEquals("Exportacao cancelada", servico.cancelar());
    }

}