package com.gioyisfrases.frases.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record NombresActores(
        @JsonAlias("Actors") String actores
) {
}
