package com.microservice.msavaliadorcredito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosAvalicao {

    private String cpf;
    private Long renda;
}
