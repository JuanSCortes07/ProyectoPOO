
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
public class Consulta_Externa extends Servicio{
    private String consumoMedicamento;

    public Consulta_Externa(String consumoMedicamento, LocalDate fecha, String descripcion, Cotizante suCotizante) {
        super(fecha, descripcion, suCotizante);
        this.consumoMedicamento = consumoMedicamento;
    }


    public String getConsumoMedicamento() {
        return consumoMedicamento;
    }

    public void setConsumoMedicamento(String consumoMedicamento) {
        this.consumoMedicamento = consumoMedicamento;
    }

    @Override
    public String toString() {
        return "Consulta_Externa{" + "consumoMedicamento=" + consumoMedicamento + '}';
    }
    
    
    
}
