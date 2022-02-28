package br.com.alura.microservice.loja.proxy;

import br.com.alura.microservice.loja.dto.provider.ProviderInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider")
public interface ProviderClient {

    @RequestMapping("/info/{state}")
    ProviderInfoDto getInfoByState(@PathVariable String state);

}
