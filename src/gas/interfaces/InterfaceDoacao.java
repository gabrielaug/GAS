/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.interfaces;

import gas.basicas.Doacao;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public interface InterfaceDoacao {
    
    public void inserir(Doacao doacao) throws DAOException, SQLException;
    public void excluir(Doacao doacao) throws DAOException, SQLException;
    public ArrayList<Doacao> listarDoacao () throws DAOException, SQLException;
    public Doacao pesquisar(Doacao doacao) throws DAOException, SQLException;
    
}
