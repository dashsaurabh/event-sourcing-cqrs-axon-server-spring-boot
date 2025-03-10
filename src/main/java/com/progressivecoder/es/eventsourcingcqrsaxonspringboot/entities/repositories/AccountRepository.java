package com.progressivecoder.es.eventsourcingcqrsaxonspringboot.entities.repositories;

import com.progressivecoder.es.eventsourcingcqrsaxonspringboot.entities.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountNewRepository extends CrudRepository<AccountQueryEntity, String> {
}
