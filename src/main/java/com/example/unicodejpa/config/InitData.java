package com.example.unicodejpa.config;

import com.example.unicodejpa.model.Unicode;
import com.example.unicodejpa.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {

        //Skriver hver glyf der er tilhørende til en unicode
        //591 er alle latinske glyffer
        //0x10FFFF eller 1114111 er det højeste unicode nummer, men slet ikke alle har en tilhørende glyf
        for (int i = 0; i < 591; i++) {
            char c= (char)i;
            Unicode unicode = new Unicode();
            unicode.setUnicode(i);
            unicode.setGlyf(c);
            unicode.setDescription("Woaw det er jo min yndlings glyf: " + c);
            unicodeRepository.save(unicode);
        }
    }
}
