package befit.com.befit.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import befit.com.befit.R;

public class PlantillaEjerciciosPierna extends AppCompatActivity {

    TextView title_ej, info_ej;
    ImageView img_ej;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla_ejercicios_pierna);

        cargarEjercicios();
    }

    private void cargarEjercicios() {
        Bundle dato = getIntent().getExtras();
        int index = dato.getInt("index");

        //title_ej = (TextView) findViewById(R.id.txt_title_ej);
        //info_ej = (TextView) findViewById(R.id.txt_info_ej);
        img_ej = (ImageView) findViewById(R.id.img_ejpie);

        switch (index){
            case 0:
                /*String ej00 = getResources().getString(R.string.pecho_ej00);
                String ejInf00 = getResources().getString(R.string.pecho_info_ej00);
                title_ej.setText(ej00);
                info_ej.setText(ejInf00);*/
                img_ej.setImageResource(R.drawable.pierna00);
                break;
            case 1:
                img_ej.setImageResource(R.drawable.pierna01);
                break;
            case 2:
                img_ej.setImageResource(R.drawable.pierna02);
                break;
            case 3:
                img_ej.setImageResource(R.drawable.pierna03);
                break;
            case 4:
                img_ej.setImageResource(R.drawable.pierna04);
                break;
            case 5:
                img_ej.setImageResource(R.drawable.pierna05);
                break;
            case 6:
                img_ej.setImageResource(R.drawable.pierna06);
                break;
            case 7:
                img_ej.setImageResource(R.drawable.pierna07);
                break;
            case 8:
                img_ej.setImageResource(R.drawable.pierna08);
                break;
            case 9:
                img_ej.setImageResource(R.drawable.pierna09);
                break;
            case 10:
                img_ej.setImageResource(R.drawable.pierna10);
                break;
            case 11:
                img_ej.setImageResource(R.drawable.pierna11);
                break;
            case 12:
                img_ej.setImageResource(R.drawable.pierna12);
                break;
            case 13:
                img_ej.setImageResource(R.drawable.pierna13);
                break;
            case 14:
                img_ej.setImageResource(R.drawable.pierna14);
                break;
            case 15:
                img_ej.setImageResource(R.drawable.pierna15);
                break;
            case 16:
                img_ej.setImageResource(R.drawable.pierna16);
                break;
            default:
                Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
        }

    }
}
