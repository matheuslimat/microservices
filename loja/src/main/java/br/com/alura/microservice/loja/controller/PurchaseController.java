package br.com.alura.microservice.loja.controller;

import br.com.alura.microservice.loja.dto.purchase.PurchaseRequestDto;
import br.com.alura.microservice.loja.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public void makesPurchase(@RequestBody PurchaseRequestDto purchaseDto) {
        purchaseService.makePurchase(purchaseDto);
    }
}
