package com.dajesa.supermarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")

public class HolaMundoController {
    @GetMapping("/Hola")

    public String saludar(){
        return "Nunca Pares de Aprender! ";
    }
}
