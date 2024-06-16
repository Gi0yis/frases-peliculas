package com.gioyisfrases.frases.service;

import com.gioyisfrases.frases.dto.FraseDTO;
import com.gioyisfrases.frases.model.FraseSerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseReposity fraseReposity;

    public FraseDTO obteneerFraseAleatorea() {
        FraseSerie fraseSerie = fraseReposity.obtenerFraseAleatorea();
        return new FraseDTO(fraseSerie.getTitulo(), fraseSerie.getFrase(), fraseSerie.getActor(), fraseSerie.getPoster());
    }
}
