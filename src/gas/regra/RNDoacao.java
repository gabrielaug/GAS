/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.regra;

import gas.basicas.Doacao;
import gas.dados.DAODoacao;
import gas.interfaces.InterfaceDoacao;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public class RNDoacao implements InterfaceDoacao{

    private DAODoacao dao;
    
    public RNDoacao(){
        dao = new DAODoacao();
    }
    
    
    @Override
    public void inserir(Doacao doacao) throws DAOException, SQLException {
        
        if(doacao.getDescricao().length() > 40){
            throw new DAOException("Maximo de caracteres atingido: 40",1);
        }
        
        if(doacao.getDescricao().trim().isEmpty() || doacao.getDescricao().equalsIgnoreCase("")){
            throw new DAOException("Descrição em Branco.",1);
        }
        
            dao.inserir(doacao);
       
        
        
    }

    @Override
    public void excluir(Doacao doacao) throws DAOException, SQLException {
        
        
        if(doacao.getNr_Doacao() == 0){
            throw new DAOException("Doação não selecionada",1);
        }
        
        if(pesquisarMov(doacao)){
            throw new DAOException("Não é possivel excluir Doação com movimentação",1);
        }else{
            dao.excluir(doacao);
        }
        
        
        
    }

    @Override
    public ArrayList<Doacao> listarDoacao() throws DAOException, SQLException {
       
        
        
        return dao.listarDoacao();
    }

    @Override
    public Doacao pesquisar(Doacao doacao) throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean pesquisarMov(Doacao doacao) throws DAOException, SQLException {
        
        
        return dao.pesquisarMov(doacao);
    }
    
}
