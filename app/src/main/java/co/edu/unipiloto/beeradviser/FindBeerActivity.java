package co.edu.unipiloto.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

    }

    public void onClickFindBeer(View view){
        TextView brands =  (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        brands.setText(beerType);
        BeerExpert expert = new BeerExpert();

        List<String> brandList = expert.getBrands(beerType);

        StringBuilder formattedBrands = new StringBuilder();

        for(String brand : brandList) {

            formattedBrands.append(brand).append("\n");

        }

        brands.setText(formattedBrands);
    }

    public void onClickBuscar(View view){

        TextView resultado = findViewById(R.id.resultado);

        Spinner zonaSpinner = findViewById(R.id.zona);

        String zonaSeleccionada =
                String.valueOf(zonaSpinner.getSelectedItem());

        ZonaExpert expert = new ZonaExpert();

        List<String> lista =
                expert.getEstaciones(zonaSeleccionada);

        StringBuilder texto = new StringBuilder();

        for(String estacion : lista){
            texto.append(estacion).append("\n");
        }

        resultado.setText(texto);
    }

}