package com.gioyisfrases.frases.principal;

import com.gioyisfrases.frases.model.DatosSerie;
import com.gioyisfrases.frases.service.ConsumoAPI;
import com.gioyisfrases.frases.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    // Enlace API
    private final String URL_BASE = System.getenv("URL_BASE");
    private final String API_KEY = System.getenv("API_KEY");

    public void muestraMenu() {
        System.out.println("Ingrese el nombre de la serie: ");
        var serie = teclado.nextLine();

        var json = consumoAPI.obtenerDatos(URL_BASE + serie.replace(" ", "+") + API_KEY);
        System.out.println(URL_BASE + serie.replace(" ", "+") + API_KEY);
        System.out.println(json);
        var datos = convierteDatos.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);
    }
}
