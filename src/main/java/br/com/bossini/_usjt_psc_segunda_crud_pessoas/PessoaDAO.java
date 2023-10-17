/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_crud_pessoas;

import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class PessoaDAO {
    // Data Access Object
    // Oferece funcionalidades de acesso aos dados no banco de dados de tipo Pessoa
    
    public void cadastrar(Pessoa pessoa) throws Exception {
        String nome = pessoa.getNome();
        String fone = pessoa.getFone();
        String email = pessoa.getEmail();
        
        //1 - Especificar o comando SQL
        String sql = "INSERT INTO tb_pessoa (nome, fone, email) VALUES (?, ?, ?);";
        //2 - Abrir uma conexão com o mySql
        var fabricaDeConexoes = new ConnectionFactory();
        var conexao = fabricaDeConexoes.conectar();
        //3 - Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4 - Substituir os eventuais placeholders
        ps.setString(1, nome);
        ps.setString(2, fone);
        ps.setString(3, email);
        //5 - Executar o comando preparado
        ps.execute();
        //6 - Fechar a conexão
        ps.close();
        conexao.close();    
    }
    
    public void atualizar (Pessoa pessoa) throws Exception {
        int codigo = pessoa.getCodigo();
        String nome = pessoa.getNome();
        String fone = pessoa.getFone();
        String email = pessoa.getEmail();
        
        //1. Especificar o comando SQL
        String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE cod_pessoa = ?;";
        
        //2 - Abrir uma conexão com o mySql
        
        try (
                var conexao = ConnectionFactory.conectar();
                //3 - Preparar o comando
                var ps = conexao.prepareStatement(sql);
            ){
            //4 - Substituir os eventuais placeholders
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            //5 - Executar o comando preparado
            ps.execute();
            //6 - Fechar a conexão -> Já foi feito pelo try
        } catch (Exception e) {
        }
    }
    
    public void desativar (Pessoa pessoa) throws Exception {
        //1. Especificar o comando SQL
        
    }
    
    public void deletar (int codigo) throws Exception {
        //1. Especificar o comando SQL
        String sql = "DELETE FROM tb_pessoa WHERE cod_pessoa = ?;";
        //2 - Abrir uma conexão com o SQL
        try (
                var conexao = new ConnectionFactory().conectar();
                //3 - Preparar o comando
                var ps = conexao.prepareStatement(sql);
            ){
            //4 - Substituir os eventuais placeholders
            ps.setInt(1, codigo);
            //5 - Executar o comando preparado
            ps.execute();
            //6 - Fechar a conexão -> Já foi feito pelo try
        } catch (Exception e) {
        }
        
    }
}
