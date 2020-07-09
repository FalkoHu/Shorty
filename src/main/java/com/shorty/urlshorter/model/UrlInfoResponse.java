package com.shorty.urlshorter.model;

import lombok.Data;

@Data
public class UrlInfoResponse {

    private String shortenedName;
    private Integer numOfClicks;
    private String originalName;

}
