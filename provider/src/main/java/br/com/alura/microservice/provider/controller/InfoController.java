package br.com.alura.microservice.provider.controller;

import br.com.alura.microservice.provider.dto.provider.ProviderInfoResponseDto;
import br.com.alura.microservice.provider.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/{state}")
    public ProviderInfoResponseDto getInfoByState(@PathVariable String state) {
        return infoService.getInfoByState(state);
    }

}
