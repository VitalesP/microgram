package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
    //список всех публикаций по ID подписок;
    //искать публикацию по ID

}
