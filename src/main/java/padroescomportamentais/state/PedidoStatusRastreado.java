package padroescomportamentais.state;

public class PedidoStatusRastreado implements PedidoStatus{

    private PedidoStatusRastreado() {};
    private static PedidoStatusRastreado instance = new PedidoStatusRastreado();
    public static PedidoStatusRastreado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido foi rastreado";
    }

    @Override
    public String enviado(Pedido pedido) {
        return "Pedido enviado";
    }

    @Override
    public String coletado(Pedido pedido) {
        pedido.setEstado(PedidoStatusRastreado.getInstance());
        return "Pedido coletado";
    }

    @Override
    public String emTransito(Pedido pedido) {
        return "Pedido em trânsito";
    }

    @Override
    public String cancelado(Pedido pedido) {
        pedido.setEstado(PedidoStatusRastreado.getInstance());
        return "Pedido cancelado";
    }

    @Override
    public String extraviado(Pedido pedido) {
        pedido.setEstado(PedidoStatusRastreado.getInstance());
        return "Pedido extraviado";
    }

    @Override
    public String entregue(Pedido pedido) {
        pedido.setEstado(PedidoStatusRastreado.getInstance());
        return "Pedido entregue";
    }
}
