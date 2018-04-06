package com.service.csedemo.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-06T09:22:18.841Z")

@RestSchema(schemaId = "csedemo")
@RequestMapping(path = "/csedemo", produces = MediaType.APPLICATION_JSON)
public class CsedemoImpl {

    @Autowired
    private CsedemoDelegate userCsedemoDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCsedemoDelegate.helloworld(name);
    }

}
