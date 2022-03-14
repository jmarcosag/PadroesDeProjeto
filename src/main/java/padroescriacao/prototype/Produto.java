package padroescriacao.prototype;

public class Produto implements Cloneable {
    private int codigo;
    private String nome;
    private Tipo tipo;
    private String marca;

    public Produto(int codigo, String nome, Tipo tipo, String marca) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        produtoClone.tipo = (Tipo) produtoClone.tipo.clone();
        return produtoClone;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", marca='" + marca + '\'' +
                '}';
    }
}
