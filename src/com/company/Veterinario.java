package com.company;

public class Veterinario {

    private final String rg;
    private final String nome;
    private final String sobrenome;
    private final String numeroDeRegistro;
    private final String especialidade;

    public Veterinario(String rg, String nome, String sobrenome, String numeroDeRegistro, String especialidade) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroDeRegistro = numeroDeRegistro;
        this.especialidade = especialidade;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        return "Veterinario(a) " +
                "Rg = " + rg +
                " - Nome = " + nome +
                " - Sobrenome = " + sobrenome +
                " - Numero de registro = " + numeroDeRegistro +
                " - Especialidade = " + especialidade;
    }
}
