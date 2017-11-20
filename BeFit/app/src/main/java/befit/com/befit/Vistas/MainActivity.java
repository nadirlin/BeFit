package befit.com.befit.Vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import befit.com.befit.R;

public class MainActivity extends AppCompatActivity {

    private Button guiaejercicios, perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guiaejercicios = (Button) findViewById(R.id.btn_guiaejercicios);
        perfil = (Button) findViewById(R.id.btn_perfil);
    }

    public void guia(View v){
        Intent intent = new Intent(MainActivity.this, GuiaEjercicios.class);
        startActivity(intent);
    }

    public void perfil(View v){
        Intent intent = new Intent(MainActivity.this, Perfil.class);
        startActivity(intent);
    }

    public void nutricion(View v){
        Intent intent = new Intent(MainActivity.this, Nutricion.class);
        startActivity(intent);
    }

    public void rutinas(View v){
        Intent intent = new Intent(MainActivity.this, Rutinas.class);
        startActivity(intent);
    }
}
