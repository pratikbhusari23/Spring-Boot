package com.pb.hotel.communicator;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RatingServiceCommunicator {
    
    private final RestTemplate restTemplate;

    @Autowired
    public RatingServiceCommunicator(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate=restTemplateBuilder.build();
    }

    public long getRating(String id){
        String url="http://localhost:8081/rating/id/";

        //ResponseEntity<Long> response = restTemplate.getForEntity(url+id, Long.class);

        HttpEntity requestEntity = new HttpEntity(id);
        ResponseEntity<Long> response = restTemplate.exchange(url+id, HttpMethod.GET, requestEntity, Long.class);

        return response.getBody();
    
    }

    public void addRating(Map<String,Long> ratingMap) {

        String url="http://localhost:8081/rating/add";
        // restTemplate.postForObject(url, ratingMap, Object.class);

        
        HttpEntity requestEntity = new HttpEntity(ratingMap); 
        restTemplate.exchange(url , HttpMethod.POST, requestEntity, Object.class);
    }

    public void updateRating(Map<String,Long> ratingMap) {

        String url="http://localhost:8081/rating/update";
        
        HttpEntity requestEntity = new HttpEntity(ratingMap);
        restTemplate.exchange(url , HttpMethod.PUT, requestEntity, Object.class);
        
    }

    public void deleteRating(String id){

        String url = "http://localhost:8081/rating/id/";

        restTemplate.exchange(url+id, HttpMethod.DELETE, null, Object.class);
    }

}
