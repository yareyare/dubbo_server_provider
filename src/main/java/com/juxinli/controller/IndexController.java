package com.juxinli.controller;

import com.juxinli.service.TestRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ivy on 2017/11/23.
 */
@RestController
@RequestMapping(value = "index")
public class IndexController {

    @Autowired
    private TestRegistryService testRegistryService;

    @RequestMapping("/hello")
    public String index(@RequestParam String param1){
        String name=testRegistryService.hello("zz");
        System.out.println("xx=="+name);
        return "";
    }


}
