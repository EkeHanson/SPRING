package com.springboot.springbootserious;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    //Get HTTP method (http://localhost:8080/helloworld
    @GetMapping("/students/helloworld")
    public String helloWorld(){
        return  "Hello! what is the difference between the World and the Universe";
    }

    //Get
    //Post
    //Put
    //Delete
}
