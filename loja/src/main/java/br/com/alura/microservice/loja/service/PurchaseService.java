package br.com.alura.microservice.loja.service;


import br.com.alura.microservice.loja.dto.purchase.PurchaseRequestDto;

public interface PurchaseService {

    public void makePurchase(PurchaseRequestDto purchaseDto);

}
