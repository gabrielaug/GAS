/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.interfaces;

import gas.basicas.Doadores;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList; 
 
/**
 *
 * @author joann
 */
public interface InterfaceDoadores {
   
    
    
    public void inserir(Doadores doadores) throws DAOException, SQLException;
    public void alterar(Doadores doadores) throws DAOException, SQLException;
    public ArrayList <Doadores> listardoadores(Doadores doadores) throws DAOException, SQLException;
    public void pesquisar (Doadores doadores) throws DAOException, SQLException;
    
    
}
