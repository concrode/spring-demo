package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mydemo {

    @Autowired
    @Qualifier("FancyWriter")
    TextWriter tw;

    @RequestMapping("/mydemo")
    public String myDemo() {
        return tw.WriteText("mydemo");
    }
}
