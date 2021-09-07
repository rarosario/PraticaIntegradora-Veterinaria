package com.company;

public class Proprietario {

    private final int id;
    private final String nome;
    private final String sobrenome;
    private final String dataNascimento;
    private final String  endereco;
    private final String telefone_contato;

    public Proprietario(int id, String nome, String sobrenome, String dataNascimento, String endereco, String telefone_contato) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone_contato = telefone_contato;
    }

    @Override
    public String toString() {
        return "Proprietario -- " +
                "Id = " + id +
                " - Nome = " + nome +
                " - Sobrenome = " + sobrenome +
                " - Data de Nascimento = " + dataNascimento +
                " \n             -- Endereço = " + endereco +
                " - Telefone para contato = " + telefone_contato;
    }
}
