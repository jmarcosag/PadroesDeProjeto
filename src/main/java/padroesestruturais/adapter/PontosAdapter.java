package padroesestruturais.adapter;

public class PontosAdapter extends PontosQuantidade {

    private IDesconto pontosQuantidade;

    public PontosAdapter(IDesconto pontosQuantidade) {
        this.pontosQuantidade = pontosQuantidade;
    }

    public String calcularDesconto() {
        if (this.getPontos() >= 9.0f)
            pontosQuantidade.setDesconto("A");
        else
            if (this.getPontos() >= 8.0f)
                pontosQuantidade.setDesconto("B");
            else
                if (this.getPontos() >= 7.0f)
                    pontosQuantidade.setDesconto("C");
                else
                    pontosQuantidade.setDesconto("D");
        return pontosQuantidade.getDesconto();
    }

    public void salvarDesconto() {
        if (pontosQuantidade.getDesconto().equals("A"))
            this.setPontos(9.0f);
        else
            if (pontosQuantidade.getDesconto().equals("B"))
                this.setPontos(8.0f);
            else
                if (pontosQuantidade.getDesconto().equals("C"))
                    this.setPontos(7.0f);
                else
                    this.setPontos(0.0f);
    }
}
