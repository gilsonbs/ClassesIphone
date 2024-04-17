package com.musica;

public class ReprodutorMusical {
    public void iniciandoReprodutorMusical(){
        tocar();
        pausar();
        selecionarMusica();
    }


    private void tocar() {
        System.out.println("Tocando a musica");
    }
    private void pausar() {
        System.out.println("Pausando Musica");
    }
    private void selecionarMusica() {
        System.out.println("Selecionando a Musica");
        System.out.println("-------------------------------");
    }

    //tocar, pausar, selecionarMusica
}
