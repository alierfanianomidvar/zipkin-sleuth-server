package com.example.zipkinserver_2.api.src.controller;


import com.example.zipkinserver_2.api.src.util.helper.ResponseHelper;
import com.example.zipkinserver_2.business.src.service.Zipkin2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zipkin")
public class ZipkinApiController {

    @Autowired
    private Zipkin2Service zipkin2Service;

    @RequestMapping(value = "/zipkin-server-2", method = RequestMethod.GET)
    public ResponseEntity save() {
        return ResponseHelper.response(zipkin2Service.secondZipkin());
    }

}
