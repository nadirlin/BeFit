package befit.com.befit.Vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import befit.com.befit.BD.AdaptadorGuiaEjercicios;
import befit.com.befit.BD.GuiaEjerciciosRw;
import befit.com.befit.R;

public class RutinaSemanal extends AppCompatActivity {

    ArrayList<GuiaEjerciciosRw> listaGuiaEjercicios;
    RecyclerView recyclerGuiaEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_semanal);

        listaGuiaEjercicios = new ArrayList<>();
        recyclerGuiaEjercicios = (RecyclerView) findViewById(R.id.recyclerIdRutSemanal);
        recyclerGuiaEjercicios.setLayoutManager(new GridLayoutManager(this, 1));

        llenarDias();

        AdaptadorGuiaEjercicios a = new AdaptadorGuiaEjercicios(listaGuiaEjercicios);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = recyclerGuiaEjercicios.getChildAdapterPosition(v);
                String n = listaGuiaEjercicios.get(recyclerGuiaEjercicios.getChildAdapterPosition(v)).getNombre().toString();
                if(index == 0){
                    Intent i = new Intent(RutinaSemanal.this, RutinaSemanalEjercicios.class);
                    i.putExtra("index", 0);
                    startActivity(i);
                }else if(index == 1){
                    Intent i = new Intent(RutinaSemanal.this, RutinaSemanalEjercicios.class);
                    i.putExtra("index", 1);
                    startActivity(i);
                }else if(index == 2){
                    Intent i = new Intent(RutinaSemanal.this, RutinaSemanalEjercicios.class);
                    i.putExtra("index", 2);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
                }
            }
        });
        recyclerGuiaEjercicios.setAdapter(a);
    }

    private void llenarDias(){
        String strings[] = getResources().getStringArray(R.array.diass);

        for (String s: strings) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }
}
