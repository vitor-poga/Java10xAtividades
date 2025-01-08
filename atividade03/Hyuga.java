package atividade03;

public class Hyuga extends Ninja{
    String habilidadeEspecial;

    public void MostrarHabilidadeEspecial(){
        System.out.println("Este Ninja possui a habilidade especial: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        MostrarHabilidadeEspecial();
    }
}
