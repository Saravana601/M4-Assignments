package com.geekster.urlhitcounter.service;

import org.springframework.stereotype.Component;

@Component
public class UrlHitService {
    private int count;

    public long hitCount() {
        return ++count;
    }
}
