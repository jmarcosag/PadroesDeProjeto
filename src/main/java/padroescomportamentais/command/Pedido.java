package padroescomportamentais.command;

public class Pedido {

    private Integer id;
    private Double valor;
    private String situacao;

    public Pedido(Integer id, Double valor) {
        this.id = id;
        this.valor = valor;
    }

    public void abrirPedido() {
        this.situacao = "pedido aberto";
    }

    public void fecharPedido() {
        this.situacao = "pedido fechado";
    }

    public String getSituacao() {
        return situacao;
    }
}
