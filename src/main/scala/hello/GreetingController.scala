package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
 class GreetingController {

    @RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
    def greeting():String ={
        "Hello World from Spring Boot Scala";
    }
}