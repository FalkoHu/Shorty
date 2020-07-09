package com.shorty.urlshorter.service;

import com.shorty.urlshorter.model.UrlShortenerRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UrlService {

    public String createNewShortUrl(UrlShortenerRequest urlShortenerRequest) {
        return "Hello";
    }
}
