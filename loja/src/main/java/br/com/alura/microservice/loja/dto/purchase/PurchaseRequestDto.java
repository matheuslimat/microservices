package br.com.alura.microservice.loja.dto.purchase;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PurchaseRequestDto {

    private List<ItemPurchaseRequestDto> itens;

    private AddressRequestDto address;

}
