package Nivel_Iniciante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio1 {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto";
        int idade = 14;
        String missao = "Tirar gato da arvore";
        char dificulade = 'A';
        boolean concluido = false;

            System.out.println("Nome: " + nomeNinja1);
            System.out.println("Idade: " + idade);
            System.out.println("Missao: " + missao);
            System.out.println("Dificulade: " + dificulade);

        if (idade >= 15 ) {
            System.out.println("Status de conclusao: " + concluido);
        }else if(dificulade =='A' || dificulade =='B') {

            System.out.println("Idade não permite participar da missao");
        }else {
            System.out.println("Status de conclusao: " + concluido);
        }
            System.out.println("=========================================");

        String nomeNinja2 = "Sakura";
        int idade2 = 16;
        String missao2 = "Tirar gato da arvore";
        char dificulade2 = 'D';
        boolean concluido2 = false;

            System.out.println("Nome: " + nomeNinja2);
            System.out.println("Idade: " + idade2);
            System.out.println("Missao: " + missao2);
            System.out.println("Dificulade: " + dificulade2);
            System.out.println("Status de conclusao: " + concluido2);
            System.out.println("=========================================");


        String nomeNinja3 = "Sasuke";
        int idade3 = 16;
        String missao3 = "Tirar gato da arvore";
        char dificulade3 = 'D';
        boolean concluido3 = false;

            System.out.println("Nome: " + nomeNinja3);
            System.out.println("Idade: " + idade3);
            System.out.println("Missao: " + missao3);
            System.out.println("Dificulade: " + dificulade3);
            System.out.println("Status de conclusao: " + concluido3);
            System.out.println("=========================================");


    }
}