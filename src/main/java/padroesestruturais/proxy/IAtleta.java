package padroesestruturais.proxy;

import java.util.List;

public interface IAtleta {
    List<String> obterDadosPessoais();
    List<Float> obterNotas(Funcionario funcionario);
}
