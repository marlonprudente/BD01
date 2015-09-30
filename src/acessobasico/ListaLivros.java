/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acessobasico;

import java.sql.*;

public class ListaLivros {

    public static void main(String[] args) throws Exception {
        // carregar driver JDBC
        Class.forName("com.mysql.jdbc.Driver");
        
        // obter conexao
        String url = "jdbc:mysql://200.134.10.33/livraria1562339";
        String user = "banco120132";
        String passwd = "$$dafuq";
        Connection con = DriverManager.getConnection(url, user, passwd);
        
        // criar Statement
        Statement stmt = con.createStatement();
        
        // enviar query
        ResultSet rs = stmt.executeQuery("select livro_id, titulo from livros");
        
        // tratar os dados da query
        while (rs.next()) {
            System.out.println(rs.getString(2));
        }
        
        // fechar conexao
        con.close();
        
    }
    
}

