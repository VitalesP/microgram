package com.microgram.home51lesson02.controller;

import com.microgram.home51lesson02.DTO.PublicationDto;
import com.microgram.home51lesson02.service.PublicationService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/publication")
public class PublicationController {
    private final PublicationService publicationService;


    public PublicationController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }

    @ApiPageable
    @GetMapping
    public Slice<PublicationDto> findPublication(@ApiIgnore Pageable pageable) {
        return publicationService.findMovies(pageable);
    }
}
