package befit.com.befit.Vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import befit.com.befit.BD.AdaptadorGuiaEjercicios;
import befit.com.befit.BD.GuiaEjerciciosRw;
import befit.com.befit.R;

public class Rutinas extends AppCompatActivity {

    ArrayList<GuiaEjerciciosRw> listaGuiaEjercicios;
    RecyclerView recyclerGuiaEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutinas);

        listaGuiaEjercicios = new ArrayList<>();
        recyclerGuiaEjercicios = (RecyclerView) findViewById(R.id.recyclerIdRutinas);
        recyclerGuiaEjercicios.setLayoutManager(new GridLayoutManager(this, 1));

        //llenarNutricion();
        llenarRutinaSemanal();

        AdaptadorGuiaEjercicios a = new AdaptadorGuiaEjercicios(listaGuiaEjercicios);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = recyclerGuiaEjercicios.getChildAdapterPosition(v);
                String n = listaGuiaEjercicios.get(recyclerGuiaEjercicios.getChildAdapterPosition(v)).getNombre().toString();

                Intent i = new Intent(Rutinas.this, RutinaSemanal.class);
                startActivity(i);

                /*if(index == 0){
                    Intent i = new Intent(Rutinas.this, PlanQuemaGrasa.class);
                    startActivity(i);
                }else if(index == 1){
                    Intent i = new Intent(Rutinas.this, PlanGanarPeso.class);
                    startActivity(i);
                }else if(index == 2){
                    Intent i = new Intent(Rutinas.this, MusculoEnfocado.class);
                    startActivity(i);
                }else if(index == 3){
                    Intent i = new Intent(Rutinas.this, RutinaSemanal.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
        recyclerGuiaEjercicios.setAdapter(a);
    }

    public void llenarRutinaSemanal(){
        String ejercicios[] = getResources().getStringArray(R.array.rutin);
        ArrayList<String> e = new ArrayList<String>();

        for(String a : ejercicios){
            e.add(a);
        }

        for (int i=0; i < e.size(); i++) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), "", R.drawable.blanco));
        }

    }

    /*private void llenarNutricion(){
        String ejercicios[] = getResources().getStringArray(R.array.rutinass);
        ArrayList<String> e = new ArrayList<String>();

        for(String a : ejercicios){
            e.add(a);
        }

        for (int i=0; i < e.size(); i++) {
            if(i==0){
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), "", R.drawable.blanco));
            }else if(i==1){
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), "", R.drawable.blanco));
            } else if(i==2){
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), "", R.drawable.blanco));
            }else{
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), "", R.drawable.blanco));
            }
        }
    }*/
}
