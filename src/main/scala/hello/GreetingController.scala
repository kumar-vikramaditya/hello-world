package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class GreetingController {

    var template:String = "Hello, %s!";
    var counter:AtomicLong = new AtomicLong();

    @RequestMapping(Array("/"))
    def greeting(@RequestParam(value="name", defaultValue="Spring-Boot-Web") name:String):Greeting ={
        new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}