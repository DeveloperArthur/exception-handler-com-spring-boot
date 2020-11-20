package br.com.tratamentodeexception.arthur.dominio.cliente;

import br.com.tratamentodeexception.arthur.dominio.exception.cliente.CamposDeClienteObrigatoriosException;

public class Cliente {
    private String nome;
    private String email;
    private Integer idade;
    private Sexo sexo;

    public Cliente(String nome, String email, Integer idade, Sexo sexo) {
        if (nome == null || nome.isEmpty() || email == null || email.isEmpty())
            throw new CamposDeClienteObrigatoriosException();
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }

    public Sexo getSexo() {
        return sexo;
    }
}
