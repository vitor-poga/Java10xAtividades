package atividade03;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maximoCadastros = 10;

        // Criando um array com objeto
        Ninja[] ninja = new Ninja[maximoCadastros];

        int opcaoMenu = 0;
        int numDeCadastros = 0;
        int posicao = 0 ;
        int opcaoCla = 0;

        while (opcaoMenu != 4) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Remover Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoMenu){
                case 1:
                     if (numDeCadastros < maximoCadastros){


                         System.out.println("Seu Ninja faz parte de alguns desses Clãs ?");
                         System.out.println("1. Uzumaki");
                         System.out.println("2. Uchiha");
                         System.out.println("3. Hyuga");
                         System.out.println("4. Nenhum desses");
                         opcaoCla = scanner.nextInt();
                         scanner.nextLine();

                         switch (opcaoCla) {
                             case 1:

                                 Uzumaki novoUzumaki = new Uzumaki();

                                 System.out.print("Digite aqui o nome do Ninja que você quer cadastrar: ");
                                 novoUzumaki.nome = scanner.nextLine();
                                 System.out.print("Digite aqui a idade do Ninja: ");
                                 novoUzumaki.idade = scanner.nextInt();
                                 scanner.nextLine();
                                 System.out.print("Digite aqui a missão do Ninja: ");
                                 novoUzumaki.missao = scanner.nextLine();
                                 System.out.print("Digite aqui a dificuldade da missão do Ninja: ");
                                 novoUzumaki.dificuldadeMissao = scanner.nextLine();
                                 System.out.print("Digite aqui o status da missao do Ninja: ");
                                 novoUzumaki.statusDaMissao = scanner.nextLine();
                                 novoUzumaki.habilidadeEspecial = "Chakra infinito";

                                 ninja[numDeCadastros] = novoUzumaki; // Armazenar no array

                                 numDeCadastros++;
                                 System.out.println("Ninja cadastrado com sucesso!");
                                 break;
                             case 2:

                                 Uchiha novoUchiha = new Uchiha();

                                 System.out.print("Digite aqui o nome do Ninja que você quer cadastrar: ");
                                 novoUchiha.nome = scanner.nextLine();
                                 System.out.print("Digite aqui a idade do Ninja: ");
                                 novoUchiha.idade = scanner.nextInt();
                                 scanner.nextLine();
                                 System.out.print("Digite aqui a missão do Ninja: ");
                                 novoUchiha.missao = scanner.nextLine();
                                 System.out.print("Digite aqui a dificuldade da missão do Ninja: ");
                                 novoUchiha.dificuldadeMissao = scanner.nextLine();
                                 System.out.print("Digite aqui o status da missao do Ninja: ");
                                 novoUchiha.statusDaMissao = scanner.nextLine();
                                 novoUchiha.habilidadeEspecial = "Sharingan";

                                 ninja[numDeCadastros] = novoUchiha; // Armazenar no array

                                 numDeCadastros++;
                                 System.out.println("Ninja cadastrado com sucesso!");
                                 break;
                             case 3:

                                 Hyuga novoHyuga = new Hyuga();

                                 System.out.print("Digite aqui o nome do Ninja que você quer cadastrar: ");
                                 novoHyuga.nome = scanner.nextLine();
                                 System.out.print("Digite aqui a idade do Ninja: ");
                                 novoHyuga.idade = scanner.nextInt();
                                 scanner.nextLine();
                                 System.out.print("Digite aqui a missão do Ninja: ");
                                 novoHyuga.missao = scanner.nextLine();
                                 System.out.print("Digite aqui a dificuldade da missão do Ninja: ");
                                 novoHyuga.dificuldadeMissao = scanner.nextLine();
                                 System.out.print("Digite aqui o status da missao do Ninja: ");
                                 novoHyuga.statusDaMissao = scanner.nextLine();
                                 novoHyuga.habilidadeEspecial = "Byakugan";

                                 ninja[numDeCadastros] = novoHyuga; // Armazenar no array

                                 numDeCadastros++;
                                 System.out.println("Ninja cadastrado com sucesso!");
                                 break;
                             case 4:

                                 Ninja novoNinja = new Ninja();

                                 System.out.print("Digite aqui o nome do Ninja que você quer cadastrar: ");
                                 novoNinja.nome = scanner.nextLine();
                                 System.out.print("Digite aqui a idade do Ninja: ");
                                 novoNinja.idade = scanner.nextInt();
                                 scanner.nextLine();
                                 System.out.print("Digite aqui a missão do Ninja: ");
                                 novoNinja.missao = scanner.nextLine();
                                 System.out.print("Digite aqui a dificuldade da missão do Ninja: ");
                                 novoNinja.dificuldadeMissao = scanner.nextLine();
                                 System.out.print("Digite aqui o status da missao do Ninja: ");
                                 novoNinja.statusDaMissao = scanner.nextLine();

                                 ninja[numDeCadastros] = novoNinja; // Armazenar no array

                                 numDeCadastros++;
                                 System.out.println("Ninja cadastrado com sucesso!");
                                 break;
                             default:
                                 System.out.println("Escolha uma opção válida");
                                 break;
                         }
                         } else {
                             System.out.println("Número máximo de cadastros atingido!");
                         }
                        break;
                case 2:
                    if (numDeCadastros > 0) {
                        System.out.println("\n===== Lista de Ninjas =====");
                        for (int i = 0; i < numDeCadastros; i++) {
                            System.out.println("\nNinja " + (i + 1) + ":");
                            ninja[i].mostrarInformacoes();
                        }
                    } else {
                        System.out.println("Nenhum ninja cadastrado.");
                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Encerrando aplicação, aguarde um instante...");
                    break;
                default:
                    System.out.println("Escolha uma opção válida por favor.");
            }



        }

        
    }

    
}
