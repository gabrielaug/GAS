/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.interfaces;

import gas.basicas.AcessoUsuario;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rafael Augusto
 */
public interface InterfaceAcessoUsuario {
    
    public void Alterar(AcessoUsuario aU) throws DAOException, SQLException;
    public AcessoUsuario pesquisar(AcessoUsuario AU) throws DAOException, SQLException;
    
}
