package padroesestruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class Atleta implements IAtleta {

    private Integer codigoInscricao;
    private String nome;
    private String cidade;
    private Float nota1;
    private Float nota2;

    public Atleta(int codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
        Atleta objeto = BD.getAluno(codigoInscricao);
        this.nome = objeto.nome;
        this.cidade = objeto.cidade;
        this.nota1 = objeto.nota1;
        this.nota2 = objeto.nota2;
    }

    public Atleta(Integer codigoInscricao, String nome, String cidade, Float nota1, Float nota2) {
        this.codigoInscricao = codigoInscricao;
        this.nome = nome;
        this.cidade = cidade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Integer getCodigoInscricao() {
        return codigoInscricao;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cidade);
    }

    @Override
    public List<Float> obterNotas(Funcionario funcionario) {
        return Arrays.asList(this.nota1, this.nota2);
    }
}
