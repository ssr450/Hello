package com.project.Hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class helloController {
    @GetMapping("/hello/{name}")
    public helloResponse helloparam(@PathVariable String name){
        return new helloResponse("hello,"+name);
    }
    @PostMapping("/hello")
    public helloResponse hellopost(@RequestBody String name){
        return  new helloResponse("Hello "+ name + "!");
    }
}
