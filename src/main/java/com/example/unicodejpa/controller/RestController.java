package com.example.unicodejpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    //Modtager et decimal/unicode og giver den tilsvarende char/glyf tilbage
    @GetMapping(path="/unicodeToChar/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i;
        return "unicode=" + i + " char=" + c;
    }

    //Modtager en char/glyf og giver den tilsvarende unicode/decimal tilbage
    @GetMapping(path="/charToUnicode/{c}")
    public String charToUnicode(@PathVariable char c) {
        int i = (int)c;
        return "char=" + c + " unicode=" + i;
    }

}
