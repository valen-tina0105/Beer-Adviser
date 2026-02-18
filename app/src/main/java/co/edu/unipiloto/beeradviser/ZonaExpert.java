package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class ZonaExpert {
    public List<String> getEstaciones(String zona){

        List<String> estaciones = new ArrayList<>();

        switch(zona){

            case "Caribe":
                estaciones.add("Terpel Cartagena");
                estaciones.add("Primax Barranquilla");
                break;

            case "Andina":
                estaciones.add("Terpel Bogotá");
                estaciones.add("Texaco Medellín");
                break;

            case "Pacifica":
                estaciones.add("Primax Cali");
                break;

            case "Orinoquia":
                estaciones.add("Terpel Villavicencio");
                break;

            case "Amazonia":
                estaciones.add("Estación Leticia");
                break;
        }

        return estaciones;
    }
}
