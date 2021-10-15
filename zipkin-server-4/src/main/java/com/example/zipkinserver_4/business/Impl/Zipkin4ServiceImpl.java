package com.example.zipkinserver_4.business.Impl;

import com.example.zipkinserver_4.business.Zipkin4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class Zipkin4ServiceImpl implements Zipkin4Service {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    private static final Logger LOG = Logger.getLogger(Zipkin4ServiceImpl.class.getName());

    @Override
    public String fourthZipkin() {
        LOG.info("Inside zipkinService 4..");
        String response = "Done !!";
        return response;
    }
}


