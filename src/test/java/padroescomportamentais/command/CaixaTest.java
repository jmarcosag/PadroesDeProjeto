package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaixaTest {

    Caixa caixa;
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        caixa = new Caixa();
        pedido = new Pedido(001, 20.0);
    }

    @Test
    public void deveAbrirPedido(){
        Tarefa abrirPedido = new AberturaPedido(pedido);
        caixa.executarTarefa(abrirPedido);

        assertEquals("pedido aberto", pedido.getSituacao());
    }

    @Test
    public void deveFecharPedido(){
        Tarefa fecharPedido = new FecharPedido(pedido);
        caixa.executarTarefa(fecharPedido);

        assertEquals("pedido fechado", pedido.getSituacao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Tarefa abrirPedido = new AberturaPedido(pedido);
        Tarefa fecharPedido = new FecharPedido(pedido);

        caixa.executarTarefa(abrirPedido);
        caixa.executarTarefa(fecharPedido);

        caixa.cancelarUltimaTarefa();

        assertEquals("pedido aberto", pedido.getSituacao());
    }




}
