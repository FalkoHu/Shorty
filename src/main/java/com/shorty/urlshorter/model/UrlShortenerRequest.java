package com.shorty.urlshorter.model;

import lombok.Data;

@Data
public class UrlShortenerRequest {

    private String originalUrl;
    private String shortenedUrl;

}
