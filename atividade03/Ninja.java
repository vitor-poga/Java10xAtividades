package atividade03;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String dificuldadeMissao;
    String statusDaMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão atual: " + missao);
        System.out.println("Dificuldade da Missão: Nível " + dificuldadeMissao);
        System.out.println("Status da missão: " + statusDaMissao);
    }
}
