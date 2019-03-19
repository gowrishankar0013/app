package org.aws.samples.greeting.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

   @RequestMapping("/hello")
    public String sayHello() {
       return "Hello";
   }
}
