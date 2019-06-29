/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.interfaces;

import gas.basicas.Parametros;
import gas.util.DAOException;
import java.sql.SQLException;

/**
 *
 * @author Gabriel Augusto
 */
public interface InterfaceParametros {
    
    public void alterar(Parametros parametros) throws DAOException, SQLException;
    public Parametros buscarParametros() throws DAOException, SQLException;
    
}
