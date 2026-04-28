package Nivel_Intermediario.Desafio6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> listDeNinjas = new LinkedList<>();
        int opcao = 0;
        Scanner ler = new Scanner(System.in);



        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));






        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Adicionar Novo Ninja no inicio");
            System.out.println("2. Exibir Lista de Ninjas");
            System.out.println("3. Exibir Ninja Pelo Indice");
            System.out.println("4.Reordenar a Lista");
            System.out.println("5.Remover Ninja pelo Indice");
            System.out.println("6.Remover Ninja do Inicio");
            System.out.println("7.Buscar Pelo Nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao){
                case 1 :
                    System.out.println("Digite o nome do Ninja:");
                    String nome = ler.nextLine();
                    System.out.println("Digite a Idade:");
                    int idade = ler.nextInt();;
                    ler.nextLine();
                    System.out.println("Digite a Vila de Origem :");
                    String vila = ler.nextLine();
                    listDeNinjas.addFirst(new Ninja(nome,idade,vila));
                    System.out.println("Ninja Adicionado com Sucesso!!");

                    break;
                case 2 :

                    System.out.println("================Lista de Ninjas Cadastrados================ ");
                      for (Ninja ninja : listDeNinjas){

                          System.out.println(ninja);
                      }
                      break;
                case 3:
                    System.out.println("Digite o Indice do Ninja Para Ser Exibido :");
                    int indice = ler.nextInt();
                    System.out.println(listDeNinjas.get(indice));
                    break;
                case 4:
                    System.out.println("Selecione o Tipo de Ordenacao da Lista");
                    System.out.println("Ordenar por :"+"\n"+"1.Nome"+"\n"+"2.Idade"+"\n"+"3.Vila");
                    int ordem = ler.nextInt();

                    switch (ordem){
                        case 1:
                            listDeNinjas.sort(Ninja.ordenarPorNome);
                            break;
                        case 2:
                            listDeNinjas.sort(Ninja.ordenarPorIdade);
                            break;
                        case 3:
                            listDeNinjas.sort(Ninja.ordenarPorVila);

                        default:
                            System.out.println("Opcao Invalida");
                    }

                    System.out.println("================Lista de Ninjas Cadastrados================ ");
                    for (Ninja ninja : listDeNinjas){
                        System.out.println(ninja);
                    }


                    break;

                case 5:
                    System.out.println("Digite o Indice para remover o ninja :");
                    int num = ler.nextInt();
                    ler.nextLine();
                    listDeNinjas.remove(num);
                    System.out.println("Ninja Removido com sucesso !!!");

                    System.out.println("===== Lista de Ninjas Atualizada =====");
                    for (Ninja ninja : listDeNinjas){
                        System.out.println(ninja);
                    }
                    break;
                case 6:
                    listDeNinjas.removeFirst();
                    System.out.println("Ninja Inicial removido com sucesso!!!");
                    System.out.println("===== Lista de Ninjas Atualizada =====");
                    for (Ninja ninja : listDeNinjas){
                        System.out.println(ninja);
                    }
                    break;

                case 7:
                    System.out.println("Digite o Nome do Nija que Deseja Buscar :");
                    String nomeBuscado = ler.nextLine();
                    for (Ninja ninja : listDeNinjas){
                        if (ninja.getNome().contains(nomeBuscado)){
                            System.out.println(ninja);
                            break;
                        }
                    }
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opcao Invalida");

            }

        } while (opcao != 0);

    }
}
