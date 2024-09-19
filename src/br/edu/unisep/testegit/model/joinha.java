package br.edu.unisep.testegit.model;

public class joinha {
    private String nome;
    private int idade;
    private Boolean sexo;
    private int ano;

    public joinha(String nome, int idade, Boolean sexo, int ano) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.ano = ano;
    }

    public Boolean ligar(){
        return sexo;
    }
}
