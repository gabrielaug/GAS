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
import java.sql.ResultSet;
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
        pstm.setInt(1,auxilio.getNr_Aux());
        
        try{
            
        pstm.execute();
        
        }
        catch(SQLException ex){
            
        }
        finally{   
            
        Conexao.closeConnection(con, pstm);
        
        }
        
    }

    /**
     * METODO DE BUSCA TODOS OS AUXILIOS EXISTENTES
     * @return RETORNAR UM ARRAYLIST DE AUXILIO
     * @throws DAOException
     * @throws SQLException 
     */
    @Override
    public ArrayList<Auxilio> listarAuxilio() throws DAOException, SQLException {
        
        ArrayList<Auxilio> lista = new ArrayList<>();
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT Nr_Aux,Descricao FROM Auxilio";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        while(rs.next()){
            Auxilio auxilio = new Auxilio();
            auxilio.setNr_Aux(rs.getInt("Nr_Aux"));
            auxilio.setDescricao(rs.getString("Descricao"));
            
            lista.add(auxilio);
        }
        }
        catch(SQLException ex){
            
        }
        finally{
            Conexao.closeConnection(con, pstm, rs);
        }
        return lista;
        
    }

    /**
     * METODO USADO PARA PESQUISAR SE O AUXILIO EXISTE
     * @param auxilio OBJETO AUXILIO
     * @return RETORNA UM AUXILIO
     * @throws DAOException
     * @throws SQLException 
     */
    @Override
    public Auxilio pesquisar(Auxilio auxilio) throws DAOException, SQLException {
        
       Auxilio retorno =  new Auxilio();
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT Nr_Aux,Descricao FROM Auxilio WHERE Nr_Aux = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setInt(1, auxilio.getNr_Aux());
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        if(rs.next()){
            retorno.setNr_Aux(rs.getInt("Nr_Aux"));
            retorno.setDescricao(rs.getString("Descricao"));
            
        }
        }
        catch(SQLException ex){
            
        }
        finally{
            Conexao.closeConnection(con, pstm, rs);
        }
        return retorno;
        
        
        
    }

    @Override
    public void alterar(Auxilio auxilio) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "UPDATE Auxilio SET Descricao = ? WHERE Nr_Aux = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,auxilio.getDescricao());
        pstm.setInt(2, auxilio.getNr_Aux());
        
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
    public boolean pesquisarMov(Auxilio auxilio) throws DAOException, SQLException {
        
        boolean retorno = false;
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT Nr_Aux FROM Aux_Familia WHERE Nr_Aux = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setInt(1, auxilio.getNr_Aux());
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        if(rs.next()){
            retorno = true;
            
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
