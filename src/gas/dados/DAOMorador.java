/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.dados;

import gas.basicas.Morador;
import gas.interfaces.InterfaceMorador;
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
public class DAOMorador implements InterfaceMorador{

    @Override
    public void inserir(Morador morador) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "INSERT INTO Morador (Nome,CPF,RG,ORG_Emissor,UF_Emissor,Profissao,Telefone,Celular,Renda,Deficiente,Observacao) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,morador.getNome());
        pstm.setString(2,morador.getCpf());
        pstm.setString(3,morador.getRg());
        pstm.setString(4,morador.getOrg_Emissor());
        pstm.setString(5,morador.getUfEmissor());
        pstm.setString(6,morador.getProfissao());
        pstm.setString(7,morador.getTelefone());
        pstm.setString(8,morador.getCelular());
        pstm.setDouble(9,morador.getRenda());
        pstm.setString(10,morador.getDeficiente());
        pstm.setString(11,morador.getObservacao());
        
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
    public void Alterar(Morador morador) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "UPDATE Morador Nome = ?,CPF = ? ,RG = ?,ORG_Emissor = ?,UF_Emissor = ?,Profissao = ?,Telefone = ?,Celular = ?,Renda = ?,";
                sql +="Deficiente = ?,Observacao = ? WHERE ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,morador.getNome());
        pstm.setString(2,morador.getCpf());
        pstm.setString(3,morador.getRg());
        pstm.setString(4,morador.getOrg_Emissor());
        pstm.setString(5,morador.getUfEmissor());
        pstm.setString(6,morador.getProfissao());
        pstm.setString(7,morador.getTelefone());
        pstm.setString(8,morador.getCelular());
        pstm.setDouble(9,morador.getRenda());
        pstm.setString(10,morador.getDeficiente());
        pstm.setString(11,morador.getObservacao());
        pstm.setInt(16, morador.getCod_Morador());
        
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
    public void excluir(Morador morador) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "DELETE FROM Morador WHERE Cod_Morador = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setInt(1,morador.getCod_Morador());
        
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
    public ArrayList<Morador> listarMorador() throws DAOException, SQLException {
       
        
        ArrayList<Morador> lista = new ArrayList<>();


           Connection con = Conexao.getInstance().getConnection();

           String sql = "SELECT Morador (Nome,CPF,RG,ORG_Emissor,UF_Emissor,Profissao,Telefone,Celular,Renda,Deficiente,Observacao FROM Morador WHERE ";

           PreparedStatement pstm;
           pstm = con.prepareStatement(sql);
           ResultSet rs = null;

           try{
           rs = pstm.executeQuery();

           while(rs.next()){
               Morador morador = new Morador();
               
           }
           }
           catch(SQLException ex){

           }
           finally{
               Conexao.closeConnection(con, pstm, rs);
           }
           return lista;
        
    }

    @Override
    public Morador pesquisar(Morador morador) throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
