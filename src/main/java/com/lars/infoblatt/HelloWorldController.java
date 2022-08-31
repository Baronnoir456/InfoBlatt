package com.lars.infoblatt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }
    //neuer end punkt soll html parametermitgebnen und anzahl der buschtaben des wortes ausdrucken falls kein parameter da gib: traurig zuruck

    //localhost:8080/counter?name=lars

    @GetMapping(path = "/counter")
    @ResponseBody
    public String getNameAndTheNumberOfCharacters(@RequestParam(required = false)String name){
        if(name == null){
            return " es gibt nichts zu sehen";
        }
        return "Der name ist: " + name + " und, "+ name.length()+" lang.";
    }
}
