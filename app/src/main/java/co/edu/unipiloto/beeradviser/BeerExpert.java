package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color) {

        List<String> brands = new ArrayList<>();

        switch(color) {

            case "amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;

            case "dark":
                brands.add("Guinness");
                brands.add("Old Rasputin");
                break;

            case "light":
                brands.add("Bud Light");
                brands.add("Corona");
                break;

            case "brown":
                brands.add("Newcastle Brown Ale");
                break;
        }

        return brands;
    }

}
