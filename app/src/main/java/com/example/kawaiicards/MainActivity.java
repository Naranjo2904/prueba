package com.example.kawaiicards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    List items = new ArrayList();
    items.add(new Anime(R.drawable.data, "Angel Beats", 230));
    items.add(new Anime(R.drawable.anime, "Death Note", 456));
    items.add(new Anime(R.drawable.libro, "Fate Stay Night", 3));
    items.add(new Anime(R.drawable.pensador, "Welcome to the NHK",1351));
    items.add(new Anime(R.drawable.images, "Suzumiya Haruhi",5154));

// Obtener el Recycler
                                recycler = (RecyclerView) findViewById(R.id.reciclador2);
    recycler.setHasFixedSize(true);
// Usar un administrador para LinearLayout
    lManager = new LinearLayoutManager(this);
    recycler.setLayoutManager(lManager);
// Crear un nuevo adaptador adapter =
    adapter = new AnimeAdapter(items);
    recycler.setAdapter(adapter);
    }
}