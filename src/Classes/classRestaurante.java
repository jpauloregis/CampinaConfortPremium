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
public class classRestaurante {

    private int porcoes_unidades;
    private int valorRestaurante;
    private String tipoEscolhido;
    private Hospede hospede_id;
    private GregorianCalendar data_solicitacao;

    public classRestaurante(int porcoes_unidades, String tipoEscolhido, int valorRestaurante, Hospede hospede_id) {
        this.porcoes_unidades = porcoes_unidades;
        this.tipoEscolhido = tipoEscolhido;
        this.valorRestaurante = valorRestaurante;
        this.hospede_id = hospede_id;
        this.data_solicitacao = (GregorianCalendar) GregorianCalendar.getInstance();
    }

    public String getTipoEscolhido() {
        return tipoEscolhido;
    }

    public void setTipoEscolhido(String tipoEscolhido) {
        this.tipoEscolhido = tipoEscolhido;
    }

    public int getPorcoes_unidades() {
        return porcoes_unidades;
    }

    public void setPorcoes_unidades(int porcoes_unidades) {
        this.porcoes_unidades = porcoes_unidades;
    }

    public int getValorRestaurante() {
        return valorRestaurante;
    }

    public void setValorRestaurante(int valorRestaurante) {
        this.valorRestaurante = valorRestaurante;
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

    public static Object[][] listaRestaurante = {
        new Object[]{"Tapioca", 10},
        new Object[]{"Bolo de Milho", 10},
        new Object[]{"Canjica", 15},
        new Object[]{"Pamonha", 18},
        new Object[]{"Self Service", 30},
        new Object[]{"Água", 2},
        new Object[]{"Cachaça Normal", 5},
        new Object[]{"Cachaça com mel", 18},
        new Object[]{"Juizo", 5},
        new Object[]{"Serra Limpa", 5},};

}
