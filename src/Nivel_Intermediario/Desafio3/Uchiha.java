package Nivel_Intermediario.Desafio3;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial : "+this.habilidadeEspecial);
    }

    @Override
    public void mostratInformacoes() {
        super.mostratInformacoes();
        mostrarHabilidadeEspecial();

    }
}
