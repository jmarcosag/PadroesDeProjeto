package padroesestruturais.decorator;

public class CompeticaoTriathlon implements Competicao {

    public float limiteTempo;

    public CompeticaoTriathlon() {
    }

    public CompeticaoTriathlon(float limiteTempo) {
        this.limiteTempo = limiteTempo;
    }

    public float getLimiteTempo() {
        return limiteTempo;
    }

    public String getEstrutura() {
        return "ABC";
    }

}
