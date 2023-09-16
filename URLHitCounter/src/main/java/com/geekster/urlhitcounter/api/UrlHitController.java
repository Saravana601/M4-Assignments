package com.geekster.urlhitcounter.api;

import com.geekster.urlhitcounter.Model.UrlHitResponse;
import com.geekster.urlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    UrlHitService urlHitService;

    @GetMapping("count")
    public String getHitCount(){
       return "visitors: " + urlHitService.hitCount();
    }
    @GetMapping("username/{userName}/count")
    public ResponseEntity<UrlHitResponse> hitCountWithUserName(@PathVariable String userName){
        long hitCount = urlHitService.hitCount();
        UrlHitResponse response = new UrlHitResponse(userName,hitCount);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
