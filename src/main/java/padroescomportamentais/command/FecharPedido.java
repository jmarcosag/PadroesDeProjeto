package padroescomportamentais.command;

public class FecharPedido implements  Tarefa {

    private Pedido pedido;

    public FecharPedido(Pedido pedido){
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.fecharPedido();
    }

    public void cancelar() {
        this.pedido.abrirPedido();
    }
}
