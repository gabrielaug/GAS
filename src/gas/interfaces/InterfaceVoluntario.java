/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.interfaces;

import gas.basicas.Voluntario;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public interface InterfaceVoluntario {
    
    
    public boolean inserir(Voluntario voluntario) throws DAOException, SQLException;
    public void Alterar (Voluntario voluntario) throws DAOException, SQLException;
    public void excluir(Voluntario voluntario) throws DAOException, SQLException;
    public ArrayList<Voluntario> listarVoluntario () throws DAOException, SQLException;
    public Voluntario pesquisar(Voluntario voluntario) throws DAOException, SQLException;
    public Voluntario loginVoluntario (Voluntario voluntario) throws DAOException, SQLException;
    public boolean AtualizarAcessos(Voluntario voluntario) throws DAOException, SQLException;
    
}
