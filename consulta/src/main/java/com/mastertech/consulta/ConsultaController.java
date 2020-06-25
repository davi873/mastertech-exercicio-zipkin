package com.mastertech.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ConsultaController {

    @Autowired
    CepClient cepClient;

    @GetMapping("/endereco/{nome}/{cep}")
    private HashMap<String, Object> getEndereco(@PathVariable String nome, @PathVariable String cep){

        HashMap<String, Object> cepReuslt = cepClient.getCep(cep);

        HashMap<String, Object> mapResult = new HashMap();
        mapResult.put("nome", nome);
        mapResult.put("endereco",cepReuslt);

        return mapResult;
    }
}
