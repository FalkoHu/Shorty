package com.shorty.urlshorter.controller;

import com.shorty.urlshorter.model.UrlInfoResponse;
import com.shorty.urlshorter.model.UrlShortenerRequest;
import com.shorty.urlshorter.service.UrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url")
@Slf4j
public class UrlController {

    private UrlService urlService;

    @Autowired
    public UrlController(UrlService urlService){
        this.urlService = urlService;
    }

    @GetMapping("/getinfo/{urlName}")
    public UrlInfoResponse getShortenedUrlInfoResponse(){
        return null;
    }

    @PostMapping("/createShortUrl")
    public UrlShortenerRequest createShortUrl(UrlShortenerRequest urlShortenerRequest){
        return urlService.createNewShortUrl(urlShortenerRequest);
    }


}
