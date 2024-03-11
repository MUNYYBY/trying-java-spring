package com.logicleaps.javarestapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class GreetingsController {

    @RequestMapping("/GetGreetings")
    public String GetGreetings() {
        return new String("Hello world");
    }
    
    
    
}
