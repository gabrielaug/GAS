/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.basicas;

import java.util.Date;

/**
 *
 * @author Gabriel Augusto
 */
public class Morador {
    
    private int cod_Morador;
    private String Nome;
    private String cpf;
    private String rg;
    private String org_Emissor;
    private String ufEmissor;
    private String profissao;
    private String telefone;
    private String celular;
    private double renda;
    private String deficiente;
    private String observacao;
    private Date dt_Cadastro;

    public int getCod_Morador() {
        return cod_Morador;
    }

    public void setCod_Morador(int cod_Morador) {
        this.cod_Morador = cod_Morador;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrg_Emissor() {
        return org_Emissor;
    }

    public void setOrg_Emissor(String org_Emissor) {
        this.org_Emissor = org_Emissor;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getDeficiente() {
        return deficiente;
    }

    public void setDeficiente(String deficiente) {
        this.deficiente = deficiente;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDt_Cadastro() {
        return dt_Cadastro;
    }

    public void setDt_Cadastro(Date dt_Cadastro) {
        this.dt_Cadastro = dt_Cadastro;
    }
    
     public String getUfEmissor() {
        return ufEmissor;
    }

    public void setUfEmissor(String ufEmissor) {
        this.ufEmissor = ufEmissor;
    }
    
}
