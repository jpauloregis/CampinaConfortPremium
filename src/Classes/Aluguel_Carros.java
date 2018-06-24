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
public class Aluguel_Carros {

    private String tipo;
    private double valorDiariasAluguel;
    private int qtddiarias;
    private int pessoas;
    private Hospede hospede_id;
    double tanque;
    double seguro;
    private GregorianCalendar data_solicitacao;

    public Aluguel_Carros(double valorDiariasAluguel, String tipo, int qtddiarias, int pessoas, double tanque, double seguro, Hospede hospede_id) {
        this.valorDiariasAluguel = valorDiariasAluguel;
        this.tipo = tipo;
        this.qtddiarias = qtddiarias;
        this.pessoas = pessoas;
        this.tanque = tanque;
        this.seguro = seguro;
        this.hospede_id = hospede_id;
        this.data_solicitacao = (GregorianCalendar) GregorianCalendar.getInstance();
    }

    public double getValorDiariasAluguel() {
        return valorDiariasAluguel;
    }

    public void setValorDiariasAluguel(double valorDiariasAluguel) {
        this.valorDiariasAluguel = valorDiariasAluguel;
    }

    public int getQtddiarias() {
        return qtddiarias;
    }

    public void setQtddiarias(int qtddiarias) {
        this.qtddiarias = qtddiarias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
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

    public static Object[][] listacarro = {
        new Object[]{"Automovel Luxo", 100, 5},
        new Object[]{"Automovel Executivo", 60, 5},
        new Object[]{"Tanque Cheio", 250,0},
        new Object[]{"Seguro Veicular", 200,0},
    new Object[]{"nada", 0,0},};

}
