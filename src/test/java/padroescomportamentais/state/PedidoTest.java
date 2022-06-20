package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    // Pedido coletado

    @Test
    public void deveRetornarPedidoColetadoEnviado() {
        pedido.setEstado(PedidoStatusColetado.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoColetado() {
        pedido.setEstado(PedidoStatusColetado.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void naoDeveRetornarPedidoColetadoEmTransito() {
        pedido.setEstado(PedidoStatusColetado.getInstance());
        assertEquals("Pedido não está em trânsito", pedido.emTransito());
    }

    @Test
    public void naoDeveRetornarPedidoColetadoCancelado() {
        pedido.setEstado(PedidoStatusColetado.getInstance());
        assertEquals("Pedido não cancelado", pedido.cancelado());
    }

    @Test
    public void naoDeveRetornarPedidoColetadoExtraviado() {
        pedido.setEstado(PedidoStatusColetado.getInstance());
        assertEquals("Pedido não extraviado", pedido.extraviado());
    }

    @Test
    public void naoDeveRetornarPedidoColetadoEntregue() {
        pedido.setEstado(PedidoStatusColetado.getInstance());
        assertEquals("Pedido não entregue", pedido.entregue());
    }

    // Pedido em trânsito

    @Test
    public void deveRetornarPedidoEmTransitoEnviado() {
        pedido.setEstado(PedidoStatusEmTransito.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoEmTransitoColetado() {
        pedido.setEstado(PedidoStatusEmTransito.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void deveRetornarPedidoEmTransito() {
        pedido.setEstado(PedidoStatusEmTransito.getInstance());
        assertEquals("Pedido está em trânsito", pedido.emTransito());
    }

    @Test
    public void naoDeveRetornarPedidoEmTransitoCancelado() {
        pedido.setEstado(PedidoStatusEmTransito.getInstance());
        assertEquals("Pedido não cancelado", pedido.cancelado());
    }

    @Test
    public void naoDeveRetornarPedidoEmTransitoExtraviado() {
        pedido.setEstado(PedidoStatusEmTransito.getInstance());
        assertEquals("Pedido não extraviado", pedido.extraviado());
    }

    @Test
    public void naoDeveRetornarPedidoEmTransitoEntregue() {
        pedido.setEstado(PedidoStatusEmTransito.getInstance());
        assertEquals("Pedido não entregue", pedido.entregue());
    }

    // Pedido cancelado

    @Test
    public void deveRetornarPedidoCanceladoEnviado() {
        pedido.setEstado(PedidoStatusCancelado.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoCanceladoColetado() {
        pedido.setEstado(PedidoStatusCancelado.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void deveRetornarPedidoCanceladoEmTransito() {
        pedido.setEstado(PedidoStatusCancelado.getInstance());
        assertEquals("Pedido está em trânsito", pedido.emTransito());
    }

    @Test
    public void deveRetornarPedidoCancelado() {
        pedido.setEstado(PedidoStatusCancelado.getInstance());
        assertEquals("Pedido cancelado", pedido.cancelado());
    }

    @Test
    public void naoDeveRetornarPedidoCanceladoExtraviado() {
        pedido.setEstado(PedidoStatusCancelado.getInstance());
        assertEquals("Pedido não extraviado", pedido.extraviado());
    }

    @Test
    public void naoDeveRetornarPedidoCanceladoEntregue() {
        pedido.setEstado(PedidoStatusCancelado.getInstance());
        assertEquals("Pedido não entregue", pedido.entregue());
    }

    // Pedido extraviado

    @Test
    public void deveRetornarPedidoExtraviadoEnviado() {
        pedido.setEstado(PedidoStatusExtraviado.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoExtraviadoColetado() {
        pedido.setEstado(PedidoStatusExtraviado.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void deveRetornarPedidoExtraviadoEmTransito() {
        pedido.setEstado(PedidoStatusExtraviado.getInstance());
        assertEquals("Pedido está em trânsito", pedido.emTransito());
    }

    @Test
    public void deveRetornarPedidoExtraviadoCancelado() {
        pedido.setEstado(PedidoStatusExtraviado.getInstance());
        assertEquals("Pedido cancelado", pedido.cancelado());
    }

    @Test
    public void deveRetornarPedidoExtraviado() {
        pedido.setEstado(PedidoStatusExtraviado.getInstance());
        assertEquals("Pedido extraviado", pedido.extraviado());
    }

    @Test
    public void naoDeveRetornarPedidoExtraviadoEntregue() {
        pedido.setEstado(PedidoStatusExtraviado.getInstance());
        assertEquals("Pedido não entregue", pedido.entregue());
    }

    // Pedido entregue

    @Test
    public void deveRetornarPedidoEntregueEnviado() {
        pedido.setEstado(PedidoStatusEntregue.getInstance());
        assertEquals("Pedido foi enviado", pedido.enviado());
    }

    @Test
    public void deveRetornarPedidoEntregueColetado() {
        pedido.setEstado(PedidoStatusEntregue.getInstance());
        assertEquals("Pedido foi coletado", pedido.coletado());
    }

    @Test
    public void deveRetornarPedidoEntregueEmTransito() {
        pedido.setEstado(PedidoStatusEntregue.getInstance());
        assertEquals("Pedido está em trânsito", pedido.emTransito());
    }

    @Test
    public void naoDeveRetornarPedidoEntregueCancelado() {
        pedido.setEstado(PedidoStatusEntregue.getInstance());
        assertEquals("Pedido não cancelado", pedido.cancelado());
    }

    @Test
    public void naoDeveRetornarPedidoEntregueExtraviado() {
        pedido.setEstado(PedidoStatusEntregue.getInstance());
        assertEquals("Pedido não extraviado", pedido.extraviado());
    }

    @Test
    public void deveRetornarPedidoEntregue() {
        pedido.setEstado(PedidoStatusEntregue.getInstance());
        assertEquals("Pedido entregue", pedido.entregue());
    }
}