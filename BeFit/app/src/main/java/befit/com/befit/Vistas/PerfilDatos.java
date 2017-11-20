package befit.com.befit.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import befit.com.befit.BD.AdaptadorPerfilDatos;
import befit.com.befit.BD.PerfilRealm;
import befit.com.befit.R;
import io.realm.Realm;
import io.realm.RealmResults;

public class PerfilDatos extends AppCompatActivity {

    ArrayList<PerfilRealm> listaDatos;
    RecyclerView r;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_datos);
        realm = Realm.getDefaultInstance();

        listaDatos = new ArrayList<PerfilRealm>();

        r = (RecyclerView) findViewById(R.id.idRecyclerPfdts);
        r.setLayoutManager(new GridLayoutManager(this, 1));

        llenarPerfilDatos();
    }

    public void llenarPerfilDatos (){
        RealmResults<PerfilRealm> perfiles = realm.where(PerfilRealm.class).findAll();
        for(PerfilRealm p: perfiles){
            listaDatos.add(new PerfilRealm(p.getNombre(), p.getPeso(), p.getEstatura(), p.getEdad()));
            //listaDatos.add(new PerfilRealm("Nombre: "+p.getNombre(), "Fecha: "+p.getFecha(), "Peso: "+p.getPeso(),
              //      "Pecho: "+p.getPecho(), "Cintura: "+p.getCintura(), "Cadera: "+p.getCadera(), "Muslos: "+p.getMuslo(),
                //    "Pantorrillas: "+p.getPantorrilla(), "Biceps: "+p.getBiceps()));
            //listaDatos.add(new PerfilRealm("Nombre: "+p.getNombre().toString(), "Fecha: "+ p.getFecha().toString(), "Peso: "+p.getPeso().toString(),
              //      "Pecho: "+p.getPecho().toString(), "Cintura: "+p.getCintura().toString(), "Cadera: "+p.getCadera().toString(), "Muslos: "+p.getMuslo().toString(),
               //     "Pantorrillas: "+p.getPantorrilla().toString(), "Biceps: "+p.getBiceps().toString(), "IMC: "+p.getImc().toString()));
        }
        AdaptadorPerfilDatos a = new AdaptadorPerfilDatos(listaDatos);
        r.setAdapter(a);

    }

}
