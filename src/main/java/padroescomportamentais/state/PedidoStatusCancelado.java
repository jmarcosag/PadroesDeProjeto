package padroescomportamentais.state;

public class PedidoStatusCancelado implements PedidoStatus{

    private PedidoStatusCancelado() {};
    private static PedidoStatusCancelado instance = new PedidoStatusCancelado();
    public static PedidoStatusCancelado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido cancelado";
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
        return "Pedido está em trânsito";
    }

    @Override
    public String cancelado(Pedido pedido) {
        pedido.setEstado(PedidoStatusRastreado.getInstance());
        return "Pedido cancelado";
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