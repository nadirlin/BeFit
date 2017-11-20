package befit.com.befit.Presentadores;

import befit.com.befit.Interactores.NutricionProteinaInteractor;
import befit.com.befit.Interfaces.NutricionProteinaInterfaz;

/**
 * Created by Usuariopc on 9/11/2017.
 */

public class NutricionProteinaPresentador implements NutricionProteinaInterfaz.Presentador {
    private NutricionProteinaInterfaz.Vista v;
    private NutricionProteinaInterfaz.Interactor i;

    public NutricionProteinaPresentador(NutricionProteinaInterfaz.Vista v) {
        this.v = v;
        i = new NutricionProteinaInteractor(this);
    }


    @Override
    public void mostrarResultProteinaP(String resultado) {
        if(v != null){
            v.mostrarResultProteinaV(resultado);
        }

    }

    @Override
    public void calcularProteinaP(String peso, String actividad) {
        if(v != null){
            i.calcularProteinaI(peso, actividad);
        }
    }
}
