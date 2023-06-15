package com.nilmitsug.restapi.entrypoint.rest.dto;

import com.nilmitsug.restapi.entrypoint.rest.enums.Estado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Produtos {

    private String Nome;
    private BigDecimal valor;
    private Categoria categoria;
    private Estado estado;
}
