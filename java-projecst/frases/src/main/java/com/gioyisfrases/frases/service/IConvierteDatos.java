package com.gioyisfrases.frases.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> tClass);
}
