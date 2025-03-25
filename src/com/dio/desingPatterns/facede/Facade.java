package com.dio.desingPatterns.facede;

import com.dio.desingPatterns.facede.subsistemaExterno1.CrmService;
import com.dio.desingPatterns.facede.subsistemaExterno2.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String CEP){
        String cidade = CepAPI.getInstance().recuperarCidade(CEP);
        String estado = CepAPI.getInstance().recuperarEstado(CEP);


        CrmService.gravar(nome, CEP, cidade, estado);
    }

}
