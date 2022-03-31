package padroesestruturais.adapter;

public class DescontoBonus implements IDesconto {

    private String bonus;

    @Override
    public String getDesconto() {
        return this.bonus;
    }

    @Override
    public void setDesconto(String desconto) {
        this.bonus = desconto;
    }
}
