package Nivel_Intermediario.Desafio3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Vetor para adicionar a referencia dos objetos em memoria
        Uchiha [] ninjas = new Uchiha[3];
        //Variaveis para Controlar vetor e armazenar a opcao do usuario
        int opcao = 0;
        int contador  = 0;


        while (opcao !=4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Alterar Habilidade de Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:
                    if (contador < ninjas.length) {
                        Uchiha novoNinja = new Uchiha();
                        System.out.println("Digite o nome do Ninja :");
                        novoNinja.nome = ler.nextLine();
                        System.out.println("Digite a idade : ");
                        novoNinja.idade = ler.nextInt();
                        ler.nextLine();
                        System.out.println("Digite a Missao :");
                        novoNinja.missao = ler.nextLine();
                        System.out.println("Digite o Nivel de Dificuldade da Missao : ");
                        novoNinja.nivelDificuldade = ler.nextLine();
                        System.out.println("Digite o Status Atual da Missao :");
                        novoNinja.statusMissao = ler.nextLine();
                        System.out.println("Digite a Habilidade Especial do Ninja :");
                        novoNinja.habilidadeEspecial = ler.nextLine();
                        System.out.println("Cadastro Realizado com sucesso!!");
                        ninjas[contador]=novoNinja;
                        contador++;

                    } else {
                        System.out.println("Impossivel Cadastrar Ninjas no Momento");
                    }
                    break;
                case 2:
                    if (contador == 0) {
                        System.out.println("Não tem Nenhum Ninja Cadastrado no Momento");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] != null) {
                                ninjas[i].mostratInformacoes();
                            }
                        }
                    }
                    break;
                case 3:
                    if (contador == 0) {
                        System.out.println("Não tem Nenhum Ninja Cadastrado no Momento");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] != null) {
                                System.out.println(i + "-" + ninjas[i].nome);
                            }
                        }
                        System.out.println("Digite o Numero do Ninja Para Alterar a Habilidade");
                        int num = ler.nextInt();
                        ler.nextLine();
                        System.out.println("Digite a Nova Habilidade :");
                        ninjas[num].habilidadeEspecial = ler.nextLine();
                        System.out.println("Habilidade Aterada Com Sucesso!!!");


                    }
                    break;
                case 4 :
                    break;
                default:
                    System.out.println("Escolha uma opcao disponivel");
                    break;


            }


        }
    }
}
