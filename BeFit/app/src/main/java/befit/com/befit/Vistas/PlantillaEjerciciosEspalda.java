package befit.com.befit.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import befit.com.befit.R;

public class PlantillaEjerciciosEspalda extends AppCompatActivity {

    TextView title_ej, info_ej;
    ImageView img_ej;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla_ejercicios_espalda);

        cargarEjercicios();
    }

    private void cargarEjercicios() {
        Bundle dato = getIntent().getExtras();
        int index = dato.getInt("index");

        //title_ej = (TextView) findViewById(R.id.txt_title_ej);
        //info_ej = (TextView) findViewById(R.id.txt_info_ej);
        img_ej = (ImageView) findViewById(R.id.img_ejesp);

        switch (index){
            case 0:
                /*String ej00 = getResources().getString(R.string.pecho_ej00);
                String ejInf00 = getResources().getString(R.string.pecho_info_ej00);
                title_ej.setText(ej00);
                info_ej.setText(ejInf00);*/
                img_ej.setImageResource(R.drawable.espalda00);
                break;
            case 1:
                img_ej.setImageResource(R.drawable.espalda01);
                break;
            case 2:
                img_ej.setImageResource(R.drawable.espalda02);
                break;
            case 3:
                img_ej.setImageResource(R.drawable.espalda03);
                break;
            case 4:
                img_ej.setImageResource(R.drawable.espalda04);
                break;
            case 5:
                img_ej.setImageResource(R.drawable.espalda05);
                break;
            case 6:
                img_ej.setImageResource(R.drawable.espalda06);
                break;
            case 7:
                img_ej.setImageResource(R.drawable.espalda07);
                break;
            case 8:
                img_ej.setImageResource(R.drawable.espalda08);
                break;
            case 9:
                img_ej.setImageResource(R.drawable.espalda09);
                break;
            case 10:
                img_ej.setImageResource(R.drawable.espalda10);
                break;
            case 11:
                img_ej.setImageResource(R.drawable.espalda11);
                break;
            case 12:
                img_ej.setImageResource(R.drawable.espalda12);
                break;
            default:
                Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
        }

    }
}
