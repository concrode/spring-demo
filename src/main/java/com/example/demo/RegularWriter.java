package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("RegularWriter")
public class RegularWriter implements TextWriter{

    @Override
    public String WriteText(String s) {
        return "This " + s + " is from Regular Writer".toUpperCase();
    }
}
