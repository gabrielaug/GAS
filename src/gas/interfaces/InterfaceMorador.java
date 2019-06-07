/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.interfaces;

import gas.basicas.Morador;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public interface InterfaceMorador {
    
    
    public void inserir(Morador morador) throws DAOException, SQLException;
    public void Alterar (Morador morador) throws DAOException, SQLException;
    public void excluir(Morador morador) throws DAOException, SQLException;
    public ArrayList<Morador> listarMorador (Morador morador) throws DAOException, SQLException;
    public Morador pesquisar(Morador morador) throws DAOException, SQLException;

    
}
