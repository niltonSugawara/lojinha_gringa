package com.nilmitsug.restapi.entrypoint.rest.resources;

import com.nilmitsug.restapi.entrypoint.rest.dto.Produtos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("loja")
public class LojaResource {

    @GetMapping("/listar-produtos")
    public ResponseEntity<String> ola(){
        return ResponseEntity.of(Optional.of("veio"));
    }
}
