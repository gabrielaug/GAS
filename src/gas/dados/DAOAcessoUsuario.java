/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.dados;

import gas.basicas.AcessoUsuario;
import gas.interfaces.InterfaceAcessoUsuario;
import gas.util.Conexao;
import gas.util.DAOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Rafael Augusto
 */
public class DAOAcessoUsuario implements InterfaceAcessoUsuario{


    @Override
    public AcessoUsuario pesquisar(AcessoUsuario aU) throws DAOException, SQLException {
        return null;
       
    
        
    
    }

       

    @Override
    public void Alterar(AcessoUsuario aU) throws DAOException, SQLException {
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "UPDATE SET Acessos Login = ?, CadVolun = ?, AltVolun = ?, CadFami = ?, AltFami = ?, CadMora = ?,"
                + " AltMora = ?, GerRel = ?, AltParan = ?, GerenUser = ?, CadDoa = ?, AltDoa = ?, ExcDoa = ? "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
//        pstm.setString(1,aU.getVoluntario().getLogin());
        pstm.setString(2,aU.getCadVolun());
        pstm.setString(3,aU.getAltVolun());
        pstm.setString(4,aU.getCadFami());
        pstm.setString(5,aU.getAltFami());
        pstm.setString(6,aU.getCadMora());
        pstm.setString(7,aU.getAltMora());
        pstm.setString(8,aU.getGerRel());
        pstm.setString(9,aU.getAltParan());
        pstm.setString(10,aU.getGerenUser());
        pstm.setString(11,aU.getCadDoa());
        pstm.setString(12,aU.getAltDoa());
        pstm.setString(13,aU.getExcDoa());
        
        
        try{
         
        pstm.executeUpdate();
            
        }
        catch(SQLException ex){
            
        }
        finally{
           Conexao.closeConnection(con, pstm); 
        }
    
    }
    
}
