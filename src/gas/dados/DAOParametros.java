/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.dados;

import gas.basicas.Parametros;
import gas.interfaces.InterfaceParametros;
import gas.util.Conexao;
import gas.util.DAOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gabriel Augusto
 */
public class DAOParametros implements InterfaceParametros{


    @Override
    public void alterar(Parametros parametros) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "UPDATE Parametros SET SysMaximizado = ?,AtuPermUsuOn = ?,AltSenhaPrimeiAcesso = ? WHERE Parametro = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,parametros.getSysMaximizado());
        pstm.setString(2,parametros.getAtuPermUsuOn());
        pstm.setString(3,parametros.getAltSenhaPrimeiAcesso());
        pstm.setInt(4, parametros.getParametro());
            
        try{
         
        pstm.executeUpdate();
            
        }
        catch(SQLException ex){
            
        }
        finally{
           Conexao.closeConnection(con, pstm); 
        }
        
    }

    @Override
    public Parametros buscarParametros() throws DAOException, SQLException {
       
        Parametros retorno =  new Parametros();
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT Licenca,SysMaximizado,AtuPermUsuOn,AltSenhaPrimeiAcesso FROM Parametros WHERE Parametro = 1";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        if(rs.next()){
            retorno.setLicenca(rs.getString("Licenca"));
            retorno.setSysMaximizado(rs.getString("SysMaximizado"));
            retorno.setAtuPermUsuOn(rs.getString("AtuPermUsuOn"));
            retorno.setAltSenhaPrimeiAcesso(rs.getString("AltSenhaPrimeiAcesso"));
            
        }
        }
        catch(SQLException ex){
            
        }
        finally{
            Conexao.closeConnection(con, pstm, rs);
        }
        return retorno;
        
        
    }
    
    
    
    
}
