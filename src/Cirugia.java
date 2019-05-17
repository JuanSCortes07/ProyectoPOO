
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
public class Cirugia extends Servicio {
    private int costoTotal;

    public Cirugia(int costoTotal, LocalDate fecha, String descripcion, Cotizante suCotizante) {
        super(fecha, descripcion, suCotizante);
        this.costoTotal = costoTotal;
    }



    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Cirugia{" + "costoTotal=" + costoTotal + '}';
    }   
    
}
