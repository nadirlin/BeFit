package befit.com.befit.Interactores;

import befit.com.befit.Interfaces.NutricionProteinaInterfaz;
import befit.com.befit.Presentadores.NutricionProteinaPresentador;

/**
 * Created by Usuariopc on 9/11/2017.
 */

public class NutricionProteinaInteractor implements NutricionProteinaInterfaz.Interactor {

    private NutricionProteinaPresentador p;
    private double resultado;

    public NutricionProteinaInteractor(NutricionProteinaPresentador p) {
        this.p = p;
    }

    @Override
    public void calcularProteinaI(String peso, String actividad) {
        if(actividad.equals("1")){
            resultado = Double.valueOf(peso) * 1.1;
            p.mostrarResultProteinaP(String.valueOf(resultado));
        }
        else if(actividad.equals("2")){
            resultado = Double.valueOf(peso) * 1.7;
            p.mostrarResultProteinaP(String.valueOf(resultado));
        }
        else {
            resultado = Double.valueOf(peso) * 2.1;
            p.mostrarResultProteinaP(String.valueOf(resultado));
        }
    }
}
