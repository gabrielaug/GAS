/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.regra;

import gas.basicas.Familia;
import gas.basicas.Morador;
import gas.dados.DAOFamilia;
import gas.interfaces.InterfaceFamilia;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public class RNFamilia implements InterfaceFamilia {

    DAOFamilia dao;
    
    public RNFamilia(){
        dao = new DAOFamilia();
    }
    
    
    @Override
    public void inserir(Familia familia) throws DAOException, SQLException {
        
        if (familia.getNr_Familia() > 0) {
            throw new DAOException("Erro ao tentar gravar os dados, limpe os campos da familia após fazer uma pesquisa e antes de adicionar uma nova familia.", 1);
        } else {

            if (verificarAtributos(familia)) {

                ArrayList<Morador> moradores = new ArrayList<>();
                moradores = buscarMoradorCpf(familia);

                if (moradores.size() > 0) { // SE HOUVER MORADOR COM CPF JÁ CADASTRADO

                    String mora = "";

                    for (Morador morador : moradores) {

                        mora += "- " + morador.getNome() + "\n";
                    }

                    throw new DAOException("CPF já cadastro dos Moradores: \n" + mora, 1);
                }

                dao.inserir(familia);

            }

        }
        
          
    }

    @Override
    public void alterar(Familia familia) throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Familia buscarFamilia() throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
   private boolean verificarAtributos(Familia familia) throws DAOException{
       
        if (familia.getEndereco().length() > 50) {
            throw new DAOException("Tamanho Maximo de Caracteres para Endereço é: 50", 1);
        }

        if (familia.getBairro().length() > 30) {
            throw new DAOException("Tamanho Maximo de Caracteres para Bairro é: 30", 1);
        }

        if (familia.getCidade().length() > 30) {
            throw new DAOException("Tamanho Maximo de Caracteres para Cidade é: 30", 1);
        }

        if (familia.getUf().length() > 2) {
            throw new DAOException("Tamanho Maximo de Caracteres para UF é: 2", 1);
        }

        if (familia.getNumero().length() > 10) {
            throw new DAOException("Tamanho Maximo de Caracteres para Número é: 10", 1);
        }

        if (familia.getComplemento().length() > 100) {
            throw new DAOException("Tamanho Maximo de Caracteres para Complemento é: 100", 1);
        }

        if (familia.getTelefone().length() > 13) {
            throw new DAOException("Tamanho Maximo de Caracteres para Telefone é: 13", 1);
        }

        for (Morador morador : familia.getMorador()) {

            if (morador.getNome().length() > 100) {
                throw new DAOException("Morador: " + morador.getNome() + " Tamanho Maximo de Caracteres para Nome é: 100", 1);
            }

            if (morador.getCpf().length() > 14) {
                throw new DAOException("Morador: " + morador.getNome() + " Tamanho Maximo de Caracteres para CPF é: 14", 1);
            }

            if (morador.getRg().length() > 10) {
                throw new DAOException("Morador: " + morador.getNome() + " Tamanho Maximo de Caracteres para RG é: 10", 1);
            }

            if (morador.getOrg_Emissor().length() > 6) {
                throw new DAOException("Morador: " + morador.getNome() + " Tamanho Maximo de Caracteres para Orgão Emissor é: 6", 1);
            }

            if (morador.getUfEmissor().length() > 2) {
                throw new DAOException("Morador: " + morador.getNome() + " Tamanho Maximo de Caracteres para UF Emissor é: 2", 1);
            }

        }

        return true;
    }

    @Override
    public ArrayList<Morador> buscarMoradorCpf(Familia familia) throws DAOException, SQLException {
       
        for (Morador morador : familia.getMorador()){
            int count = 0;
            if(morador.getCpf().trim().length() < 14){ // REMOVE DA LISTA OS MORADORES COM CPF EM BRANCO
                
                familia.getMorador().remove(count);
                count++;
            }  
        }
        
        return dao.buscarMoradorCpf(familia);
    }  
        
}
