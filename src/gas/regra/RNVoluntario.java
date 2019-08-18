/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.regra;

import gas.basicas.Voluntario;
import gas.dados.DAOVoluntario;
import gas.interfaces.InterfaceVoluntario;
import gas.util.DAOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public class RNVoluntario implements InterfaceVoluntario{
    
    private DAOVoluntario dao;
    
    
    /**
     * CONSTRUTOR PADRÃO
     */
    public RNVoluntario(){
        dao =  new DAOVoluntario();
        
    }
    

    @Override
    public void inserir(Voluntario voluntario) throws DAOException, SQLException {
       
        System.out.println(voluntario.getLogin());
        dao.inserir(voluntario);
        
        
    }

    @Override
    public void Alterar(Voluntario voluntario) throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Voluntario voluntario) throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Voluntario> listarVoluntario() throws DAOException, SQLException {
        
        
        return dao.listarVoluntario();
    }

    @Override
    public Voluntario pesquisar(Voluntario voluntario) throws DAOException, SQLException {
        
        
        
        return dao.pesquisar(voluntario);
    }

    @Override
    public Voluntario loginVoluntario(Voluntario voluntario) throws DAOException, SQLException {
        
      Voluntario retorno = null;
      
      if(voluntario.getLogin().equals("") || voluntario.getLogin().trim().isEmpty()){
          throw new DAOException("Login em Branco.",1);
      }

      retorno = dao.loginVoluntario(voluntario);
      
      if(retorno.getLogin() == null){
          throw new DAOException("Usuário ou Senha incorreta.",1);
      }else if(retorno.getStatus().equalsIgnoreCase("I")){
          throw new DAOException("Usuário Inativo, Entre em Contato com o Administrador.",1);
      }   
       return retorno; 
    }

    @Override
    public boolean AtualizarAcessos(Voluntario voluntario) throws DAOException, SQLException {
        
        
        
        return dao.AtualizarAcessos(voluntario);
    }
    
}
