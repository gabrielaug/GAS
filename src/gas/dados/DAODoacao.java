/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.dados;

import gas.basicas.Doacao;
import gas.interfaces.InterfaceDoacao;
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
public class DAODoacao implements InterfaceDoacao{

    @Override
    public void inserir(Doacao doacao) throws DAOException, SQLException {
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "INSERT INTO Doacao (Descricao) VALUES (?)";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,doacao.getDescricao());
        
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
    public void excluir(Doacao doacao) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "DELETE FROM Doacao WHERE Nr_Doacao = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setInt(1,doacao.getNr_Doacao());
        
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
    public ArrayList<Doacao> listarDoacao() throws DAOException, SQLException {
        
            ArrayList<Doacao> lista = new ArrayList<>();


           Connection con = Conexao.getInstance().getConnection();

           String sql = "SELECT Nr_Doacao,Descricao FROM Doacao";

           PreparedStatement pstm;
           pstm = con.prepareStatement(sql);
           ResultSet rs = null;

           try{
           rs = pstm.executeQuery();

           while(rs.next()){
               Doacao doacao = new Doacao();
               doacao.setNr_Doacao(rs.getInt("Nr_Doacao"));
               doacao.setDescricao(rs.getString("Descricao"));

               lista.add(doacao);
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
     * METODO USADO PARA PESQUISAR UMA DOACAO NO BANCO DE DADOS
     * @param doacao OBJETO A SER PESQUISADO
     * @return RETORNA UM OBJETO DOACAO 
     * @throws DAOException
     * @throws SQLException 
     */
    @Override
    public Doacao pesquisar(Doacao doacao) throws DAOException, SQLException {
        
        Doacao retorno =  new Doacao();
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT Nr_Doacao,Descricao FROM Doacao WHERE Nr_Doacao = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setInt(1, doacao.getNr_Doacao());
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        if(rs.next()){
            retorno.setNr_Doacao(rs.getInt("Nr_Doacao"));
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
    
    
    
}
