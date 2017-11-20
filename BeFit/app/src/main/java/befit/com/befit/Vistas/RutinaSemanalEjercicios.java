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

public class RutinaSemanalEjercicios extends AppCompatActivity {

    ArrayList<GuiaEjerciciosRw> listaGuiaEjercicios;
    RecyclerView recyclerGuiaEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina_semanal_ejercicios);

        listaGuiaEjercicios = new ArrayList<>();
        recyclerGuiaEjercicios = (RecyclerView) findViewById(R.id.recyclerIdRutSemanalEj);
        recyclerGuiaEjercicios.setLayoutManager(new GridLayoutManager(this, 1));

        llenarRutinaDias();

        AdaptadorGuiaEjercicios a = new AdaptadorGuiaEjercicios(listaGuiaEjercicios);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = recyclerGuiaEjercicios.getChildAdapterPosition(v);
                String n = listaGuiaEjercicios.get(recyclerGuiaEjercicios.getChildAdapterPosition(v)).getNombre().toString();
                Bundle dato = getIntent().getExtras();
                int dias = dato.getInt("index");

                switch (dias){
                    case 0:
                        llenarRutinas3Dias(index);
                        break;
                    case 1:
                        llenarRutinas4Dias(index);
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
                        break;
                }


            }
        });
        recyclerGuiaEjercicios.setAdapter(a);
    }

    private void llenarRutinaDias(){
        Bundle dato = getIntent().getExtras();
        int index = dato.getInt("index");

        switch (index){
            case 0:
                llenarDeTresDias();
                break;
            case 1:
                llenarDeCuatroDias();
                break;
            case 2:
                llenarDeCincoDias();
                break;
            default:
                Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void llenarDeTresDias(){
        String uno[] = getResources().getStringArray(R.array.detresdias);

        for (String s: uno) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }

    private void llenarDeCuatroDias(){
        String dos[] = getResources().getStringArray(R.array.decuatrodias);

        for (String s: dos) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }

    private void llenarDeCincoDias(){
        String tres[] = getResources().getStringArray(R.array.decincodias);

        for (String s: tres) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }

    private void llenarRutinas3Dias(int index)
    {
        if(index == 1){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjercicios.class);
            i1.putExtra("index", 1);
            startActivity(i1);
        }else if(index == 2){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjercicios.class);
            i1.putExtra("index", 2);
            startActivity(i1);
        }else if(index == 3){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjercicios.class);
            i1.putExtra("index", 0);
            startActivity(i1);
        }else if(index == 4){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjercicios.class);
            i1.putExtra("index", 4);
            startActivity(i1);
        }else if(index == 5){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosBiceps.class);
            i1.putExtra("index", 3);
            startActivity(i1);
        }else if(index == 6){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosBiceps.class);
            i1.putExtra("index", 4);
            startActivity(i1);
        }else if(index == 7){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosBiceps.class);
            i1.putExtra("index", 6);
            startActivity(i1);
        }else if(index == 8){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosAbdomen.class);
            i1.putExtra("index", 9);
            startActivity(i1);
        }else if(index == 11){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosHombro.class);
            i1.putExtra("index", 0);
            startActivity(i1);
        }else if(index == 12){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosHombro.class);
            i1.putExtra("index", 1);
            startActivity(i1);
        }else if(index == 13){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosHombro.class);
            i1.putExtra("index", 4);
            startActivity(i1);
        }else if(index == 14){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 2);
            startActivity(i1);
        }else if(index == 15){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 4);
            startActivity(i1);
        }else if(index == 16){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 0);
            startActivity(i1);
        }else if(index == 17){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 1);
            startActivity(i1);
        }else if(index == 18){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 11);
            startActivity(i1);
        }else if(index == 21){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosEspalda.class);
            i1.putExtra("index", 7);
            startActivity(i1);
        }else if(index == 22){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosEspalda.class);
            i1.putExtra("index", 0);
            startActivity(i1);
        }else if(index == 23){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosEspalda.class);
            i1.putExtra("index", 13);
            startActivity(i1);
        }else if(index == 24){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosTriceps.class);
            i1.putExtra("index", 2);
            startActivity(i1);
        }else if(index == 25){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosTriceps.class);
            i1.putExtra("index", 3);
            startActivity(i1);
        }else if(index == 26){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosAbdomen.class);
            i1.putExtra("index", 18);
            startActivity(i1);
        }else{
            Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
        }
    }

    private void llenarRutinas4Dias(int index)
    {
        if(index == 1){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 4);
            startActivity(i1);
        }else if(index == 2){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 15);
            startActivity(i1);
        }else if(index == 3){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 6);
            startActivity(i1);
        }else if(index == 4){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 11);
            startActivity(i1);
        }else if(index == 5){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosHombro.class);
            i1.putExtra("index", 0);
            startActivity(i1);
        }else if(index == 6){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosHombro.class);
            i1.putExtra("index", 8);
            startActivity(i1);
        }else if(index == 7){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosHombro.class);
            i1.putExtra("index", 2);
            startActivity(i1);
        }else if(index == 10){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjercicios.class);
            i1.putExtra("index", 1);
            startActivity(i1);
        }else if(index == 11){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjercicios.class);
            i1.putExtra("index", 7);
            startActivity(i1);
        }else if(index == 12){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjercicios.class);
            i1.putExtra("index", 6);
            startActivity(i1);
        }else if(index == 13){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosTriceps.class);
            i1.putExtra("index", 1);
            startActivity(i1);
        }else if(index == 14){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosTriceps.class);
            i1.putExtra("index", 0);
            startActivity(i1);
        }else if(index == 15){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosTriceps.class);
            i1.putExtra("index", 4);
            startActivity(i1);
        }else if(index == 16){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosTriceps.class);
            i1.putExtra("index", 9);
            startActivity(i1);
        }else if(index == 19){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosEspalda.class);
            i1.putExtra("index", 2);
            startActivity(i1);
        }else if(index == 20){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosEspalda.class);
            i1.putExtra("index", 3);
            startActivity(i1);
        }else if(index == 21){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosEspalda.class);
            i1.putExtra("index", 9);
            startActivity(i1);
        }else if(index == 22){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosBiceps.class);
            i1.putExtra("index", 9);
            startActivity(i1);
        }else if(index == 23){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosBiceps.class);
            i1.putExtra("index", 0);
            startActivity(i1);
        }else if(index == 26){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosAbdomen.class);
            i1.putExtra("index", 16);
            startActivity(i1);
        }else if(index == 27){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosAbdomen.class);
            i1.putExtra("index", 18);
            startActivity(i1);
        }else if(index == 28){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosAbdomen.class);
            i1.putExtra("index", 0);
            startActivity(i1);
        }else if(index == 29){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 0);
            startActivity(i1);
        }else if(index == 30){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 1);
            startActivity(i1);
        }else if(index == 31){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 2);
            startActivity(i1);
        }else if(index == 32){
            Intent i1 = new Intent(RutinaSemanalEjercicios.this, PlantillaEjerciciosPierna.class);
            i1.putExtra("index", 6);
            startActivity(i1);
        }else{
            Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
        }
    }
}
