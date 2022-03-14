package padroescriacao.prototype;

public class Tipo implements Cloneable {
    private String descricao;
    private Integer codigotipo;

    public Tipo(String descricao, Integer codigotipo) {
        super();
        this.descricao = descricao;
        this.codigotipo = codigotipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigotipo() {
        return codigotipo;
    }

    public void setCodigotipo(Integer codigotipo) {
        this.codigotipo = codigotipo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "descricao='" + descricao + '\'' +
                ", codigotipo=" + codigotipo +
                '}';
    }
}
