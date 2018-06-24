/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.GregorianCalendar;

/**
 *
 * @author Paulo
 */
public class classBabySitter {
     private int idadeCrianca;
     private double horas;
     private double valorBaySitter;
     private String tipo;
     private Hospede hospede_id;
     private GregorianCalendar data_solicitacao;

    public classBabySitter(int idadeCrianca, double horas, String tipo, double valorBaySitter, Hospede hospede_id) {
        this.idadeCrianca = idadeCrianca;
        this.horas = horas;
        this.tipo = tipo;
        this.valorBaySitter = valorBaySitter;
        this.hospede_id = hospede_id;
        this.data_solicitacao = (GregorianCalendar) GregorianCalendar.getInstance();
        
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdadeCrianca() {
        return idadeCrianca;
    }

    public void setIdadeCrianca(int idadeCrianca) {
        this.idadeCrianca = idadeCrianca;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getValorBaySitter() {
        return valorBaySitter;
    }

    public void setValorBaySitter(double valorBaySitter) {
        this.valorBaySitter = valorBaySitter;
    }

    public Hospede getHospede_id() {
        return hospede_id;
    }

    public void setHospede_id(Hospede hospede_id) {
        this.hospede_id = hospede_id;
    }

    public GregorianCalendar getData_solicitacao() {
        return data_solicitacao;
    }

    public void setData_solicitacao(GregorianCalendar data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
    }
     
    
    public static Object[][] listaBaby = {
        new Object[]{"BabySitter", 45},};
     
}
