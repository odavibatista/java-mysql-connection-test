/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_crud_pessoas;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    // Preencher com informações do Aiven
    private static final String host = "";
    private static final String port = "";
    private static final String user = "";
    private static final String password = "";
    private static final String db = "";
    
    public static Connection conectar() throws Exception {
        //http://dontpad.com:80/bossini
        //String de conexão
        //String s = "jdbc:mysql://" + host + ":" + port + "/" + db;
        String s = String.format(
            "jdbc:mysql://%s:%s/%s",
            host, port, db
        );
        
        Connection c = DriverManager.getConnection(
                s, 
                user, 
                password
        );
        return c;
    }
    
}
