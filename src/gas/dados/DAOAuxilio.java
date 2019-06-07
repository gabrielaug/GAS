/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.dados;

import gas.basicas.Auxilio;
import gas.interfaces.InterfaceAuxilio;
import gas.util.Conexao;
import gas.util.DAOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public class DAOAuxilio implements InterfaceAuxilio{

    @Override
    public void inserir(Auxilio auxilio) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "INSERT INTO Auxilio (Descricao) VALUES (?)";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,auxilio.getDescricao());
        
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
    public void excluir(Auxilio auxilio) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "DELETE FROM Auxilio WHERE Nr_Aux = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setInt(1,auxilio.getNr_Auix());
        
        try{
            
        pstm.execute();
        
        }
        catch(SQLException ex){
            
        }
        finally{   
            
        Conexao.closeConnection(con, pstm);
        
        }
        
    }

    @Override
    public ArrayList<Auxilio> listarAuxilio() throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
