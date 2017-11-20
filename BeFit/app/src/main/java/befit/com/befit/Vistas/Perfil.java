package befit.com.befit.Vistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import befit.com.befit.BD.PerfilRealm;
import befit.com.befit.R;
import io.realm.Realm;
import io.realm.RealmResults;

public class Perfil extends AppCompatActivity {

    //private EditText nombre, fecha, peso, pecho, cintura, cadera, muslo, pantorrilla, biceps;
    private EditText nombre, peso, estatura, edad;
    private Button guardar, leer;
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        realm = Realm.getDefaultInstance();

        nombre = (EditText) findViewById(R.id.nombre);
        peso = (EditText) findViewById(R.id.peso);
        estatura = (EditText) findViewById(R.id.estatura);
        edad = (EditText) findViewById(R.id.edad);

        /*fecha = (EditText) findViewById(R.id.fecha);
        peso = (EditText) findViewById(R.id.peso);
        pecho = (EditText) findViewById(R.id.pecho);
        cintura = (EditText) findViewById(R.id.cintura);
        cadera = (EditText) findViewById(R.id.cadera);
        muslo = (EditText) findViewById(R.id.muslo);
        pantorrilla = (EditText) findViewById(R.id.pantorrilla);
        biceps = (EditText) findViewById(R.id.biceps);*/

        guardar = (Button) findViewById(R.id.guardar);
        leer = (Button) findViewById(R.id.leer);

        /*guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realm.executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        PerfilRealmDatos perfil = realm.createObject(PerfilRealmDatos.class);
                        perfil.setNombre(nombre.getText().toString());
                        perfil.setFecha(fecha.getText().toString());
                        perfil.setPeso(peso.getText().toString());
                        perfil.setPecho(pecho.getText().toString());
                        perfil.setCintura(cintura.getText().toString());
                        perfil.setCadera(cadera.getText().toString());
                        perfil.setMuslo(muslo.getText().toString());
                        perfil.setPantorrilla(pantorrilla.getText().toString());
                        perfil.setBiceps(biceps.getText().toString());
                    }
                });
            }
        });

        leer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RealmResults<PerfilRealmDatos> perfiles = realm.where(PerfilRealmDatos.class).findAll();
                StringBuilder builder = new StringBuilder();
                for(PerfilRealmDatos p: perfiles) {
                    builder.append("\n Nombre: " + p.getNombre());
                    builder.append("\n Fecha: " + p.getFecha());
                    builder.append("\n Peso: " + p.getPeso());
                    builder.append("\n Pecho: " + p.getPecho());
                    builder.append("\n Cintura: " + p.getCintura());
                    builder.append("\n Cadera: " + p.getCadera());
                    builder.append("\n Muslos: " + p.getMuslo());
                    builder.append("\n Pantorrillas: " + p.getPantorrilla());
                    builder.append("\n Biceps: " + p.getBiceps());
                }
                Log.e("TAG", builder.toString());
            }
        });*/

    }

    public void guardarDatos(View v){
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                PerfilRealm perfil = realm.createObject(PerfilRealm.class);
                perfil.setNombre(nombre.getText().toString());
                perfil.setPeso(Double.valueOf(peso.getText().toString()));
                perfil.setEstatura(Double.valueOf(estatura.getText().toString()));
                perfil.setEdad(Integer.valueOf(edad.getText().toString()));

                Toast.makeText(getApplicationContext(), "¡Datos Guardados!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Perfil.this, PerfilDatos.class);
            }
        });
    }

    public void leerDatos(View v){
        RealmResults<PerfilRealm> perfiles = realm.where(PerfilRealm.class).findAll();
        StringBuilder builder = new StringBuilder();
        for(PerfilRealm p: perfiles){
            builder.append("\n Nombre: " + p.getNombre());
            builder.append("\n Peso: " + p.getPeso());
            builder.append("\n Estatura: " + p.getEstatura());
            builder.append("\n Edad: " + p.getEdad());
        }
        Log.e("TAG", builder.toString());

        Intent i = new Intent(Perfil.this, PerfilDatos.class);
        startActivity(i);
    }



    /*public void guardarDatos(View v){
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                //PerfilRealm perfil = realm.createObject(PerfilRealm.class);
                PerfilRealmDatos perfil = realm.createObject(PerfilRealmDatos.class);
                perfil.setNombre(nombre.getText().toString());
                perfil.setFecha(fecha.getText().toString());
                perfil.setPeso(peso.getText().toString());
                perfil.setPecho(pecho.getText().toString());
                perfil.setCintura(cintura.getText().toString());
                perfil.setCadera(cadera.getText().toString());
                perfil.setMuslo(muslo.getText().toString());
                perfil.setPantorrilla(pantorrilla.getText().toString());
                perfil.setBiceps(biceps.getText().toString());
                perfil.setImc(imc.getText().toString());

                Toast.makeText(getApplicationContext(), "¡Datos Guardados!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Perfil.this, PerfilDatos.class);
            }
        });
    }

    public void leerDatos(View v){
        RealmResults<PerfilRealmDatos> perfiles = realm.where(PerfilRealmDatos.class).findAll();
        StringBuilder builder = new StringBuilder();
        for(PerfilRealmDatos p: perfiles){
            builder.append("\n Nombre: " + p.getNombre());
            builder.append("\n Fecha: " + p.getFecha());
            builder.append("\n Peso: " + p.getPeso());
            builder.append("\n Pecho: " + p.getPecho());
            builder.append("\n Cintura: " + p.getCintura());
            builder.append("\n Cadera: " + p.getCadera());
            builder.append("\n Muslos: " + p.getMuslo());
            builder.append("\n Pantorrillas: " + p.getPantorrilla());
            builder.append("\n Biceps: " + p.getBiceps());
            builder.append("\n IMC: " + p.getImc());
        }
        Log.e("TAG", builder.toString());

        Intent i = new Intent(Perfil.this, PerfilDatos.class);
        startActivity(i);
    }*/

    /*public void leerDatos(View v){
        RealmResults<PerfilRealm> perfiles = realm.where(PerfilRealm.class).findAll();
        StringBuilder builder = new StringBuilder();
        for(PerfilRealm p: perfiles){
            builder.append("\n Nombre: " + p.getNombre());
            builder.append("\n Peso: " + p.getPeso());
            builder.append("\n Estatura: " + p.getEstatura());
            builder.append("\n Edad: " + p.getEdad());
        }
        Log.e("TAG", builder.toString());

        Intent i = new Intent(Perfil.this, PerfilDatos.class);
        startActivity(i);
    }*/
}
