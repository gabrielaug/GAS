/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.interfaces;

import gas.basicas.Auxilio;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public interface InterfaceAuxilio {
    
    
    public void inserir(Auxilio auxilio) throws DAOException, SQLException;
    public void excluir(Auxilio auxilio) throws DAOException, SQLException;
    public ArrayList<Auxilio> listarAuxilio () throws DAOException, SQLException;
}
