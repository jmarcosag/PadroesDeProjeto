package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class ClienteTest {
    @Test
    void deveNotificarCliente() {
        Casaco casaco = new Casaco("Casaco Nike", "preto");
        Cliente cliente = new Cliente("Joao");
        cliente.listaDesejados(casaco);
        casaco.atualizarEstoque();
        assertEquals("Olá Joao, o produto Casaco Nike, cor preto, está disponível!", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        Casaco casaco = new Casaco("Casaco Nike", "azul");
        Cliente clienteMarco = new Cliente("Marco");
        clienteMarco.listaDesejados(casaco);
        Cliente clienteTadeu = new Cliente("Tadeu");
        clienteTadeu.listaDesejados(casaco);
        casaco.atualizarEstoque();
        assertEquals("Olá Marco, o produto Casaco Nike, cor azul, está disponível!", clienteMarco.getUltimaNotificacao());
        assertEquals("Olá Tadeu, o produto Casaco Nike, cor azul, está disponível!", clienteTadeu.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Casaco casaco = new Casaco("Casaco Nike", "branco");
        Cliente cliente = new Cliente("Vitor");
        casaco.atualizarEstoque();
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarApenasUmCliente() {
        Casaco casaco1 = new Casaco("Casaco Nike", "branco");
        Cliente clientePedro = new Cliente("Pedro");
        clientePedro.listaDesejados(casaco1);
        Casaco casaco2 = new Casaco("Casaco Taco", "azul");
        Cliente clienteAlberto = new Cliente("Alberto");
        clienteAlberto.listaDesejados(casaco2);
        casaco1.atualizarEstoque();
        assertEquals("Olá Pedro, o produto Casaco Nike, cor branco, está disponível!", clientePedro.getUltimaNotificacao());
        assertEquals(null, clienteAlberto.getUltimaNotificacao());
    }
}
