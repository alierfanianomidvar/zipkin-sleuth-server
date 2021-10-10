package com.example.zipkinserver_1.api.src.controller;

import com.example.zipkinserver_1.api.src.util.helper.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zipkin")
public class ZipkinApiController {

    @RequestMapping(value = "/zipkin-server-2", method = RequestMethod.POST)
    public ResponseEntity save() {
        return ResponseHelper.response("a");
    }
}
