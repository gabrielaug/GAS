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
import java.sql.Date;
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
        
        String sql = "INSERT INTO Morador (Nome,CPF,RG,ORG_Emissor,UF_Emissor,Profissao,Telefone,Celular,Renda,Deficiente,Observacao,Dt_Nascimento,Nr_Familia,Representante) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
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
        pstm.setDate(12, (Date) morador.getDt_Nascimento());
        pstm.setInt(13, morador.getFamilia().getNr_Familia());
        pstm.setString(14, morador.getRepresentante());
        
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
                sql +="Deficiente = ?,Observacao = ?, Dt_Nascimento = ? WHERE Cod_Morador = ?";
        
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
        pstm.setDate(12, (Date) morador.getDt_Nascimento());
        pstm.setInt(13, morador.getCod_Morador());
        
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
    public ArrayList<Morador> listarMorador(Morador morador) throws DAOException, SQLException {
       
       /* 
        ArrayList<Morador> lista = new ArrayList<>();


           Connection con = Conexao.getInstance().getConnection();

           String sql = "SELECT Morador (Cod_Morador,Nome,CPF,RG,ORG_Emissor,UF_Emissor,Profissao,Telefone,Celular,Renda,Deficiente,Observacao,Nr_Familia FROM Morador WHERE Cod_Morador = ?";

           PreparedStatement pstm;
           pstm = con.prepareStatement(sql);
           pstm.setInt(1,morador.getCod_Morador());
           ResultSet rs = null;

           try{
           rs = pstm.executeQuery();

           while(rs.next()){
               Morador reMorador = new Morador();
               
               reMorador.setCod_Morador(rs.getInt("Cod_Morador"));
               reMorador.setNome(rs.getString("Nome"));
               reMorador.setCpf(rs.getString("CPF"));
               reMorador.setRg(rs.getString("RG"));
               reMorador.setOrg_Emissor(rs.getString("ORG_Emissor"));
               reMorador.setUfEmissor(rs.getString("UF_Emissor"));
               reMorador.setProfissao(rs.getString("Profissao"));
               reMorador.setTelefone(rs.getString("Telefone"));
               reMorador.setCelular(rs.getString("Celular"));
               reMorador.setRenda(rs.getDouble("Renda"));
               reMorador.setDeficiente(rs.getString("Deficiente"));
               reMorador.setObservacao(rs.getString("Observacao"));
               reMorador.getFamilia().setNr_Familia(rs.getInt("Nr_Familia"));
               lista.add(morador);
               
           }
           }
           catch(SQLException ex){

           }
           finally{
               Conexao.closeConnection(con, pstm, rs);
           }
           return lista;
        */
       
       return null;
    }

    @Override
    public Morador pesquisar(Morador morador) throws DAOException, SQLException {
        
        Morador retorno =  new Morador();
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT Morador (Cod_Morador,Nome,CPF,RG,ORG_Emissor,UF_Emissor,Profissao,Telefone,Celular,Renda,Deficiente,Observacao,Dt_Nascimento,Dt_Cadastro,Nr_Familia,Representante"
                + " FROM Morador WHERE Cod_Morador= ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setInt(1, morador.getCod_Morador());
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        if(rs.next()){
               retorno.setCod_Morador(rs.getInt("Cod_Morador"));
               retorno.setNome(rs.getString("Nome"));
               retorno.setCpf(rs.getString("CPF"));
               retorno.setRg(rs.getString("RG"));
               retorno.setOrg_Emissor(rs.getString("ORG_Emissor"));
               retorno.setUfEmissor(rs.getString("UF_Emissor"));
               retorno.setProfissao(rs.getString("Profissao"));
               retorno.setTelefone(rs.getString("Telefone"));
               retorno.setCelular(rs.getString("Celular"));
               retorno.setRenda(rs.getDouble("Renda"));
               retorno.setDeficiente(rs.getString("Deficiente"));
               retorno.setObservacao(rs.getString("Observacao"));
               retorno.setDt_Nascimento(rs.getDate("Dt_Nascimento"));
               retorno.setDt_Cadastro(rs.getDate("Dt_Cadastro"));
               retorno.getFamilia().setNr_Familia(rs.getInt("Nr_Familia"));
               retorno.setRepresentante(rs.getString("Representante"));
            
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
