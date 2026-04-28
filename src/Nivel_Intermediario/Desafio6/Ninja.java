package Nivel_Intermediario.Desafio6;

import java.util.Comparator;

public class Ninja  {
    private String nome;
    private int idade;
    private String vila;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public static Comparator<Ninja>ordenarPorIdade = Comparator.comparing(n->n.idade);

    public static Comparator<Ninja>ordenarPorNome = Comparator.comparing(n->n.nome);

    public static Comparator<Ninja>ordenarPorVila = Comparator.comparing(n->n.vila);
    @Override
    public String toString() {
        return             "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", vila='" + vila + '\'' +
                '}';
    }
}
