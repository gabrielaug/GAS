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
        
//          String sql = "INSERT INTO Voluntario (Login,Senha,Nome) VALUES (?,?,?)";
        String sql = "INSERT INTO Voluntario (Login,Senha,Nome,CPF,Profissao,Endereco,Complemento,Numero,Bairro,Cidade,UF,CEP,";
        sql+="Telefone,Celular,Dt_Nascimento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        System.out.println(voluntario.getLogin()+"/n"+voluntario.getSenha()+"/n" );
        
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
        pstm.setString(15,voluntario.getDt_Nascimento());
        
        System.out.println(pstm);
        
        try{
         
        pstm.executeUpdate();
            
        }
        catch(SQLException ex){
            System.out.println(ex);
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
        pstm.setString(14,voluntario.getDt_Nascimento());
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
        
        String sql = "SELECT v.Login,v.Senha,v.Nome,v.CPF,v.Profissao,v.Endereco,v.Complemento,v.Numero,v.Bairro,v.Cidade,v.UF,v.CEP,"
                +"v.Telefone,v.Celular,v.Dt_Nascumento,v.`Status`,v.Dt_Cadastro,v.StatusSenha,a.CadVolun,a.AltVolun,a.CadFami,a.AltFami,"
                +"a.CadMora,a.AltMora,a.GerRel,a.AltParan,a.GerenUser,a.CadDoa,a.AltDoa,a.ExcDoa,a.CadAux,a.AltAux,a.ExcAux FROM Voluntario as v\n"
                +"INNER JOIN Acessos AS a ON a.login = v.login";
        
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
            voluntario.setDt_Nascimento(rs.getString("Dt_Nascumento"));
            voluntario.setStatus(rs.getString("Status"));
            voluntario.setDt_Cadastro(rs.getString("Dt_Cadastro"));
            voluntario.setStatusSenha(rs.getInt("StatusSenha"));
            voluntario.getAcessoUsuario().setCadVolun(rs.getString("CadVolun"));
            voluntario.getAcessoUsuario().setAltVolun(rs.getString("AltVolun"));
            voluntario.getAcessoUsuario().setCadFami(rs.getString("CadFami"));
            voluntario.getAcessoUsuario().setAltFami(rs.getString("AltFami"));
            voluntario.getAcessoUsuario().setCadMora(rs.getString("CadMora"));
            voluntario.getAcessoUsuario().setAltMora(rs.getString("AltMora"));
            voluntario.getAcessoUsuario().setGerRel(rs.getString("GerRel"));
            voluntario.getAcessoUsuario().setAltParan(rs.getString("AltParan"));
            voluntario.getAcessoUsuario().setGerenUser(rs.getString("GerenUser"));
            voluntario.getAcessoUsuario().setCadDoa(rs.getString("CadDoa"));
            voluntario.getAcessoUsuario().setAltDoa(rs.getString("AltDoa"));
            voluntario.getAcessoUsuario().setExcDoa(rs.getString("ExcDoa"));
            voluntario.getAcessoUsuario().setCadAux(rs.getString("CadAux"));
            voluntario.getAcessoUsuario().setAltAux(rs.getString("AltAux"));
            voluntario.getAcessoUsuario().setExcAux(rs.getString("ExcAux"));
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
        
        String sql = "SELECT v.Login,v.Senha,v.Nome,v.CPF,v.Profissao,v.Endereco,v.Complemento,v.Numero,v.Bairro,v.Cidade,v.UF,v.CEP,"
                +"v.Telefone,v.Celular,v.Dt_Nascumento,v.`Status`,v.Dt_Cadastro,v.StatusSenha,a.CadVolun,a.AltVolun,a.CadFami,a.AltFami,"
                +"a.CadMora,a.AltMora,a.GerRel,a.AltParan,a.GerenUser,a.CadDoa,a.AltDoa,a.ExcDoa,a.CadAux,a.AltAux,a.ExcAux FROM Voluntario as v\n"
                +"INNER JOIN Acessos AS a ON a.login = v.login WHERE v.Login = ?";
        
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
            retorno.setDt_Nascimento(rs.getString("Dt_Nascumento"));
            retorno.setStatus(rs.getString("Status"));
            retorno.setDt_Cadastro(rs.getString("Dt_Cadastro"));
            retorno.setStatusSenha(rs.getInt("StatusSenha"));
            retorno.getAcessoUsuario().setCadVolun(rs.getString("CadVolun"));
            retorno.getAcessoUsuario().setAltVolun(rs.getString("AltVolun"));
            retorno.getAcessoUsuario().setCadFami(rs.getString("CadFami"));
            retorno.getAcessoUsuario().setAltFami(rs.getString("AltFami"));
            retorno.getAcessoUsuario().setCadMora(rs.getString("CadMora"));
            retorno.getAcessoUsuario().setAltMora(rs.getString("AltMora"));
            retorno.getAcessoUsuario().setGerRel(rs.getString("GerRel"));
            retorno.getAcessoUsuario().setAltParan(rs.getString("AltParan"));
            retorno.getAcessoUsuario().setGerenUser(rs.getString("GerenUser"));
            retorno.getAcessoUsuario().setCadDoa(rs.getString("CadDoa"));
            retorno.getAcessoUsuario().setAltDoa(rs.getString("AltDoa"));
            retorno.getAcessoUsuario().setExcDoa(rs.getString("ExcDoa"));
            retorno.getAcessoUsuario().setCadAux(rs.getString("CadAux"));
            retorno.getAcessoUsuario().setAltAux(rs.getString("AltAux"));
            retorno.getAcessoUsuario().setExcAux(rs.getString("ExcAux"));
            
        }
        }
        catch(SQLException ex){
            
        }
        finally{
            Conexao.closeConnection(con, pstm, rs);
        }
        return retorno;
        
        
    }

    
    
    /**
     * VERIFICAR SE EXISTE O USUARIO NO BANCO DE DADOS E TRAZ AS PERMISSÕES
     * @param voluntario OBJETO COM O USUARIO A SER PROCURADO
     * @return RETORNA O VOLUNTARIO E MANDA PARA O FRAME PRINCIPAL AO QUAL SERA USADO PARA IDENTIFICA AS PERMISSÕES NO SISTEMA
     * @throws DAOException
     * @throws SQLException 
     */
    @Override
    public Voluntario loginVoluntario(Voluntario voluntario) throws DAOException, SQLException {
        
        Voluntario retorno = new Voluntario();
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT v.Login,v.Senha,v.`Status`,v.StatusSenha,a.CadVolun,a.AltVolun,a.CadFami,a.AltFami,a.CadMora,a.AltMora,a.GerRel,a.AltParan,a.GerenUser,a.CadDoa,"
                +"a.AltDoa,a.ExcDoa,a.CadAux,a.AltAux,a.ExcAux FROM Voluntario AS v INNER JOIN Acessos AS a ON a.login = v.login WHERE v.Login = ? AND v.Senha = ?";
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1, voluntario.getLogin());
        pstm.setString(2, voluntario.getSenha());
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        if(rs.next()){ 
            retorno.setLogin(rs.getString("Login"));
            retorno.setSenha(rs.getString("Senha"));
            retorno.setStatus(rs.getString("Status"));
            retorno.setStatusSenha(rs.getInt("StatusSenha"));
            retorno.getAcessoUsuario().setCadVolun(rs.getString("CadVolun"));
            retorno.getAcessoUsuario().setAltVolun(rs.getString("AltVolun"));
            retorno.getAcessoUsuario().setCadFami(rs.getString("CadFami"));
            retorno.getAcessoUsuario().setAltFami(rs.getString("AltFami"));
            retorno.getAcessoUsuario().setCadMora(rs.getString("CadMora"));
            retorno.getAcessoUsuario().setAltMora(rs.getString("AltMora"));
            retorno.getAcessoUsuario().setGerRel(rs.getString("GerRel"));
            retorno.getAcessoUsuario().setAltParan(rs.getString("AltParan"));
            retorno.getAcessoUsuario().setGerenUser(rs.getString("GerenUser"));
            retorno.getAcessoUsuario().setCadDoa(rs.getString("CadDoa"));
            retorno.getAcessoUsuario().setAltDoa(rs.getString("AltDoa"));
            retorno.getAcessoUsuario().setExcDoa(rs.getString("ExcDoa"));
            retorno.getAcessoUsuario().setCadAux(rs.getString("CadAux"));
            retorno.getAcessoUsuario().setAltAux(rs.getString("AltAux"));
            retorno.getAcessoUsuario().setExcAux(rs.getString("ExcAux"));
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
    public boolean AtualizarAcessos(Voluntario voluntario) throws DAOException, SQLException {
      
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "UPDATE Voluntario SET `Status` = ?,StatusSenha = ? WHERE Login = ? ";
        
        String sql2 = "UPDATE Acessos SET CadVolun = ?,AltVolun = ?,CadFami = ?,AltFami = ?,CadMora = ?,AltMora = ?,GerRel = ?,AltParan = ?,GerenUser = ?,"
                + "CadDoa = ?,AltDoa = ?,ExcDoa = ?,CadAux = ?, AltAux = ?, ExcAux = ? WHERE Login = ?";
        
        
        
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        pstm.setString(1,voluntario.getStatus());
        pstm.setInt(2,voluntario.getStatusSenha());
        pstm.setString(3,voluntario.getLogin());
        
        PreparedStatement pstm2;
        pstm2 = con.prepareStatement(sql2);
        pstm2.setString(1,voluntario.getAcessoUsuario().getCadVolun());
        pstm2.setString(2,voluntario.getAcessoUsuario().getAltVolun());
        pstm2.setString(3,voluntario.getAcessoUsuario().getCadFami());
        pstm2.setString(4,voluntario.getAcessoUsuario().getAltFami());
        pstm2.setString(5,voluntario.getAcessoUsuario().getCadMora());
        pstm2.setString(6,voluntario.getAcessoUsuario().getAltMora());
        pstm2.setString(7,voluntario.getAcessoUsuario().getGerRel());
        pstm2.setString(8,voluntario.getAcessoUsuario().getAltParan());
        pstm2.setString(9,voluntario.getAcessoUsuario().getGerenUser());
        pstm2.setString(10,voluntario.getAcessoUsuario().getCadDoa());
        pstm2.setString(11,voluntario.getAcessoUsuario().getAltDoa());
        pstm2.setString(12,voluntario.getAcessoUsuario().getExcDoa());
        pstm2.setString(13,voluntario.getAcessoUsuario().getCadAux());
        pstm2.setString(14,voluntario.getAcessoUsuario().getAltAux());
        pstm2.setString(15,voluntario.getAcessoUsuario().getExcAux());
        
        pstm2.setString(16,voluntario.getLogin());
            
        try{
         
        pstm.executeUpdate();
        pstm2.executeUpdate();
            
        }
        catch(SQLException ex){
            
        }
        finally{
           Conexao.closeConnection(con, pstm); 
        }
        return true;
        
         
}
}
