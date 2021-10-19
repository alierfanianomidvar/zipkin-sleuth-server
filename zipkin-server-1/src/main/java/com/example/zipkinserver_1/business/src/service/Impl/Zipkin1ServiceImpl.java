package com.example.zipkinserver_1.business.src.service.Impl;

import com.example.zipkinserver_1.business.src.service.Zipkin1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class Zipkin1ServiceImpl implements Zipkin1Service {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    private static final Logger LOG = Logger.getLogger(Zipkin1ServiceImpl.class.getName());

    @Override
    public String firstZipkin() {
        LOG.info("Inside zipkinService 1..");
        String response = (String) restTemplate.exchange("http://localhost:8082/zipkin/zipkin-server-2", HttpMethod.GET,
                null, new ParameterizedTypeReference<String>() {
        }).getBody();
        return response;
    }

}
