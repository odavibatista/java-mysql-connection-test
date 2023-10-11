/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_crud_pessoas;

import com.mysql.cj.xdevapi.PreparableStatement;
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
        String sql = "INSERT INTO tb_pessoas (nome, fone, email) VALUES (?, ?, ?)";
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
        conexao.close();    
    }
}
