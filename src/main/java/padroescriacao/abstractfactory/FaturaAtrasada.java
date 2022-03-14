package padroescriacao.abstractfactory;

public class FaturaAtrasada implements Fatura {

    public String emitir() {
        return "Fatura atrasada";
    }
}
