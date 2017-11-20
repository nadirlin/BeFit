package befit.com.befit.Vistas;

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

public class MusculoEnfocadoEjercicios extends AppCompatActivity {

    ArrayList<GuiaEjerciciosRw> listaGuiaEjercicios;
    RecyclerView recyclerGuiaEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musculo_enfocado_ejercicios);

        listaGuiaEjercicios = new ArrayList<>();
        recyclerGuiaEjercicios = (RecyclerView) findViewById(R.id.recyclerIdMusEnfoo);
        recyclerGuiaEjercicios.setLayoutManager(new GridLayoutManager(this, 1));

        llenarRutinaDias();

        AdaptadorGuiaEjercicios a = new AdaptadorGuiaEjercicios(listaGuiaEjercicios);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = recyclerGuiaEjercicios.getChildAdapterPosition(v);
                String n = listaGuiaEjercicios.get(recyclerGuiaEjercicios.getChildAdapterPosition(v)).getNombre().toString();
                if(index == 0){
                    //Intent i0 = new Intent(GuiaEjercicios.this, EjercicioPectoral.class);
                    //startActivity(i0);
                }/*else if(index == 1){
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
                }*/else{
                    Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
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
                llenarPectoral();
                break;
            /*case 1:
                llenarDiaDos();
                break;
            case 2:
                llenarDiaTres();
                break;
            case 3:
                llenarDiaCuatro();
                break;
            case 4:
                llenarDiaCinco();
                break;
            case 5:
                llenarDiaSeis();
                break;*/
            default:
                Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void llenarPectoral(){
        String uno[] = getResources().getStringArray(R.array.pectoralesrutina);

        for (String s: uno) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }

    /*private void llenarDiaDos(){
        String dos[] = getResources().getStringArray(R.array.diadosgp);

        for (String s: dos) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }

    private void llenarDiaTres(){
        String tres[] = getResources().getStringArray(R.array.diatresgp);

        for (String s: tres) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }

    private void llenarDiaCuatro(){
        String cuatro[] = getResources().getStringArray(R.array.diacuatrogp);

        for (String s: cuatro) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }

    private void llenarDiaCinco(){
        String cinco[] = getResources().getStringArray(R.array.diacincogp);

        for (String s: cinco) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }

    private void llenarDiaSeis(){
        String seis[] = getResources().getStringArray(R.array.diaseisgp);

        for (String s: seis) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.blanco));
        }
    }*/
}
