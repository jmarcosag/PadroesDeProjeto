package padroescomportamentais.state;

public class PedidoStatusColetado implements PedidoStatus{

    private PedidoStatusColetado() {};
    private static PedidoStatusColetado instance = new PedidoStatusColetado();
    public static PedidoStatusColetado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido foi rastreado";
    }

    @Override
    public String enviado(Pedido pedido) {
        return "Pedido foi enviado";
    }

    @Override
    public String coletado(Pedido pedido) {
        pedido.setEstado(PedidoStatusRastreado.getInstance());
        return "Pedido foi coletado";
    }

    @Override
    public String emTransito(Pedido pedido) {
        return "Pedido não está em trânsito";
    }

    @Override
    public String cancelado(Pedido pedido) {
        pedido.setEstado(PedidoStatusRastreado.getInstance());
        return "Pedido não cancelado";
    }

    @Override
    public String extraviado(Pedido pedido) {
        pedido.setEstado(PedidoStatusRastreado.getInstance());
        return "Pedido não extraviado";
    }

    @Override
    public String entregue(Pedido pedido) {
        pedido.setEstado(PedidoStatusRastreado.getInstance());
        return "Pedido não entregue";
    }
}