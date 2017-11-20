package befit.com.befit.BD;

import io.realm.RealmObject;

/**
 * Created by Usuariopc on 26/10/2017.
 */

public class PerfilRealm extends RealmObject {
    private String nombre;
    private double peso;
    private double estatura;
    private int edad;

    public PerfilRealm() {
    }

    public PerfilRealm(String nombre, double peso, double estatura, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
