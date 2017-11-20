package befit.com.befit.Interactores;

import befit.com.befit.Interfaces.NutricionAguaInterfaz;
import befit.com.befit.Interfaces.NutricionAguaInterfaz.Interactor;
import befit.com.befit.Presentadores.NutricionAguaPresentador;

/**
 * Created by Usuariopc on 10/11/2017.
 */

public class NutricionAguaInteractor implements NutricionAguaInterfaz.Interactor {

    private NutricionAguaPresentador p;
    private double resultado;

    public NutricionAguaInteractor(NutricionAguaPresentador p) {
        this.p = p;
    }

    @Override
    public void calcularAguaI(String peso) {
        resultado = Double.parseDouble(peso) / 7;
        p.mostrarResultadoAguaP(String.valueOf(resultado));
    }
}
