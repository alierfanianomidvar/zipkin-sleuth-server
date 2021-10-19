package com.example.zipkinserver_1.api.src.controller;

import com.example.zipkinserver_1.api.src.util.helper.ResponseHelper;
import com.example.zipkinserver_1.business.src.service.Zipkin1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zipkin")
public class ZipkinApiController {

    @Autowired
    private Zipkin1Service zipkin1Service;

    @RequestMapping(value = "/zipkin-server-1", method = RequestMethod.GET)
    public ResponseEntity save() {
        return ResponseHelper.response(zipkin1Service.firstZipkin());
    }
}
