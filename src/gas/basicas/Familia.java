/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.basicas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel Augusto
 */
public class Familia {
    
    private int nr_Registro;
    private String endereco;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private double rendaFamilia;
    private Date dt_Cadastro;
    private ArrayList<Morador> Morador =  new ArrayList<>();

    public int getNr_Registro() {
        return nr_Registro;
    }

    public void setNr_Registro(int nr_Registro) {
        this.nr_Registro = nr_Registro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public double getRendaFamilia() {
        return rendaFamilia;
    }

    public void setRendaFamilia(double rendaFamilia) {
        this.rendaFamilia = rendaFamilia;
    }

    public Date getDt_Cadastro() {
        return dt_Cadastro;
    }

    public void setDt_Cadastro(Date dt_Cadastro) {
        this.dt_Cadastro = dt_Cadastro;
    }

    public ArrayList<Morador> getMorador() {
        return Morador;
    }

    public void setMorador(ArrayList<Morador> Morador) {
        this.Morador = Morador;
    }
    
   
    
}
