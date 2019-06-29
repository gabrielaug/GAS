/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.basicas;

/**
 *
 * @author Gabriel Augusto
 */
public class Parametros {
    
    private final int parametro = 1;
    private String licenca;
    private String sysMaximizado;
    private String atuPermUsuOn;
    private String altSenhaPrimeiAcesso;

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    public int getParametro() {
        return parametro;
    }
    
    public String getSysMaximizado() {
        return sysMaximizado;
    }

    public void setSysMaximizado(String sysMaximizado) {
        this.sysMaximizado = sysMaximizado;
    }

    public String getAtuPermUsuOn() {
        return atuPermUsuOn;
    }

    public void setAtuPermUsuOn(String atuPermUsuOn) {
        this.atuPermUsuOn = atuPermUsuOn;
    }

    public String getAltSenhaPrimeiAcesso() {
        return altSenhaPrimeiAcesso;
    }

    public void setAltSenhaPrimeiAcesso(String altSenhaPrimeiAcesso) {
        this.altSenhaPrimeiAcesso = altSenhaPrimeiAcesso;
    }
    
   
    
}
