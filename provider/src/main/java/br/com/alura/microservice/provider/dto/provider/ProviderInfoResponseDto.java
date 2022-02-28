package br.com.alura.microservice.provider.dto.provider;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProviderInfoResponseDto {

    private Long id;

    private String name;

    private String state;

    private String address;

}
