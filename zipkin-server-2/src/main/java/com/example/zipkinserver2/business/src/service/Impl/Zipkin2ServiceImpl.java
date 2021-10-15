package com.example.zipkinserver2.business.src.service.Impl;

import com.example.zipkinserver2.business.src.service.Zipkin2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class Zipkin2ServiceImpl implements Zipkin2Service {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    private static final Logger LOG = Logger.getLogger(Zipkin2ServiceImpl.class.getName());


    @Override
    public String secondZipkin() {
        LOG.info("Inside zipkinService 2..");
        String response = (String) restTemplate.exchange("http://localhost:8083/zipkin/zipkin-server-3", HttpMethod.GET,
                null, new ParameterizedTypeReference<String>() {
                }).getBody();
        return response;
    }
}


