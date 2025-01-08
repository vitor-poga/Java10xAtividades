package atividade02;

import java.util.Scanner;

public class cadastroNinja {
    public static void main(String[] args) {
        //Inicializando Scanner
        Scanner scanner;
        scanner = new Scanner(System.in);

        int opcaoMenu = 0;
        int maximoCadastros = 10;
        String[] ninja = new String[maximoCadastros];
        int numDeCadastros = 0;
        int posicao = 0 ;

        while (opcaoMenu != 4) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Remover Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();



            switch (opcaoMenu) {
                case 1:
                    if (numDeCadastros < maximoCadastros) {
                        System.out.println("\n===== Cadastro Ninja =====");
                        System.out.print("Escreva aqui o nome do seu Ninja:");
                        String nomeNinja = scanner.nextLine();
                        ninja[numDeCadastros] = nomeNinja;
                        numDeCadastros++;
                        System.out.println("Ninja cadastrado com sucesso!");

                    } else {
                        System.out.println("Número máximo de cadastros atingido!");
                    }
                    break;
                case 2:
                    if (numDeCadastros == 0){
                        System.out.println("\nNenhum Ninja cadastrado até o momento!");
                        System.out.println("Voltando ao menu inicial...");
                    } else {
                        System.out.println("\n===== Ninjas Cadastrados =====");
                        for (int i = 0; i < ninja.length; ) {
                            System.out.println((ninja[i] != null ? ninja[i] : "Vazio"));
                            i++;
                        }
                    }
                    break;
                case 3:
                    if (numDeCadastros == 0){
                        System.out.println("Nenhum ninja foi cadastrado até o momento.");
                    } else {
                        System.out.println("\n===== Remover Ninja =====");
                        for (int i = 0; i < ninja.length; i++) {
                            posicao = i + 1;
                            System.out.println(posicao + " - " + (ninja[i] != null ? ninja[i] : "Vazio"));
                        }
                        System.out.print("Digite aqui o código do Ninja que você quer remover: ");
                        int remove = scanner.nextInt();
                        int removeIndex = remove -1;
                        if (ninja[removeIndex] == null) {
                            System.out.println("\nNão tem um Ninja cadastrado nessa posição, voltando ao menu inicial");
                        } else {
                            System.out.println("\nVocê tem certeza que quer deletar o Ninja " + ninja[removeIndex] + " da lista ?"  );
                            System.out.println("1 - SIM");
                            System.out.println("2 - NÃO");
                            System.out.print("Digite aqui: ");
                            int deleteOuNao = 0;
                            deleteOuNao = scanner.nextInt();
                            switch (deleteOuNao){
                                case 1:
                                    ninja[removeIndex] = null ;
                                    System.out.println("Ninja deletado com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("Operação cancelada, voltando ao menu inicial");
                                    break;
                                default:
                                    System.out.println("Digite uma opção válida");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Encerrando programa, aguarde um instante.");
                    break;
                default:
                    System.out.println("Escolha uma opção válida, por favor.");

            }
        }
    }
}
