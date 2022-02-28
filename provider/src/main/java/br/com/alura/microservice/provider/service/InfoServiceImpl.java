package br.com.alura.microservice.provider.service;

import br.com.alura.microservice.provider.dto.provider.ProviderInfoResponseDto;
import br.com.alura.microservice.provider.mapper.ProviderInfoMapper;
import br.com.alura.microservice.provider.repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoServiceImpl implements InfoService {

    @Autowired
    private final InfoRepository infoRepository;

    private final ProviderInfoMapper providerInfoMapper;

    @Override
    public ProviderInfoResponseDto getInfoByState(String state) {
        var provider = infoRepository.findByState(state);
        return providerInfoMapper.createProviderInfo(provider);
    }
}
