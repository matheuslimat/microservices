package br.com.alura.microservice.loja.service;

import br.com.alura.microservice.loja.dto.purchase.PurchaseRequestDto;
import br.com.alura.microservice.loja.proxy.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private ProviderClient providerClient;

    @Override
    public void makePurchase(PurchaseRequestDto purchase) {
        var request = providerClient.getInfoByState(purchase.getAddress().getState());
        System.out.println(request.getAddress());
    }
}
