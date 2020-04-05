package com.anfmsf.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.*;

//Controller
@RestController
public class HelloWorldController {
    //GET
    //URI - /hello-world"
    //method - "Hello World"
    @RequestMapping(method = RequestMethod.GET,path="/hello-world")
    //@GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }


    //hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }
}
