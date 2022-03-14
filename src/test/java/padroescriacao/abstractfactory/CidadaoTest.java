package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CidadaoTest {

    @Test
    void deveEmitirHistoricoFaturaEmDia() {
        FabricaAbstrata fabrica = new FabricaFaturaEmDia();
        Cidadao cidadao = new Cidadao(fabrica);
        assertEquals("Histórico de Faturas em dia", cidadao.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoFaturaAtrasada() {
        FabricaAbstrata fabrica = new FabricaFaturaAtrasada();
        Cidadao cidadao = new Cidadao(fabrica);
        assertEquals("Histórico de Faturas atrasadas", cidadao.emitirHistorico());
    }

    @Test
    void deveEmitirFaturaEmDia() {
        FabricaAbstrata fabrica = new FabricaFaturaEmDia();
        Cidadao cidadao = new Cidadao(fabrica);
        assertEquals("Fatura em dia", cidadao.emitirFatura());
    }

    @Test
    void deveEmitirFaturaAtrasada() {
        FabricaAbstrata fabrica = new FabricaFaturaAtrasada();
        Cidadao cidadao = new Cidadao(fabrica);
        assertEquals("Fatura atrasada", cidadao.emitirFatura());
    }

}