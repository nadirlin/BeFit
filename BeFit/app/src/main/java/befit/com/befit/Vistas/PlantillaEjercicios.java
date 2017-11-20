package befit.com.befit.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import befit.com.befit.R;

public class PlantillaEjercicios extends AppCompatActivity {

    TextView title_ej, info_ej;
    ImageView img_ej;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla_ejercicios);

        cargarEjercicios();
    }

    private void cargarEjercicios() {
        Bundle dato = getIntent().getExtras();
        int index = dato.getInt("index");

        title_ej = (TextView) findViewById(R.id.txt_title_ej);
        info_ej = (TextView) findViewById(R.id.txt_info_ej);
        img_ej = (ImageView) findViewById(R.id.img_ej);

        switch (index){
            case 0:
                String ej00 = getResources().getString(R.string.pecho_ej00);
                String ejInf00 = getResources().getString(R.string.pecho_info_ej00);
                title_ej.setText(ej00);
                info_ej.setText(ejInf00);
                img_ej.setImageResource(R.drawable.pecho00);
                break;
            case 1:
                String ej01 = getResources().getString(R.string.pecho_ej01);
                String ejInf01 = getResources().getString(R.string.pecho_info_ej01);
                title_ej.setText(ej01);
                info_ej.setText(ejInf01);
                img_ej.setImageResource(R.drawable.pecho01);
                break;
            case 2:
                String ej02 = getResources().getString(R.string.pecho_ej02);
                String ejInf02 = getResources().getString(R.string.pecho_info_ej02);
                title_ej.setText(ej02);
                info_ej.setText(ejInf02);
                img_ej.setImageResource(R.drawable.pecho02);
                break;
            case 3:
                String ej03 = getResources().getString(R.string.pecho_ej03);
                //String ejInf03 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej03);
                //info_ej.setText(ejInf03);
                img_ej.setImageResource(R.drawable.pecho04);
                break;
            case 4:
                String ej04 = getResources().getString(R.string.pecho_ej04);
                //String ejInf04 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej04);
                //info_ej.setText(ejInf04);
                img_ej.setImageResource(R.drawable.pecho05);
                break;
            case 5:
                String ej05 = getResources().getString(R.string.pecho_ej05);
                //String ejInf05 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej05);
                //info_ej.setText(ejInf05);
                img_ej.setImageResource(R.drawable.pecho06);
                break;
            case 6:
                String ej06 = getResources().getString(R.string.pecho_ej06);
                //String ejInf06 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej06);
                //info_ej.setText(ejInf06);
                img_ej.setImageResource(R.drawable.pecho07);
                break;
            case 7:
                String ej07 = getResources().getString(R.string.pecho_ej07);
                //String ejInf07 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej07);
                //info_ej.setText(ejInf07);
                img_ej.setImageResource(R.drawable.pecho08);
                break;
            case 8:
                String ej08 = getResources().getString(R.string.pecho_ej08);
                //String ejInf08 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej08);
                //info_ej.setText(ejInf08);
                img_ej.setImageResource(R.drawable.pecho09);
                break;
            case 9:
                String ej09 = getResources().getString(R.string.pecho_ej09);
                //String ejInf09 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej09);
                //info_ej.setText(ejInf09);
                img_ej.setImageResource(R.drawable.pecho10);
                break;
            case 10:
                String ej10 = getResources().getString(R.string.pecho_ej10);
                //String ejInf10 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej10);
                //info_ej.setText(ejInf10);
                img_ej.setImageResource(R.drawable.pecho11);
                break;
            case 11:
                String ej11 = getResources().getString(R.string.pecho_ej11);
                //String ejInf11 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej11);
                //info_ej.setText(ejInf11);
                img_ej.setImageResource(R.drawable.pecho12);
                break;
            case 12:
                String ej12 = getResources().getString(R.string.pecho_ej12);
                //String ejInf12 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej12);
                //info_ej.setText(ejInf12);
                img_ej.setImageResource(R.drawable.pecho13);
                break;
            case 13:
                String ej13 = getResources().getString(R.string.pecho_ej13);
                //String ejInf13 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej13);
                //info_ej.setText(ejInf13);
                img_ej.setImageResource(R.drawable.pecho14);
                break;
            case 14:
                String ej14 = getResources().getString(R.string.pecho_ej14);
                //String ejInf14 = getResources().getString(R.string.pecho_info_ej03);
                title_ej.setText(ej14);
                //info_ej.setText(ejInf14);
                img_ej.setImageResource(R.drawable.pecho15);
                break;
            default:
                Toast.makeText(getApplicationContext(), "En proceso...", Toast.LENGTH_SHORT).show();
        }

    }
}
