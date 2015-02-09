package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class GreetingController {

    @RequestMapping(Array("/"))
    def greeting():String ={
        "Hello World from Spring Boot Scala";
    }
}