package com.navegador;

public class NavegadorInternet {
    public void Internet(){
        exibirPagina();
        adicionarNovaAba();
        atualizarPagina();
    }
    //exibirPagina, adicionarNovaAba, atualizarPagina
    private void exibirPagina(){
        System.out.println("Abrindo página web https://www.google.com");
    }
    private void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    private void atualizarPagina(){
        System.out.println("Atualizando página");
        System.out.println("---------------------------------");
    }
}
