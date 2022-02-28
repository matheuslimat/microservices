package br.com.alura.microservice.provider.mapper;

import br.com.alura.microservice.provider.domain.ProviderInfo;
import br.com.alura.microservice.provider.dto.provider.ProviderInfoResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ProviderInfoMapper {

    public ProviderInfoResponseDto createProviderInfo(ProviderInfo providerInfo) {
        return ProviderInfoResponseDto.builder()
                .id(providerInfo.getId())
                .name(providerInfo.getName())
                .state(providerInfo.getState())
                .address(providerInfo.getAddress())
                .build();
    }
}
