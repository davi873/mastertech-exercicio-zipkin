package com.mastertech.cep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CepController {

    @Autowired
    CepClient cepClient;


    @GetMapping("/cep/{cep}")
    private HashMap<String, Object> getAdressByCep(@PathVariable String cep){
        return cepClient.getAdressByCep(cep);
    }
}
