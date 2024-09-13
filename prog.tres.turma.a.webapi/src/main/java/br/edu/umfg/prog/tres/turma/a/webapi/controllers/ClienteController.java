package br.edu.umfg.prog.tres.turma.a.webapi.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @GetMapping
    public String get() {
        return "ok";
    }
}
