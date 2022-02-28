package br.com.alura.microservice.loja.dto.purchase;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressRequestDto {

    private String Street;

    private Integer number;

    private String State;

}
