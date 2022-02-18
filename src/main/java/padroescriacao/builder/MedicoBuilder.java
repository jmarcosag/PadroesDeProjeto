package padroescriacao.builder;

import java.util.Date;

public class MedicoBuilder {

    private Medico medico;

    public MedicoBuilder() {
        medico = new Medico();
    }

    public Medico build() {
        if (medico.getCrm() == 0) {
            throw new IllegalArgumentException("CRM inválido");
        }
        if (medico.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return medico;
    }

    public MedicoBuilder setMatricula(int matricula) {
        medico.setCrm(matricula);
        return this;
    }

    public MedicoBuilder setNome(String nome) {
        medico.setNome(nome);
        return this;
    }

    public MedicoBuilder setDataNascimento(Date dataNascimento) {
        medico.setDataNascimento(dataNascimento);
        return this;
    }

    public MedicoBuilder setSobrenome(String sobrenome) {
        medico.setSobrenome(sobrenome);
        return this;
    }

    public MedicoBuilder setEspecializacao(String especializacao) {
        medico.setEspecializacao(especializacao);
        return this;
    }

    public MedicoBuilder setCpf(String cpf) {
        medico.setCpf(cpf);
        return this;
    }

    public MedicoBuilder setRg(String rg) {
        medico.setRg(rg);
        return this;
    }

    public MedicoBuilder setLocalDeTrabalho(String localDeTrabalho) {
        medico.setLocalDeTrabalho(localDeTrabalho);
        return this;
    }

    public MedicoBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        medico.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public MedicoBuilder setEnderecoNumero(int enderecoNumero) {
        medico.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public MedicoBuilder setEnderecoComplemento(String enderecoComplemento) {
        medico.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public MedicoBuilder setEnderecoBairro(String enderecoBairro) {
        medico.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public MedicoBuilder setEnderecoCidade(String enderecoCidade) {
        medico.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public MedicoBuilder setEnderecoUF(String enderecoUF) {
        medico.setEnderecoUF(enderecoUF);
        return this;
    }

    public MedicoBuilder setCep(String cep) {
        medico.setCep(cep);
        return this;
    }

    public MedicoBuilder setEmail(String email) {
        medico.setEmail(email);
        return this;
    }

    public MedicoBuilder setCelular(String celular) {
        medico.setCelular(celular);
        return this;
    }

}
