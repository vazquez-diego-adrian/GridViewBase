package avd.itics.tesoem.edu.gridviewbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;
    contenido contenido;
    ArrayList<String> arreglo = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gvdatos = findViewById(R.id.gvcontenedor);
        arreglo.add("Fernando");
        arreglo.add("Francisco");
        arreglo.add("Saúl");
        arreglo.add("Guadalupe");
        arreglo.add("Roberto");
        arreglo.add("Angel");
        arreglo.add("Sabino");
        arreglo.add("Julissa");
        arreglo.add("Alma");
        arreglo.add("Alicia");
        arreglo.add("Joel");

        contenido = new contenido(this, arreglo);
        gvdatos.setAdapter(contenido);
    }
}
