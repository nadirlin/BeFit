package befit.com.befit.Vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import befit.com.befit.BD.AdaptadorGuiaEjercicios;
import befit.com.befit.BD.GuiaEjerciciosRw;
import befit.com.befit.R;

public class GuiaEjercicios extends AppCompatActivity {
    ArrayList<GuiaEjerciciosRw> listaGuiaEjercicios;
    RecyclerView recyclerGuiaEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia_ejercicios);

        listaGuiaEjercicios = new ArrayList<>();
        recyclerGuiaEjercicios = (RecyclerView) findViewById(R.id.recyclerId);
        recyclerGuiaEjercicios.setLayoutManager(new LinearLayoutManager(this));

        llenarGuiaEjercicios();

        AdaptadorGuiaEjercicios a = new AdaptadorGuiaEjercicios(listaGuiaEjercicios);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = recyclerGuiaEjercicios.getChildAdapterPosition(v);
                String n = listaGuiaEjercicios.get(recyclerGuiaEjercicios.getChildAdapterPosition(v)).getNombre().toString();
                if(index == 0){
                    Intent i0 = new Intent(GuiaEjercicios.this, EjercicioPectoral.class);
                    startActivity(i0);
                }else if(index == 1){
                    Intent i1 = new Intent(GuiaEjercicios.this, EjercicioEspalda.class);
                    startActivity(i1);
                }else if(index == 2){
                    Intent i2 = new Intent(GuiaEjercicios.this, EjercicioBiceps.class);
                    startActivity(i2);
                }else if(index == 3){
                    Intent i3 = new Intent(GuiaEjercicios.this, EjercicioTriceps.class);
                    startActivity(i3);
                }else if(index == 4){
                    Intent i4 = new Intent(GuiaEjercicios.this, EjercicioHombros.class);
                    startActivity(i4);
                }else if(index == 5){
                    Intent i5 = new Intent(GuiaEjercicios.this, EjercicioPiernas.class);
                    startActivity(i5);
                }else if(index == 6){
                    Intent i6 = new Intent(GuiaEjercicios.this, EjercicioAbdominales.class);
                    startActivity(i6);
                }else{
                    Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
                }
            }
        });
        recyclerGuiaEjercicios.setAdapter(a);
    }

    private void llenarGuiaEjercicios(){
        String ejercicios[] = getResources().getStringArray(R.array.guiaejercicios);
        String ejerciciosInfo[] = getResources().getStringArray(R.array.guiaejerciciosinfo);
        ArrayList<String> e = new ArrayList<String>();
        ArrayList<String> ei = new ArrayList<String>();

        for(String a : ejercicios){
            e.add(a);
        }
        for(String b : ejerciciosInfo){
            ei.add(b);
        }

        for (int i=0; i < ei.size(); i++) {
            if(i==0){
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), ei.get(i).toString(), R.drawable.chest));
            }else if(i==1){
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), ei.get(i).toString(), R.drawable.bodybuilderback));
            } else if(i==2){
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), ei.get(i).toString(), R.drawable.bicepss));
            }else if(i==3){
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), ei.get(i).toString(), R.drawable.tricepss));
            }else if(i==4){
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), ei.get(i).toString(), R.drawable.shoulders));
            }else if(i==5){
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), ei.get(i).toString(), R.drawable.hamstrings));
            }else{
                listaGuiaEjercicios.add(new GuiaEjerciciosRw(e.get(i).toString(), ei.get(i).toString(), R.drawable.prelum));
            }
        }
    }
}
