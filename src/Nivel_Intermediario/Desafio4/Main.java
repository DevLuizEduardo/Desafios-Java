package Nivel_Intermediario.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaAvancado kakashi = new NinjaAvancado("Kakashi",35,TipoHabilidade.GENJUTSU,"Jutsu Copiador");

        kakashi.mostrarInformacoes();
        kakashi.executarHabilidade();

        NinjaBasico rockLee = new NinjaBasico("Rock Lee",16,TipoHabilidade.TAIJUTSU);
        rockLee.mostrarInformacoes();
        rockLee.executarHabilidade();

    }
}
