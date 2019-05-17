
import java.io.Serializable;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class Servicio implements Serializable {
    
    protected LocalDate fecha;
    protected String descripcion;
    protected Cotizante suCotizante;

    public Servicio(LocalDate fecha, String descripcion, Cotizante suCotizante) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.suCotizante = suCotizante;
    }



    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cotizante getSuCotizante() {
        return suCotizante;
    }

    public void setSuCotizante(Cotizante suCotizante) {
        this.suCotizante = suCotizante;
    }

    @Override
    public String toString() {
        return "Servicio{" + "fecha=" + fecha + ", descripcion=" + descripcion + ", suCotizante=" + suCotizante + '}';
    }
    
    
    
}
