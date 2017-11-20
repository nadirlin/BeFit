package befit.com.befit.Interactores;

import befit.com.befit.Interfaces.NutricionImcInterfaz;

/**
 * Created by Usuariopc on 7/11/2017.
 */

public class NutricionImcInteractor implements NutricionImcInterfaz.Modelo {

    private NutricionImcInterfaz.Presentador presentador;
    private  double resultado;

    public NutricionImcInteractor(NutricionImcInterfaz.Presentador presentador) {
        this.presentador = presentador;
    }

    @Override
    public void calcularIMCM(String peso, String altura) {
        resultado = Double.valueOf(peso) / (Double.valueOf(altura)*Double.valueOf(altura));
        presentador.mostrarResultadoIMCP(String.valueOf(resultado));
    }

    @Override
    public void evaluarRiesgoM(String peso, String altura) {
        resultado = Double.valueOf(peso) / (Double.valueOf(altura)*Double.valueOf(altura));
        if(resultado < 16){
            presentador.mostrarResultadoRiesgoP("Delgadez Severa");
        }
        else if(resultado >=16 && resultado <= 16.99){
            presentador.mostrarResultadoRiesgoP("Delgadez Moderada");
        }
        else if(resultado >=17 && resultado <= 18.49){
            presentador.mostrarResultadoRiesgoP("Delgadez Aceptable");
        }
        else if(resultado >=18.5 && resultado <= 24.99){
            presentador.mostrarResultadoRiesgoP("Peso Normal");
        }
        else if(resultado >=25 && resultado <= 29.99){
            presentador.mostrarResultadoRiesgoP("Sobrepeso");
        }
        else if(resultado >=30 && resultado <= 34.99){
            presentador.mostrarResultadoRiesgoP("Obseso: Tipo I");
        }
        else if(resultado >=35 && resultado <= 40){
            presentador.mostrarResultadoRiesgoP("Obseso: Tipo II");
        }
        else if(resultado > 40){
            presentador.mostrarResultadoRiesgoP("Obseso: Tipo III");
        }
        else{
            presentador.mostrarResultadoRiesgoP("Otros");
        }
    }
}
