package befit.com.befit.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import befit.com.befit.R;

public class PlantillaEjerciciosAbdomen extends AppCompatActivity {

    TextView title_ej, info_ej;
    ImageView img_ej;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla_ejercicios_abdomen);

        cargarEjercicios();
    }

    private void cargarEjercicios() {
        Bundle dato = getIntent().getExtras();
        int index = dato.getInt("index");

        //title_ej = (TextView) findViewById(R.id.txt_title_ej);
        //info_ej = (TextView) findViewById(R.id.txt_info_ej);
        img_ej = (ImageView) findViewById(R.id.img_ejabd);

        switch (index){
            case 0:
                /*String ej00 = getResources().getString(R.string.pecho_ej00);
                String ejInf00 = getResources().getString(R.string.pecho_info_ej00);
                title_ej.setText(ej00);
                info_ej.setText(ejInf00);*/
                img_ej.setImageResource(R.drawable.abdomen00);
                break;
            case 1:
                img_ej.setImageResource(R.drawable.espalda01);
                break;
            case 2:
                img_ej.setImageResource(R.drawable.abdomen02);
                break;
            case 3:
                img_ej.setImageResource(R.drawable.abdomen03);
                break;
            case 4:
                img_ej.setImageResource(R.drawable.abdomen04);
                break;
            case 5:
                img_ej.setImageResource(R.drawable.abdomen05);
                break;
            case 6:
                img_ej.setImageResource(R.drawable.abdomen06);
                break;
            case 7:
                img_ej.setImageResource(R.drawable.abdomen07);
                break;
            case 8:
                img_ej.setImageResource(R.drawable.abdomen08);
                break;
            case 9:
                img_ej.setImageResource(R.drawable.abdomen09);
                break;
            case 10:
                img_ej.setImageResource(R.drawable.abdomen10);
                break;
            case 11:
                img_ej.setImageResource(R.drawable.abdomen11);
                break;
            case 12:
                img_ej.setImageResource(R.drawable.abdomen12);
                break;
            case 13:
                img_ej.setImageResource(R.drawable.abdomen13);
                break;
            case 14:
                img_ej.setImageResource(R.drawable.abdomen14);
                break;
            case 15:
                img_ej.setImageResource(R.drawable.abdomen15);
                break;
            case 16:
                img_ej.setImageResource(R.drawable.abdomen16);
                break;
            case 17:
                img_ej.setImageResource(R.drawable.abdomen17);
                break;
            case 18:
                img_ej.setImageResource(R.drawable.abdomen18);
                break;
            default:
                Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
        }

    }
}
