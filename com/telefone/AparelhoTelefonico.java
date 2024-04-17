package com.telefone;

public class AparelhoTelefonico {
    public void iniciandoAparelhoTelefonico(){
        ligar();
        atender();
        iniciarCorreioVoz();
    }
    //ligar, atender, iniciarCorreioVoz
    private void ligar(){
        System.out.println("Fazendo Ligação");
    }
    private void atender(){
        System.out.println("Atendendo Ligação");
    }
    private void iniciarCorreioVoz(){
        System.out.println("Consultando correio de voz");
        System.out.println("---------------------------------");
    }
}
