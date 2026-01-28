package br.com.danubiobwm.controllers;

import br.com.danubiobwm.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello %s!";
    private final AtomicLong couter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "test") String name){
        return new Greeting(couter.incrementAndGet(), String.format(template, name));
    }
}
