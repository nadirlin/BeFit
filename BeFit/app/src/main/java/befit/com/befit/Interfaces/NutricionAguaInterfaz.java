package befit.com.befit.Interfaces;

/**
 * Created by Usuariopc on 10/11/2017.
 */

public interface NutricionAguaInterfaz {

    interface Vista{
        void mostrarResultadoAguaV(String resultado);
    }

    interface Presentador{
        void mostrarResultadoAguaP(String resultado);
        void calcularAguaP(String peso);
    }

    interface Interactor{
        void calcularAguaI(String peso);
    }
}
