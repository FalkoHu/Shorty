package com.shorty.urlshorter.repository;

import com.shorty.urlshorter.model.UrlShortenerRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDdRepository extends MongoRepository<UrlShortenerRequest, String> {

}
