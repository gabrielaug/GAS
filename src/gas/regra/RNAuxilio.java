/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.regra;

import gas.basicas.Auxilio;
import gas.dados.DAOAuxilio;
import gas.interfaces.InterfaceAuxilio;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public class RNAuxilio implements InterfaceAuxilio{

    private DAOAuxilio dao;
    
    
    /**
     * CONSTRUTOR
     */
    public RNAuxilio(){
        dao = new DAOAuxilio();
    }
    
    @Override
    public void inserir(Auxilio auxilio) throws DAOException, SQLException {
        
        if(auxilio.getDescricao().length() > 35){
            throw new DAOException("Error máximo de caracteres atingido: 35",1);
        }
        
        
        dao.inserir(auxilio);
        
    }

    @Override
    public void excluir(Auxilio auxilio) throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Auxilio> listarAuxilio() throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Auxilio pesquisar(Auxilio auxilio) throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
