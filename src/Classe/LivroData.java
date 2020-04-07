/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.LivroSALVA;
/**
 *
 * @author Aluno
 */
public class LivroData {
    Conexao con;
    public boolean Incluir(LivroSALVA Coleta) throws Exception{
        con = new Conexao();
        String SQL="insert into TabLivro values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps =con.getConexao().prepareStatement(SQL);
        ps.setString(1, Coleta.getNome());
        ps.setInt(2, Coleta.getIdade());
        ps.setInt(3, Coleta.getCPF());
        ps.setInt(4, Coleta.getRG());
        ps.setInt(5, Coleta.getAno_Lançamento());
        ps.setString(6, Coleta.getGenero_Livro());
        ps.setString(7, Coleta.getEditora());
        ps.setInt(8, Coleta.getID_Livro());
        ps.setString(9, Coleta.getNome_Livro());
        ps.setString(10, Coleta.getAutor());
        if(ps.executeUpdate()>0)
            return true;
        
        else
        return false;
       
    }

   public LivroSALVA pesquisar(int ID)throws Exception{
     con = new Conexao(); 
     LivroSALVA Coleta=null;
     String SQL="select * from TabLivro where ID_Livro = ?";
     PreparedStatement ps=con.getConexao().prepareStatement(SQL);
     ps.setInt(1,ID);
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
         Coleta = new LivroSALVA();
         Coleta.setNome(rs.getString("Nome"));
         Coleta.setIdade(rs.getInt("Idade"));
         Coleta.setCPF(rs.getInt("CPF"));
         Coleta.setRG(rs.getInt("RG"));
         Coleta.setAno_Lançamento(rs.getInt("Ano_Lançamento"));
         Coleta.setGenero_Livro(rs.getString("Genero_Livro"));
         Coleta.setEditora(rs.getString("Editora"));
        
         Coleta.setNome_Livro(rs.getString("Nome_Livro"));
         Coleta.setAutor(rs.getString("Autor"));
     }
     return Coleta;
             
   }
   public boolean Editar(LivroSALVA Coleta) throws Exception{
       con= new Conexao();
       String SQL="update TabLivro set Nome = ?, Idade = ?, CPF = ?, RG = ?, Ano_Lançamento = ?, Genero_Livro = ?, Editora = ?, Nome_Livro = ?, Autor = ? where ID_Livro = ?";
       PreparedStatement r=con.getConexao().prepareStatement(SQL);
        r.setString(1, Coleta.getNome());
        r.setInt(2, Coleta.getIdade());
        r.setInt(3, Coleta.getCPF());
        r.setInt(4, Coleta.getRG());
        r.setInt(5, Coleta.getAno_Lançamento());
        r.setString(6, Coleta.getGenero_Livro());
        r.setString(7, Coleta.getEditora());
        r.setString(8, Coleta.getNome_Livro());
        r.setString(9, Coleta.getAutor());
        r.setInt(10, Coleta.getID_Livro());
        if(r.executeUpdate()>0)
            return true;
        
        else
        return false;
   }
   public boolean Excluir(int ID) throws Exception {
       con = new Conexao();
       String SQL = "delete from TabLivro where ID_Livro = ?";
       PreparedStatement r = con.getConexao().prepareStatement(SQL);
       r.setInt(1, ID);
       if(r.executeUpdate()>0)
           return true;
       else
           return false;
   }
}
