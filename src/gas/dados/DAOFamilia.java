/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.dados;

import gas.basicas.Familia;
import gas.basicas.Morador;
import gas.interfaces.InterfaceFamilia;
import gas.util.Conexao;
import gas.util.DAOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Augusto
 */
public class DAOFamilia implements InterfaceFamilia{

    @Override
    public void inserir(Familia familia) throws DAOException, SQLException {
        
        int idFamilia;

        Connection con = Conexao.getInstance().getConnection();

        String sql = "INSERT INTO Familia (Endereco,Complemento,Numero,Bairro,Cidade,UF,CEP,Telefone) VALUES ";
        sql += "(?,?,?,?,?,?,?,?)";

        PreparedStatement pstm;
        pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pstm.setString(1, familia.getEndereco());
        pstm.setString(2, familia.getComplemento());
        pstm.setString(3, familia.getNumero());
        pstm.setString(4, familia.getBairro());
        pstm.setString(5, familia.getCidade());
        pstm.setString(6, familia.getUf());
        pstm.setString(7, familia.getCep());
        pstm.setString(8, familia.getTelefone());

        try {
            
            pstm.executeUpdate();
            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                idFamilia = Integer.parseInt(String.valueOf(rs.getLong(1)));
            } else {
                throw new SQLException("Adicionar Familia Falhou, ID não obtida.");
            }

            familia.setNr_Familia(idFamilia);
            
            for (Morador morador : familia.getMorador()) {

                String sql2 = "INSERT INTO Morador (Nome,CPF,RG,ORG_Emissor,UF_Emissor,Profissao,Celular,Renda,Deficiente,Observacao,Dt_Nascimento,Representante,Nr_Familia) VALUES ";
                sql2 += "(?,?,?,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement pstm2;
                pstm2 = con.prepareStatement(sql2);
                pstm2.setString(1, morador.getNome());
                pstm2.setString(2, morador.getCpf());
                pstm2.setString(3, morador.getRg());
                pstm2.setString(4, morador.getOrg_Emissor());
                pstm2.setString(5, morador.getUfEmissor());
                pstm2.setString(6, morador.getProfissao());
                pstm2.setString(7, morador.getCelular());
                pstm2.setDouble(8, morador.getRenda());
                pstm2.setString(9, morador.getDeficiente());
                pstm2.setString(10, morador.getObservacao());
                pstm2.setString(11, morador.getDt_Nascimento());
                pstm2.setString(12, morador.getRepresentante());
                pstm2.setInt(13, familia.getNr_Familia());
                pstm2.executeUpdate();

            }
            
        } catch (SQLException ex) {

        }finally{
        Conexao.closeConnection(con, pstm);
        }

    }

    @Override
    public void alterar(Familia familia) throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Familia buscarFamilia() throws DAOException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Morador> buscarMoradorCpf(Familia familia) throws DAOException, SQLException {
        
       ArrayList<Morador> lista = new ArrayList<>();
        
        
        Connection con = Conexao.getInstance().getConnection();
        
        String sql = "SELECT Nome FROM Morador WHERE CPF IN(";
 
            int contador = 1;
        int count = familia.getMorador().size();

        for (Morador morador : familia.getMorador()) {

            if (contador == count) {
                sql += morador.getCpf();
                sql += ")";
            } else {

                sql += morador.getCpf() + ",";
                contador++;

            }

        }
           
        PreparedStatement pstm;
        pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        try{
        rs = pstm.executeQuery();
        
        while(rs.next()){
            Morador mora = new Morador();
            mora.setNome(rs.getString("Nome"));
            
            lista.add(mora);
        }
        }
        catch(SQLException ex){
            
        }
        finally{
            Conexao.closeConnection(con, pstm, rs);
        }
        return lista; 
        
    }
       
    
}
