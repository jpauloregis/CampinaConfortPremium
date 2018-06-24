/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class Quartos {

    private double valorQuarto;
    private int qtdMax;
    private int qtd_pessoas;
    private Hospede hospede_id;
    private String nomeQuarto;
    private GregorianCalendar data_solicitacao;

    public Quartos(double valorQuarto, int qtdMax, int qtd_pessoas, Hospede hospede_id, String nomeQuarto) {
        this.valorQuarto = valorQuarto;
        this.qtdMax = qtdMax;
        this.qtd_pessoas = qtd_pessoas;
        this.hospede_id = hospede_id;
        this.nomeQuarto = nomeQuarto;
        this.data_solicitacao = (GregorianCalendar) GregorianCalendar.getInstance();
    }
    
    public double getValorQuarto() {
        return valorQuarto;
    }

    public void setValorQuarto(double valorQuarto) {
        this.valorQuarto = valorQuarto;
    }

    public int getQtd_pessoas() {
        return qtd_pessoas;
    }

    public void setQtd_pessoas(int qtd_pessoas) {
        this.qtd_pessoas = qtd_pessoas;
    }

    public String getNomeQuarto() {
        return nomeQuarto;
    }

    public void setNomeQuarto(String nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }

    public int getQtdMax() {
        return qtdMax;
    }

    public void setQtdMax(int qtdMax) {
        this.qtdMax = qtdMax;
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

    public static Object[][] lista_de_quartos = {
        //nome,diaria,quantidade disponivel no hotel, quantidade de pessoa suportada 0-1-2-3
        new Object[]{"Presidencial", 1200, 5, 4},
        new Object[]{"Luxo Simples", 520, 5, 3},
        new Object[]{"Luxo Duplo", 570, 15, 3},
        new Object[]{"Luxo Triplo", 620, 20, 3},
        new Object[]{"Executivo Simples", 360, 5, 3},
        new Object[]{"Executivo Duplo", 385, 15, 3},
        new Object[]{"Executivo Triplo", 440, 20, 3},};

    /* public Object[] getQuartos(){
        return lista_de_quartos;
    }*/
   /* public void atualizarListaQuarto() {
        Object[] dados = Quartos.lista_de_quartos[2];
        dados[2] = -1;
        
        
        int maior = 0; int dif = 0;

for(int i=0;i<=dados.length-1;i++)
{ 
    dif=dados[i+1]-dados[i];
    if(dif<maior)
          maior = dif;
}
    }*/
    
    public static void removerVaga(int id){
        Object[] quarto = lista_de_quartos[id];
        int qtdeDisponivel = Integer.valueOf(String.valueOf(quarto[2]));
        if( qtdeDisponivel == 0 ){
            //System.out.println("Nao tem vaga!");
            JOptionPane.showMessageDialog(null, "Nao tem vaga!");

        }else{
            lista_de_quartos[id][2] = qtdeDisponivel - 1;
            System.out.println("vaga retirada");
        }
    }
    
    public static void adicionarVaga(int id){
        Object[] quarto = lista_de_quartos[id];
        int qtdeDisponivel = Integer.valueOf(String.valueOf(quarto[2]));
        lista_de_quartos[id][2] = qtdeDisponivel + 1;
        System.out.println("vaga adicionada");
    }
    
    public static boolean temVaga(int id){
        Object[] quarto = lista_de_quartos[id];
        int qtdeDisponivel = Integer.valueOf(String.valueOf(quarto[2]));
        if( qtdeDisponivel == 0 ){
           JOptionPane.showMessageDialog(null, "Nao tem vaga!");
            return false;
        }
        return true;
    }
    
}
