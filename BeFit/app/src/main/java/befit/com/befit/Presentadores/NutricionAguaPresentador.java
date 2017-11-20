package befit.com.befit.Presentadores;

import befit.com.befit.Interactores.NutricionAguaInteractor;
import befit.com.befit.Interfaces.NutricionAguaInterfaz;

/**
 * Created by Usuariopc on 10/11/2017.
 */

public class NutricionAguaPresentador implements NutricionAguaInterfaz.Presentador {

    private NutricionAguaInterfaz.Vista v;
    private NutricionAguaInterfaz.Interactor i;

    public NutricionAguaPresentador(NutricionAguaInterfaz.Vista v) {
        this.v = v;
        i = new NutricionAguaInteractor(this);
    }

    @Override
    public void mostrarResultadoAguaP(String resultado) {
        if(v != null){
            v.mostrarResultadoAguaV(resultado);
        }

    }

    @Override
    public void calcularAguaP(String peso) {
        if(v != null){
            i.calcularAguaI(peso);
        }

    }
}
