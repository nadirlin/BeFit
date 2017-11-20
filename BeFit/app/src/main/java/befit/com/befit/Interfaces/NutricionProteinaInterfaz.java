package befit.com.befit.Interfaces;

/**
 * Created by Usuariopc on 9/11/2017.
 */

public interface NutricionProteinaInterfaz {

    interface Vista{
        void mostrarResultProteinaV(String resultado);
    }

    interface Presentador{
        void mostrarResultProteinaP(String resultado);
        void calcularProteinaP(String peso, String actividad);
    }

    interface Interactor{
        void calcularProteinaI(String peso, String actividad);
    }
}
