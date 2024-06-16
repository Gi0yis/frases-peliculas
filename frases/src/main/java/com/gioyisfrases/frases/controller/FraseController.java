package com.gioyisfrases.frases.controller;

import com.gioyisfrases.frases.dto.FraseDTO;
import com.gioyisfrases.frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService fraseService;

    @GetMapping("/series/frases")

    public FraseDTO obtenerFraseAleatorea() {
        return fraseService.obteneerFraseAleatorea();
    }
}
