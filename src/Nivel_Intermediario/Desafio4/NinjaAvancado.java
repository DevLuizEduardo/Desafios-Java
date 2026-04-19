package Nivel_Intermediario.Desafio4;

public class NinjaAvancado implements Ninja {
    String nome;
    int idade;
    TipoHabilidade tipoHabilidade;
    String especialidade;


    public NinjaAvancado(String nome, int idade,TipoHabilidade tipoHabilidade,String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
        this.especialidade = especialidade;

    }

    public NinjaAvancado() {
    }

    @Override
    public void mostrarInformacoes() {

        System.out.println("================================"+"\n"+
                            "Nome : "+this.nome+"\n"+
                           "Idade : "+this.idade+"\n"+
                            "Habilidate : "+this.tipoHabilidade+"\n"+
                            "Especialidade : "+this.especialidade
                );

    }

    @Override
    public void executarHabilidade() {

        System.out.println(this.especialidade+" foi executado com sucesso!!");

    }
}
