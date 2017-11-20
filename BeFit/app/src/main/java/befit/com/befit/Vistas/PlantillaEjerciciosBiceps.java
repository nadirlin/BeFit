package befit.com.befit.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import befit.com.befit.R;

public class PlantillaEjerciciosBiceps extends AppCompatActivity {

    TextView title_ej, info_ej;
    ImageView img_ej;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla_ejercicios_biceps);
        cargarEjercicios();
    }

    private void cargarEjercicios() {
        Bundle dato = getIntent().getExtras();
        int index = dato.getInt("index");

        //title_ej = (TextView) findViewById(R.id.txt_title_ej);
        //info_ej = (TextView) findViewById(R.id.txt_info_ej);
        img_ej = (ImageView) findViewById(R.id.img_ejbic);

        switch (index){
            case 0:
                /*String ej00 = getResources().getString(R.string.pecho_ej00);
                String ejInf00 = getResources().getString(R.string.pecho_info_ej00);
                title_ej.setText(ej00);
                info_ej.setText(ejInf00);*/
                img_ej.setImageResource(R.drawable.biceps00);
                break;
            case 1:
                img_ej.setImageResource(R.drawable.biceps01);
                break;
            case 2:
                img_ej.setImageResource(R.drawable.biceps02);
                break;
            case 3:
                img_ej.setImageResource(R.drawable.biceps03);
                break;
            case 4:
                img_ej.setImageResource(R.drawable.biceps04);
                break;
            case 5:
                img_ej.setImageResource(R.drawable.biceps05);
                break;
            case 6:
                img_ej.setImageResource(R.drawable.biceps06);
                break;
            case 7:
                img_ej.setImageResource(R.drawable.biceps07);
                break;
            case 8:
                img_ej.setImageResource(R.drawable.biceps08);
                break;
            case 9:
                img_ej.setImageResource(R.drawable.biceps09);
                break;
            default:
                Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
        }

    }
}
