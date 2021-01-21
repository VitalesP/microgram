package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.Publication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends MongoRepository<Publication, String> {
    //список всех публикаций по ID подписок;
    //искать публикацию по ID

}
