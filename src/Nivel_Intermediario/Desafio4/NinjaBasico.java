package Nivel_Intermediario.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public NinjaBasico() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(
                "================================"+"\n"+
                "Nome : "+this.nome+"\n"+
                "Idade : "+this.idade+"\n"+
                "Habilidate : "+this.tipoHabilidade

        );

    }

    @Override
    public void executarHabilidade() {

        System.out.println(this.tipoHabilidade+" foi executado com sucesso!!");

    }
}
