package com.company;

public class AnimaisDomesticos {

    private final float numeroPaciente;
    private final String especie;
    private final String raca;
    private final String  cor;
    private final String dataNascimento;
    private final String nome;

    public AnimaisDomesticos(float numeroPaciente, String especie, String raca, String cor, String dataNascimento, String nome) {
        this.numeroPaciente = numeroPaciente;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal Domestico -- " +
                "numero do Paciente = " + numeroPaciente +
                " - especie = " + especie +
                " - raça = " + raca +
                " - cor = " + cor +
                " \n                  -- Data de nascimento = " + dataNascimento +
                " - nome = " + nome;
    }
}
