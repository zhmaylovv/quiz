package ru.sbrf.javaquiz.handlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterHandler {

    @GetMapping("/hello")
    public String startHear() {
        return "Hello World";
    }
}
