package com.nilmitsug.restapi.entrypoint.rest.dto;

import com.nilmitsug.restapi.entrypoint.rest.enums.Tipo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Categoria {

    private Tipo tipo;
}
