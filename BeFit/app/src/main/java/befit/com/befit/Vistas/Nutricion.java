package befit.com.befit.Vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import befit.com.befit.R;

public class Nutricion extends AppCompatActivity {

    Button btn_imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricion);

        btn_imc = (Button) findViewById(R.id.btn_imc);
    }

    public void irIMC(View v){
        Intent i = new Intent(Nutricion.this, NutricionImc.class);
        startActivity(i);
    }

    public void irProteina(View v){
        Intent i = new Intent(Nutricion.this, NutricionProteina.class);
        startActivity(i);
    }

    public void irAgua(View v){
        Intent i = new Intent(Nutricion.this, NutricionAgua.class);
        startActivity(i);
    }

    public void irCalorias(View v){
        Intent i = new Intent(Nutricion.this, NutricionCalorias.class);
        startActivity(i);
    }
}
