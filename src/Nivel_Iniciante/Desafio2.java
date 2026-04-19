package Nivel_Iniciante;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        String[] nomeNinja = new String[3];
        int qtd = 0;
        int op = 0;
        Scanner ler = new Scanner(System.in);


  while (op != 3) {
      System.out.println("\n===== Menu Ninja =====");
      System.out.println("1. Cadastrar Ninja");
      System.out.println("2. Listar Ninjas");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");

      op = ler.nextInt();
      ler.nextLine();
      switch (op) {
          case 1:
              if(qtd<nomeNinja.length) {
                  System.out.println("Digite o nome do ninja");
                  nomeNinja[qtd] = ler.nextLine();
                  System.out.println("Ninja cadastrado com sucesso!");
                  qtd++;
                  break;
              }else {
                  System.out.println("Aldeia já tem muitos ninjas");
                  break;
              }

          case 2:
              System.out.println("=======Lista de Ninjas======");
              for(int i=0; i<nomeNinja.length; i++) {
                  if(nomeNinja[i] != null) {
                  System.out.println(nomeNinja[i]);

                  }
              }
              break;
          case 3:
              break;

          default:
                  System.out.println("Escolha uma opcao disponivel");
                  break;
      }
  }
    }
}
