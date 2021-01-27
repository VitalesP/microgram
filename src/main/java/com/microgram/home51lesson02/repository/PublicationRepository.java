package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.Publication;
import com.microgram.home51lesson02.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PublicationRepository extends MongoRepository<Publication, String> {
    //список всех публикаций по ID подписок;
    //искать публикацию по ID
    List<Publication> findByAuthor(User user);

}
