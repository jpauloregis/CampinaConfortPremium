/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Paulo
 */
public class Hospede {
 
    private static int id=0;
    private String nome;
    private String cpf;
    private String telefone;
    private String cartao_credito;
    private Date data_entrada;
    private Date data_saida;
    private double temporada;
    private double valortotal;

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public double getTemporada() {
        return temporada;
    }

    public void setTemporada(double temporada) {
        this.temporada = temporada;
    }

    public Hospede(String nome, String cpf, String telefone, String cartao_credito, Date data_entrada, Date data_saida, double temporada) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cartao_credito = cartao_credito;
        this.data_entrada = data_entrada;
        this.data_saida = data_saida;
        this.temporada = temporada;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Hospede.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCartao_credito() {
        return cartao_credito;
    }

    public void setCartao_credito(String cartao_credito) {
        this.cartao_credito = cartao_credito;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }
    
    public static Object[][] listahospede = {
        new Object[]{"Alta Temporada", 1.25},};
    
}
