package befit.com.befit.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import befit.com.befit.Interfaces.NutricionImcInterfaz;
import befit.com.befit.Presentadores.NutricionImcPresentador;
import befit.com.befit.R;

public class NutricionImc extends AppCompatActivity implements NutricionImcInterfaz.Vista {

    private EditText nutri_peso, nutri_altura;
    private TextView nutri_res_imc, nutri_res_riesgo;

    private NutricionImcInterfaz.Presentador presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricion_imc);

        nutri_peso = (EditText) findViewById(R.id.idNutri_peso);
        nutri_altura = (EditText) findViewById(R.id.idNutri_altura);
        nutri_res_imc = (TextView) findViewById(R.id.idNutri_res_imc);
        nutri_res_riesgo = (TextView) findViewById(R.id.idNutri_res_riesgo);

        presentador = new NutricionImcPresentador(this);
    }

    public void calcular_imc(View v){
        presentador.calcularIMCP(nutri_peso.getText().toString(), nutri_altura.getText().toString());
        presentador.evaluarRiesgoP(nutri_peso.getText().toString(), nutri_altura.getText().toString());
    }

    @Override
    public void mostrarResultadoIMCV(String resultado) {
        nutri_res_imc.setText("IMC: "+resultado);
    }

    @Override
    public void mostrarResultadoRiesgoV(String resultadoR) {
        nutri_res_riesgo.setText("Estado de Riesgo: "+resultadoR);
    }

}
