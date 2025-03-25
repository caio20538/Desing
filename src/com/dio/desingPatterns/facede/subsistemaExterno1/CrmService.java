package com.dio.desingPatterns.facede.subsistemaExterno1;

public class CrmService {

    private CrmService() {
    }

    public static void gravar(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema do CRM.");
        System.out.println("Clienete " +nome + " CEP " +cep + " Cidade " + cidade + " Estado " +estado);
    }

}
