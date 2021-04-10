package com.example.myproyecto;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvItems = findViewById(R.id.lvItems);
        adaptador = new Adaptador(this, GetArrayItems());
        lvItems.setAdapter(adaptador);


    }

    private ArrayList<Entidad> GetArrayItems() {
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.aguardientenectar, "AGUARDIENTE NECTAR", "Aguardiente Nectar sin azúcar con la mejor calidad y garantía"));
        listItems.add(new Entidad(R.drawable.cervezaoriginal , "CERVEZA AGUILA", "la Cerveza Original, sin igual y siempre igual"));
        listItems.add(new Entidad(R.drawable.cervezaaguilaligth, "CERVEZA AGUILA LIGTH", "Sin igual y siempre igual"));
        listItems.add(new Entidad(R.drawable.cervezapoker, "CERVEZA POKER", "Sin igual y siempre igual"));
        listItems.add(new Entidad(R.drawable.cervezacorona, "CERVEZA CORONA", "La mejor del mundo"));
        listItems.add(new Entidad(R.drawable.buchanas, "BUCHANANS DELUXE", "Whisky de calidad"));
        listItems.add(new Entidad(R.drawable.donjulio, "DON JULIO TEQUILA", "Tequila mexicano de la mejor calidad"));


        return listItems;

    }
}

