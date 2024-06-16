package com.gioyisfrases.frases.service;

import com.gioyisfrases.frases.dto.FraseDTO;
import com.gioyisfrases.frases.model.FraseSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseReposity extends JpaRepository<FraseSerie, Long> {
    @Query("SELECT f FROM FraseSerie  f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    public FraseSerie obtenerFraseAleatorea();
}
