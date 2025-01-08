package atividade01;

public class cadastroNinja {
    public static void main(String[] args) {

        // Criando o Ninja 1 (Naruto)
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 16;
        String nomeMissaoNinja1 = "Caçando a akatsuki";
        char dificuldadeMissaoNinja1 = 'S';
        String statusMissaoNinja1 = "";

        // Criando o Ninja 2 (Sasuke)
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 14;
        String nomeMissaoNinja2 = "Assassinar Itachi Uchiha ";
        char dificuldadeMissaoNinja2 = 'S';
        String statusMissaoNinja2 ="";

        // Criando o Ninja 3 (Sakura)
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 14;
        String nomeMissaoNinja3 = "Expulsando pombos";
        char dificuldadeMissaoNinja3 ='D' ;
        String statusMissaoNinja3 = "";

        //Condição para  status da missão

        if (idadeNinja1 >= 15 ){
            statusMissaoNinja1 = "Concluída";
        } else if (idadeNinja1 <15 && dificuldadeMissaoNinja1 == 'C' || dificuldadeMissaoNinja1 == 'D' ) {
            statusMissaoNinja1 = "Concluída";
        } else {
            statusMissaoNinja1 = "Missão fracassada!";
        }

        if (idadeNinja2 >= 15 ){
            statusMissaoNinja2 = "Concluída";
        } else if (idadeNinja2 <15 && dificuldadeMissaoNinja2 == 'C' || dificuldadeMissaoNinja2 == 'D' ) {
            statusMissaoNinja2 = "Concluída";
        } else {
            statusMissaoNinja2 = "Missão fracassada!";
        }


        if (idadeNinja3 >= 15 ){
            statusMissaoNinja3 = "Concluída";
        } else if (idadeNinja3 <15 && dificuldadeMissaoNinja3 == 'C' || dificuldadeMissaoNinja3 == 'D' ) {
            statusMissaoNinja3 = "Concluída";
        } else {
            statusMissaoNinja3 = "Missão fracassada!";
        }

        //Imprimindo os dados
        System.out.println("----------------------------------------------------");
        System.out.println("Nome do Ninja: " + nomeNinja1);
        System.out.println("Idade do Ninja: " + idadeNinja1);
        System.out.println("Missão: " + nomeMissaoNinja1);
        System.out.println("Dificuldade da Missão: " + dificuldadeMissaoNinja1);
        System.out.println("Status da Missão: " + statusMissaoNinja1);
        System.out.println("----------------------------------------------------");

        System.out.println("----------------------------------------------------");
        System.out.println("Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade do Ninja: " + idadeNinja2);
        System.out.println("Missão: " + nomeMissaoNinja2);
        System.out.println("Dificuldade da Missão: " + dificuldadeMissaoNinja2);
        System.out.println("Status da Missão: " + statusMissaoNinja2);
        System.out.println("----------------------------------------------------");

        System.out.println("----------------------------------------------------");
        System.out.println("Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade do Ninja: " + idadeNinja3);
        System.out.println("Missão: " + nomeMissaoNinja3);
        System.out.println("Dificuldade da Missão: " + dificuldadeMissaoNinja3);
        System.out.println("Status da Missão: " + statusMissaoNinja3);
        System.out.println("----------------------------------------------------");
    }
}
