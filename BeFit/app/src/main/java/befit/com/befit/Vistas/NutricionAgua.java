package befit.com.befit.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import befit.com.befit.Interfaces.NutricionAguaInterfaz;
import befit.com.befit.Presentadores.NutricionAguaPresentador;
import befit.com.befit.R;

public class NutricionAgua extends AppCompatActivity implements NutricionAguaInterfaz.Vista {
    private EditText peso;
    private TextView res;
    private NutricionAguaInterfaz.Presentador p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricion_agua);

        peso = (EditText) findViewById(R.id.idNutriAgua_peso);
        res = (TextView) findViewById(R.id.idNutriAgua_resultado);
        p = new NutricionAguaPresentador(this);
    }

    public void calcular_agua(View v){
        p.calcularAguaP(peso.getText().toString());
    }

    @Override
    public void mostrarResultadoAguaV(String resultado) {
        res.setText("Resultado: "+ Math.ceil(Double.parseDouble(resultado)) +" VASOS DE AGUA de 250 ML que necesita consumir cada día.");
    }
}
