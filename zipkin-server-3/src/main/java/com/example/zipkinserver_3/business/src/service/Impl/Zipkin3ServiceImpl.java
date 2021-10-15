package com.example.zipkinserver_3.business.src.service.Impl;

import com.example.zipkinserver_3.business.src.service.Zipkin3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class Zipkin3ServiceImpl implements Zipkin3Service {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    private static final Logger LOG = Logger.getLogger(Zipkin3ServiceImpl.class.getName());


    @Override
    public String thirdZipkin() {
        LOG.info("Inside zipkinService 3..");
        String response = (String) restTemplate.exchange("http://localhost:8083/zipkin/zipkin-server-4", HttpMethod.GET,
                null, new ParameterizedTypeReference<String>() {
                }).getBody();
        return response;
    }
}


