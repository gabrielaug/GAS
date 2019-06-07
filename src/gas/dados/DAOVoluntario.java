/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.dados;

import gas.basicas.Voluntario;
import gas.interfaces.InterfaceVoluntario;
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
public class DAOVoluntario implements InterfaceVoluntario{

    @Override
    public void inserir(Voluntario voluntario) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "INSERT INTO Voluntario (Login,Senha,Nome,CPF,Profissao,Endereco,Complemento,Numero,Bairro,Cidade,UF,CEP,";
        sql+="Telefone,Celular,Dt_Nascumento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,voluntario.getLogin());
        pstm.setString(2,voluntario.getSenha());
        pstm.setString(3,voluntario.getNome());
        pstm.setString(4,voluntario.getCpf());
        pstm.setString(5,voluntario.getProfissao());
        pstm.setString(6,voluntario.getEndereco());
        pstm.setString(7,voluntario.getComplemento());
        pstm.setString(8,voluntario.getNumero());
        pstm.setString(9,voluntario.getBairro());
        pstm.setString(10,voluntario.getCidade());
        pstm.setString(11,voluntario.getUf());
        pstm.setString(12,voluntario.getCep());
        pstm.setString(13,voluntario.getTelefone());
        pstm.setString(14,voluntario.getCelular());
        pstm.setDate(15, (Date) voluntario.getDt_Nascimento());
        
            
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
    public void Alterar(Voluntario voluntario) throws DAOException, SQLException {
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "UPDATE Voluntario SET Senha = ?,Nome = ?,CPF = ?,Profissao = ?,Endereco = ?,Complemento = ?,Numero =?,Bairro = ?,Cidade = ?,UF = ?,CEP = ?,";
        sql+="Telefone = ?,Celular =?,Dt_Nascumento = ? WHERE Login = ? )";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,voluntario.getSenha());
        pstm.setString(2,voluntario.getNome());
        pstm.setString(3,voluntario.getCpf());
        pstm.setString(4,voluntario.getProfissao());
        pstm.setString(5,voluntario.getEndereco());
        pstm.setString(6,voluntario.getComplemento());
        pstm.setString(7,voluntario.getNumero());
        pstm.setString(8,voluntario.getBairro());
        pstm.setString(9,voluntario.getCidade());
        pstm.setString(10,voluntario.getUf());
        pstm.setString(11,voluntario.getCep());
        pstm.setString(12,voluntario.getTelefone());
        pstm.setString(13,voluntario.getCelular());
        pstm.setDate(14, (Date) voluntario.getDt_Nascimento());
        pstm.setString(15,voluntario.getLogin());
            
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
    public void excluir(Voluntario voluntario) throws DAOException, SQLException {
      
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "DELETE FROM Voluntario WHERE Login = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,voluntario.getLogin());
        
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
    public ArrayList<Voluntario> listarVoluntario() throws DAOException, SQLException {
        
         ArrayList<Voluntario> lista = new ArrayList<>();
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT Login,Senha,Nome,CPF,Profissao,Endereco,Complemento,Numero,Bairro,Cidade,UF,CEP,";
        sql+="Telefone,Celular,Dt_Nascumento,Status,Dt_Cadastro,StatusSenha)";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        while(rs.next()){
            Voluntario voluntario = new Voluntario();
            
            voluntario.setLogin(rs.getString("Login"));
            voluntario.setSenha(rs.getString("Senha"));
            voluntario.setNome(rs.getString("Nome"));
            voluntario.setCpf(rs.getString("CPF"));
            voluntario.setProfissao(rs.getString("Profissao"));
            voluntario.setEndereco(rs.getString("Endereco"));
            voluntario.setComplemento(rs.getString("Complemento"));
            voluntario.setNumero(rs.getString("Numero"));
            voluntario.setBairro(rs.getString("Bairro"));
            voluntario.setCidade(rs.getString("Cidade"));
            voluntario.setUf(rs.getString("UF"));
            voluntario.setCep(rs.getString("CEP"));
            voluntario.setTelefone(rs.getString("Telefone"));
            voluntario.setCelular(rs.getString("Celular"));
            voluntario.setDt_Nascimento(rs.getDate("Dt_Nascumento"));
            voluntario.setStatus(rs.getString("Status"));
            voluntario.setDt_Cadastro(rs.getString("Dt_Cadastro"));
            voluntario.setStatusSenha(rs.getInt("StatusSenha"));
            lista.add(voluntario);
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
    public Voluntario pesquisar(Voluntario voluntario) throws DAOException, SQLException {
        
        
        Voluntario retorno = new Voluntario();
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT Login,Senha,Nome,CPF,Profissao,Endereco,Complemento,Numero,Bairro,Cidade,UF,CEP,";
        sql+="Telefone,Celular,Dt_Nascumento,Status,Dt_Cadastro,StatusSenha WHERE = Login = ?)";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,voluntario.getLogin());
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        if(rs.next()){ 
            retorno.setLogin(rs.getString("Login"));
            retorno.setSenha(rs.getString("Senha"));
            retorno.setNome(rs.getString("Nome"));
            retorno.setCpf(rs.getString("CPF"));
            retorno.setProfissao(rs.getString("Profissao"));
            retorno.setEndereco(rs.getString("Endereco"));
            retorno.setComplemento(rs.getString("Complemento"));
            retorno.setNumero(rs.getString("Numero"));
            retorno.setBairro(rs.getString("Bairro"));
            retorno.setCidade(rs.getString("Cidade"));
            retorno.setUf(rs.getString("UF"));
            retorno.setCep(rs.getString("CEP"));
            retorno.setTelefone(rs.getString("Telefone"));
            retorno.setCelular(rs.getString("Celular"));
            retorno.setDt_Nascimento(rs.getDate("Dt_Nascumento"));
            retorno.setStatus(rs.getString("Status"));
            retorno.setDt_Cadastro(rs.getString("Dt_Cadastro"));
            retorno.setStatusSenha(rs.getInt("StatusSenha"));
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
