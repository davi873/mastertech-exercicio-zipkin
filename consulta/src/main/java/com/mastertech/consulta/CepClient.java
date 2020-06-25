package com.mastertech.consulta;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@FeignClient(name = "cep" )
public interface CepClient {

    @GetMapping("/cep/{cep}")
    HashMap<String, Object> getCep(@PathVariable String cep);
}
