package br.com.alura.microservice.provider.service;

import br.com.alura.microservice.provider.dto.provider.ProviderInfoResponseDto;

public interface InfoService {
    ProviderInfoResponseDto getInfoByState(String state);
}
