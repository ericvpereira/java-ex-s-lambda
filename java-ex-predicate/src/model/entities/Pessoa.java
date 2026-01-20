package model.entities;

public class Pessoa {

    private String nome;
    private int age;

    public Pessoa(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
