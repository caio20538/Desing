package com.dio.desingPatterns.facede.subsistemaExterno2;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
    }

    public static CepAPI getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Sobradinho";
    }

    public String recuperarEstado(String cep){
        return "DF";
    }
}
