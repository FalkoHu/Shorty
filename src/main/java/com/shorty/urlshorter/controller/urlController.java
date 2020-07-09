package com.shorty.urlshorter.controller;

import com.shorty.urlshorter.model.UrlInfoResponse;
import com.shorty.urlshorter.model.UrlShortenerRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url")
public class urlController {

    @GetMapping("/getinfo/{urlName}")
    public UrlInfoResponse getShortenedUrlInfoResponse(){
        return null;
    }

    @PostMapping("/createShortUrl")
    public String createShortUrl(UrlShortenerRequest urlShortenerRequest){
        return "Created";
    }

    
}
