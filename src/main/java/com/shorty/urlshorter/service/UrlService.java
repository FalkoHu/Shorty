package com.shorty.urlshorter.service;

import com.shorty.urlshorter.model.UrlShortenerRequest;
import com.shorty.urlshorter.repository.MongoDdRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UrlService {

    private MongoDdRepository mongoDdRepository;

    @Autowired
    public UrlService(MongoDdRepository mongoDdRepository) {
        this.mongoDdRepository = mongoDdRepository;
    }

    public UrlShortenerRequest createNewShortUrl(UrlShortenerRequest urlShortenerRequest){
        log.debug("createNewShortUrl called with : {}", urlShortenerRequest);
        return mongoDdRepository.save(urlShortenerRequest);
    }
}
