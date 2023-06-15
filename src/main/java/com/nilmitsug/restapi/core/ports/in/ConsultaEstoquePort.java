package com.nilmitsug.restapi.core.ports.in;

import com.nilmitsug.restapi.core.ports.in.dto.ItemEstoque;
import org.springframework.stereotype.Service;

public interface ConsultaEstoquePort {

    ItemEstoque consultarItemEstoque(String id5);
}
