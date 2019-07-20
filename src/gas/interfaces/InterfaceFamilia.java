/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.interfaces;

import gas.basicas.Familia;
import gas.basicas.Morador;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public interface InterfaceFamilia {
    

    public void inserir(Familia familia) throws DAOException, SQLException;
    public void alterar(Familia familia) throws DAOException, SQLException;
    public Familia buscarFamilia () throws DAOException, SQLException;
    public ArrayList<Morador> buscarMoradorCpf(Familia familia) throws DAOException, SQLException;
    
}
