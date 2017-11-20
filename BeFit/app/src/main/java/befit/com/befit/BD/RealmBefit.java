package befit.com.befit.BD;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Usuariopc on 26/10/2017.
 */

public class RealmBefit extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration configuracion = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(configuracion);
    }

}
