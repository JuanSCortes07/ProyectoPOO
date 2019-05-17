
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class Paciente implements Serializable{
    protected String nombre;
    protected int identificaion;
    protected Servicio suServicio;

    public Paciente(String nombre, int identificaion, Servicio suServicio) {
        this.nombre = nombre;
        this.identificaion = identificaion;
        this.suServicio = suServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificaion() {
        return identificaion;
    }

    public void setIdentificaion(int identificaion) {
        this.identificaion = identificaion;
    }

    public Servicio getSuServicio() {
        return suServicio;
    }

    public void setSuServicio(Servicio suServicio) {
        this.suServicio = suServicio;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", identificaion=" + identificaion + ", suServicio=" + suServicio + '}';
    }
        
    
}
