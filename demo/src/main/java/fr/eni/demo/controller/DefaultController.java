package fr.eni.demo.controller;

import fr.eni.demo.bo.Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DefaultController {
    @GetMapping("/")
    public Info getInfo(){
        Info info = Info.builder()
                .name("Votre nom")
                .email("votreMail@campus-eni.fr")
                .Date(LocalDate.now())
                .build();
        return info;
    }
}
