package com.gioyisfrases.frases.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Actors") String actor
        ) {
}
