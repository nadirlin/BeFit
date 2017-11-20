package befit.com.befit.Presentadores;

import befit.com.befit.Interactores.NutricionImcInteractor;
import befit.com.befit.Interfaces.NutricionImcInterfaz;

/**
 * Created by Usuariopc on 7/11/2017.
 */

public class NutricionImcPresentador implements NutricionImcInterfaz.Presentador {

    private NutricionImcInterfaz.Vista vista;
    private NutricionImcInterfaz.Modelo modelo;

    public NutricionImcPresentador(NutricionImcInterfaz.Vista vista) {
        this.vista = vista;
        modelo = new NutricionImcInteractor(this);
    }

    @Override
    public void mostrarResultadoIMCP(String resultado) {
        if(vista != null){
            vista.mostrarResultadoIMCV(resultado);
        }
    }

    @Override
    public void mostrarResultadoRiesgoP(String resultadoR) {
        if(vista != null){
            vista.mostrarResultadoRiesgoV(resultadoR);
        }
    }

    @Override
    public void calcularIMCP(String peso, String altura) {
        if(vista != null){
            modelo.calcularIMCM(peso, altura);
        }
    }

    @Override
    public void evaluarRiesgoP(String peso, String altura) {
        if(vista != null){
            modelo.evaluarRiesgoM(peso, altura);
        }
    }

}
