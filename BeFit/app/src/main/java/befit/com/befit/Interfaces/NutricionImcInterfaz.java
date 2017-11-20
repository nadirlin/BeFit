package befit.com.befit.Interfaces;

/**
 * Created by Usuariopc on 7/11/2017.
 */

public interface NutricionImcInterfaz {

    interface Vista{
        void mostrarResultadoIMCV(String resultado);
        void mostrarResultadoRiesgoV(String resultadoR);
    }

    interface Presentador{
        void mostrarResultadoIMCP(String resultado);
        void mostrarResultadoRiesgoP(String resultadoR);
        void calcularIMCP(String peso, String altura);
        void evaluarRiesgoP(String peso, String altura);
    }

    interface Modelo{
        void calcularIMCM(String peso, String altura);
        void evaluarRiesgoM(String peso, String altura);
    }
}
