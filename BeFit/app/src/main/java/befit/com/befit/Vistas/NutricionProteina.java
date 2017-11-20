package befit.com.befit.Vistas;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import befit.com.befit.Interfaces.NutricionProteinaInterfaz;
import befit.com.befit.Presentadores.NutricionProteinaPresentador;
import befit.com.befit.R;

public class NutricionProteina extends AppCompatActivity implements NutricionProteinaInterfaz.Vista {

    private EditText peso;
    private RadioButton r1, r2, r3;
    private TextView res;
    private int rr;

    private NutricionProteinaInterfaz.Presentador p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricion_proteina);

        peso = (EditText) findViewById(R.id.idNutriProte_peso);
        r1 = (RadioButton) findViewById(R.id.radioSedentario);
        r2 = (RadioButton) findViewById(R.id.radioModerado);
        r3 = (RadioButton) findViewById(R.id.radioIntenso);
        res = (TextView) findViewById(R.id.idNutriProte_result);
        p = new NutricionProteinaPresentador(this);

    }

    public void calcular_proteina(View v){
        p.calcularProteinaP(peso.getText().toString(), String.valueOf(rr));
        if(r1.isChecked()){
            p.calcularProteinaP(peso.getText().toString(), "1");
        }else if(r2.isChecked()){
            p.calcularProteinaP(peso.getText().toString(), "2");
        }else{
            //Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
            p.calcularProteinaP(peso.getText().toString(), "3");
        }

    }


    @Override
    public void mostrarResultProteinaV(String resultado) {
        res.setText(resultado + "g díarios de proteína.");
    }
}
