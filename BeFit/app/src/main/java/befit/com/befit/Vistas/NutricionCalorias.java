package befit.com.befit.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import befit.com.befit.BD.AdaptadorGuiaEjercicios;
import befit.com.befit.BD.GuiaEjerciciosRw;
import befit.com.befit.R;

public class NutricionCalorias extends AppCompatActivity {

    ArrayList<GuiaEjerciciosRw> listaGuiaEjercicios;
    RecyclerView recyclerGuiaEjercicios;
    TextView tit2, res, tit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricion_calorias);

        tit2 = (TextView) findViewById(R.id.tituloNutriente);
        tit = (TextView) findViewById(R.id.tituloCalorias);
        res = (TextView) findViewById(R.id.resultadoCalorias);

        listaGuiaEjercicios = new ArrayList<>();
        recyclerGuiaEjercicios = (RecyclerView) findViewById(R.id.idRecyclerCal);
        recyclerGuiaEjercicios.setLayoutManager(new GridLayoutManager(this, 1));

        llenarNutrientes();

        AdaptadorGuiaEjercicios a = new AdaptadorGuiaEjercicios(listaGuiaEjercicios);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int index = recyclerGuiaEjercicios.getChildAdapterPosition(v);
                String n = listaGuiaEjercicios.get(recyclerGuiaEjercicios.getChildAdapterPosition(v)).getNombre().toString();
                tit.setText("Kcal   Pro   Ft   Ch");

                valorCalorias(index, n);

            }
        });
        recyclerGuiaEjercicios.setAdapter(a);
    }

    public void llenarNutrientes(){
        String strings[] = getResources().getStringArray(R.array.nutrientes);
        for (String s: strings) {
            listaGuiaEjercicios.add(new GuiaEjerciciosRw(s, "", R.drawable.ingredientes));
        }
    }

    private void valorCalorias(int index, String n){
        if(index == 0){
            tit2.setText(n);
            res.setText("6.3    3.2   3.7  4.6");
        }else if(index == 1){
            tit2.setText(n);
            res.setText("61    3.3   3.5  4.0");
        }else if(index == 2){
            tit2.setText(n);
            res.setText("307    24   23  1.0");
        }else if(index == 3){
            tit2.setText(n);
            res.setText(" 245    19.9   16.1  4.9");
        }else if(index == 4){
            tit2.setText(n);
            res.setText("156    13   11.1  0.0");
        }else if(index == 5){
            tit2.setText(n);
            res.setText("53    11   0.2  1.0");
        }else if(index == 6){
            tit2.setText(n);
            res.setText(" 179    11.6   13.1  3.6");
        }else if(index == 7){
            tit2.setText(n);
            res.setText("108    22.4   21  0.0");
        }else if(index == 8){
            tit2.setText(n);
            res.setText("148    20.7   6.5   -");
        }else if(index == 9){
            tit2.setText(n);
            res.setText("373    12.5   31.0  2.0");
        }else if(index == 10){
            tit2.setText(n);
            res.setText("309    17.0   25.0  4.0");
        }else if(index == 11){
            tit2.setText(n);
            res.setText("96       -       -      -");
        }else if(index == 12){
            tit2.setText(n);
            res.setText("176    18.4   12.0  0.0");
        }else if(index == 13){
            tit2.setText(n);
            res.setText("288    24.2   20.5  -");
        }else if(index == 14){
            tit2.setText(n);
            res.setText("127    28   0.8    -");
        }else if(index == 15){
            tit2.setText(n);
            res.setText("238    23.4   13.2  -");
        }else if(index == 16){
            tit2.setText(n);
            res.setText("88    16.2   1.9  0.5");
        }else if(index == 17){
            tit2.setText(n);
            res.setText("57    10.6   1.0  1.4");
        }else if(index == 18){
            tit2.setText(n);
            res.setText("24    1.0   0.0  5.2");
        }else if(index == 19){
            tit2.setText(n);
            res.setText("19    1.8   0.4  2.2");
        }else if(index == 20){
            tit2.setText(n);
            res.setText("26    2.2   0.2  5.2");
        }else if(index == 21){
            tit2.setText(n);
            res.setText("80    2.1   1.0  18");
        }else if(index == 22){
            tit2.setText(n);
            res.setText(" 327    2.0   14.6  46.5");
        }else if(index == 23){
            tit2.setText(n);
            res.setText("10.4    0.7   0.1  2.0");
        }else if(index == 24){
            tit2.setText(n);
            res.setText("16    1.0   0.2  2.9");
        }else if(index == 25){
            tit2.setText(n);
            res.setText("37    1.0   0.2  7.8");
        }else if(index == 26){
            tit2.setText(n);
            res.setText("19    21   0.1  2.5");
        }else if(index == 27){
            tit2.setText(n);
            res.setText("232    1.9   23.5  3.2");
        }else if(index == 28){
            tit2.setText(n);
            res.setText("53    0.8   0.6  10.8");
        }else if(index == 29){
            tit2.setText(n);
            res.setText("41    0.7   0.4  9.1");
        }else if(index == 30){
            tit2.setText(n);
            res.setText("45    0.2   0.3  10.4");
        }else if(index == 31){
            tit2.setText(n);
            res.setText("55    0.5   0.2  12.7");
        }else if(index == 32){
            tit2.setText(n);
            res.setText("85    1.2   0.3  19.5");
        }else if(index == 33){
            tit2.setText(n);
            res.setText("26    0.6   0.0  6.2");
        }else if(index == 34){
            tit2.setText(n);
            res.setText("15    0.7   0.0  3.7");
        }else if(index == 35){
            tit2.setText(n);
            res.setText("48    0.0   0.0  12.0");
        }else if(index == 36){
            tit2.setText(n);
            res.setText("0.0    0.0   0.0  0.0");
        }else if(index == 37){
            tit2.setText(n);
            res.setText("5.0    0.3   0.1  0.7");
        }else if(index == 38){
            tit2.setText(n);
            res.setText("50    0.6   0.1  11.5");
        }else if(index == 39){
            tit2.setText(n);
            res.setText("48    0.6   0.0  3.8");
        }else if(index == 40){
            tit2.setText(n);
            res.setText("305       -       -      -");
        }else if(index == 41){
            tit2.setText(n);
            res.setText("80    0.1   0.0  4.0");
        }else if(index == 42){
            tit2.setText(n);
            res.setText("65    0.23   0.0  0.1");
        }else if(index == 43){
            tit2.setText(n);
            res.setText("315       -       -      -");
        }else if(index == 44){
            tit2.setText(n);
            res.setText("264       -       -      -");
        }


        else{
            Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
        }

    }

}
