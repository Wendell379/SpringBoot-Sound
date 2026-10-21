package com.senai.sound.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MusicaController {
    @GetMapping("musica")
    public String tocarMusicar(){
        return "Tocando: ( My name is )";
    }
}