package br.com.alura.microservice.provider.repository;

import br.com.alura.microservice.provider.domain.ProviderInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<ProviderInfo, Long> {

    ProviderInfo findByState(String state);

}
