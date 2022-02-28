package br.com.alura.microservice.loja.dto.purchase;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemPurchaseRequestDto {

    private Long id;

    private Integer quantity;

}
