/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class Cotizante extends Paciente{
    private double salario;
    private int numCelular;
    private Beneficiario suBeneficiario;

    public Cotizante(double salario, int numCelular, Beneficiario suBeneficiario, String nombre, int identificaion, Servicio suServicio) {
        super(nombre, identificaion, suServicio);
        this.salario = salario;
        this.numCelular = numCelular;
        this.suBeneficiario = suBeneficiario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public Beneficiario getSuBeneficiario() {
        return suBeneficiario;
    }

    public void setSuBeneficiario(Beneficiario suBeneficiario) {
        this.suBeneficiario = suBeneficiario;
    }

    @Override
    public String toString() {
        return "Cotizante{" + "salario=" + salario + ", numCelular=" + numCelular + ", suBeneficiario=" + suBeneficiario + '}';
    }
    
}
