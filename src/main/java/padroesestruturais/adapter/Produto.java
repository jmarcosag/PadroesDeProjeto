package padroesestruturais.adapter;

public class Produto {

    IDesconto desconto;
    PontosAdapter pontos;

    public Produto() {
        desconto = new DescontoBonus();
        pontos = new PontosAdapter(desconto);
    }

    public void setDesconto(String conceito) {
        desconto.setDesconto(conceito);
        pontos.salvarDesconto();
    }

    public String getDesconto() {
        return pontos.calcularDesconto();
    }

    public float getPontos() {
        return pontos.getPontos();
    }

}
