package Nivel_Intermediario.Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostratInformacoes(){
        System.out.println("==========Dados Ninja=======");
        System.out.println("Nome : "+this.nome+"\n"+
                           "Idade : "+this.idade+"\n"+
                           "Missao : "+this.missao+"\n"+
                           "Nivel de Dificuldade : "+this.nivelDificuldade+"\n"+
                           "Status da Missao : "+this.statusMissao
                );

    }
}
