package com.nilmitsug.restapi.core.ports.in.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ItemEstoque {

    private Long id;
    private String nome;
    private Date data_cadastro;
    private Long quantidade;
    private BigDecimal valor;
}
