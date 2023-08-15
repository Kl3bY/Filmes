package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;

    //Declarar o recycler view
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idListaFilmes);

        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("O Rei da Montanha",
                        "spoiler: o rei é da montanha",
                        "aventura/infantil",
                        R.drawable.rei_montanha));

        listaFilmes.add(
                new Filmes("Na Ponta da bala",
                        "spoiler: a bala ta na ponta",
                        "ação",
                        R.drawable.pontabala));

        listaFilmes.add(
                new Filmes("A Menina que Matou os Pais",
                        "spoiler: a menina matou os pais",
                        "documentário/terror",
                        R.drawable.menina));

        listaFilmes.add(
                new Filmes("Medo Profundo",
                        "spoiler: o medo é profundo",
                        "terror/oceano",
                        R.drawable.medo));

        listaFilmes.add(
                new Filmes("2067",
                        "spoiler: se passa em 2067",
                        "ficção",
                        R.drawable.doismilesessetnaesete));

        listaFilmes.add(
                new Filmes("Desejos Ocultos",
                        "spoiler: O desejo é oculto",
                        "sci-fi/ação",
                        R.drawable.desejos));

        listaFilmes.add(
                new Filmes("O apocalispe",
                        "spoiler: o mundo acabou",
                        "fim do mundo",
                        R.drawable.apocalipe));

        MyAdapter adapter = new MyAdapter(getApplicationContext(),listaFilmes);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(),2));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);

    }
}