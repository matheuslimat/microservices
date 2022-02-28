package br.com.alura.microservice.loja.service;

import br.com.alura.microservice.loja.dto.provider.ProviderInfoDto;
import br.com.alura.microservice.loja.dto.purchase.PurchaseRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private RestTemplate client;

    @Autowired
    private DiscoveryClient eurekaClient;

    @Override
    public void makePurchase(PurchaseRequestDto purchase) {
        var exchange = client.exchange("http://provider/info/" + purchase.getAddress().getState(), HttpMethod.GET, null, ProviderInfoDto.class);
        System.out.println(Objects.requireNonNull(exchange.getBody()).getAddress());

        // pegando todas as instancias para ser exibidas!
        eurekaClient.getInstances("provider").forEach(provider -> {
            System.out.println("localhost:" + provider.getPort());
        });

    }
}
