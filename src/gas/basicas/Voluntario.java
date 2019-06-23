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
public class Voluntario{
 
    private String login;
    private String senha;
    private String nome;
    private String cpf;
    private String profissao;
    private String endereco;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String celular;
    private Date dt_Nascimento;
    private String status;
    private String dt_Cadastro;
    private AcessoUsuario acessoUsuario = new AcessoUsuario();

    public AcessoUsuario getAcessoUsuario() {
        return acessoUsuario;
    }

    public void setAcessoUsuario(AcessoUsuario acessoUsuario) {
        this.acessoUsuario = acessoUsuario;
    }

    public int getStatusSenha() {
        return statusSenha;
    }

    public void setStatusSenha(int statusSenha) {
        this.statusSenha = statusSenha;
    }
    private int statusSenha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
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

    public Date getDt_Nascimento() {
        return dt_Nascimento;
    }

    public void setDt_Nascimento(Date dt_Nascimento) {
        this.dt_Nascimento = dt_Nascimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDt_Cadastro() {
        return dt_Cadastro;
    }

    public void setDt_Cadastro(String dt_Cadastro) {
        this.dt_Cadastro = dt_Cadastro;
    }

    
    
    
}
