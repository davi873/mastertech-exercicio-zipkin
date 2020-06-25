package com.mastertech.cep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@FeignClient(name = "cep", url = "https://viacep.com.br/ws")
public interface CepClient {
    @GetMapping("/{cep}/json")
    HashMap<String, Object> getAdressByCep(@PathVariable String cep);
}
