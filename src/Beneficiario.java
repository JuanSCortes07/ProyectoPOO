/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class Beneficiario extends Paciente{
    private String tipoId;
    private Cotizante suCotizante;


    public Beneficiario(String tipoId, Cotizante suCotizante, String nombre, int identificaion, Servicio suServicio) {
        super(nombre, identificaion, suServicio);
        this.tipoId = tipoId;
        this.suCotizante = suCotizante;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public Cotizante getSuCotizante() {
        return suCotizante;
    }

    public void setSuCotizante(Cotizante suCotizante) {
        this.suCotizante = suCotizante;
    }

    @Override
    public String toString() {
        return "Beneficiario{" + "tipoId=" + tipoId + ", suCotizante=" + suCotizante + '}';
    }
    
    
}