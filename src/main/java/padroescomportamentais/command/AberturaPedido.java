package padroescomportamentais.command;

public class AberturaPedido implements  Tarefa {

    private Pedido pedido;

    public AberturaPedido(Pedido pedido){
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.abrirPedido();
    }

    public void cancelar() {
        this.pedido.fecharPedido();
    }
}
