package befit.com.befit.Vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import befit.com.befit.BD.AdaptadorDatos;
import befit.com.befit.BD.AdaptadorGuiaEjercicios;
import befit.com.befit.BD.Dato;
import befit.com.befit.BD.GuiaEjerciciosRw;
import befit.com.befit.R;

public class EjercicioAbdominales extends AppCompatActivity {

    ArrayList<GuiaEjerciciosRw> listaGuiaEjercicios;
    RecyclerView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_abdominales);

        r = (RecyclerView) findViewById(R.id.idRecyclerAbd);
        r.setLayoutManager(new GridLayoutManager(this, 1));

        listaGuiaEjercicios = new ArrayList<>();

        llenarGuiaEjAbdominales();
        AdaptadorGuiaEjercicios a = new AdaptadorGuiaEjercicios(listaGuiaEjercicios);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int index = r.getChildAdapterPosition(v);
                String n = listaGuiaEjercicios.get(r.getChildAdapterPosition(v)).getNombre().toString();

                if(index == 0){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 0);
                    startActivity(i);
                }else if(index == 1){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 1);
                    startActivity(i);
                }else if(index == 2){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 2);
                    startActivity(i);
                }else if(index == 3){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 3);
                    startActivity(i);
                }else if(index == 4){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 4);
                    startActivity(i);
                }else if(index == 5){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 5);
                    startActivity(i);
                }else if(index == 6){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 6);
                    startActivity(i);
                }else if(index == 7){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 7);
                    startActivity(i);
                }else if(index == 8){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 8);
                    startActivity(i);
                }else if(index == 9){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 9);
                    startActivity(i);
                }else if(index == 10){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 10);
                    startActivity(i);
                }else if(index == 11){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 11);
                    startActivity(i);
                }else if(index == 12){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 12);
                    startActivity(i);
                }else if(index == 13){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 13);
                    startActivity(i);
                }else if(index == 14){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 14);
                    startActivity(i);
                }else if(index == 15){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 15);
                    startActivity(i);
                }else if(index == 16){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 16);
                    startActivity(i);
                }else if(index == 17){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 17);
                    startActivity(i);
                }else if(index == 18){
                    Intent i = new Intent(EjercicioAbdominales.this, PlantillaEjerciciosAbdomen.class);
                    i.putExtra("index", 18);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
                }
            }
        });
        r.setAdapter(a);
    }

    private void llenarGuiaEjAbdominales(){
        String ejercicios[] = getResources().getStringArray(R.array.ejabdomen);

        for(String p : ejercicios){
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(p, "", R.drawable.blanco));
        }
    }
}
