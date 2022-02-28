package br.com.alura.microservice.loja.dto.provider;

import lombok.Data;

@Data
public class ProviderInfoDto {

    private Long id;

    private String name;

    private String state;

    private String address;

}
