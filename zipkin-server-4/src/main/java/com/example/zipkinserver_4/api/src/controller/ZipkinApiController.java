package com.example.zipkinserver_4.api.src.controller;


import com.example.zipkinserver_4.api.src.util.helper.ResponseHelper;
import com.example.zipkinserver_4.business.Zipkin4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zipkin")
public class ZipkinApiController {

    @Autowired
    private Zipkin4Service zipkin3Service;

    @RequestMapping(value = "/zipkin-server-۴", method = RequestMethod.POST)
    public ResponseEntity save() {
        return ResponseHelper.response(zipkin3Service.fourthZipkin());
    }

}
