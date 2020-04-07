/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aluno
 */
public class Conexao {
    private Connection conexao;
   public Conexao() throws Exception{
       Class.forName("net.sourceforge.jtds.jdbc.Driver");
       String url = "jdbc:jtds:sqlserver://localhost:1433/Livros";
       conexao = DriverManager.getConnection(url,"sa","123456");
   }
   public Connection getConexao(){
       return conexao;
   } 
}
