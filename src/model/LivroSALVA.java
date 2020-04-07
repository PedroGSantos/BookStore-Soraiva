/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class LivroSALVA {

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getAno_Lançamento() {
        return Ano_Lançamento;
    }

    public void setAno_Lançamento(int Ano_Lançamento) {
        this.Ano_Lançamento = Ano_Lançamento;
    }

    public String getGenero_Livro() {
        return Genero_Livro;
    }

    public void setGenero_Livro(String Genero_Livro) {
        this.Genero_Livro = Genero_Livro;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public int getID_Livro() {
        return ID_Livro;
    }

    public void setID_Livro(int ID_Livro) {
        this.ID_Livro = ID_Livro;
    }

    public String getNome_Livro() {
        return Nome_Livro;
    }

    public void setNome_Livro(String Nome_Livro) {
        this.Nome_Livro = Nome_Livro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
  private String Nome;
  private int Idade;
  private int CPF;
  private int RG;
  private int Ano_Lançamento;
  private String Genero_Livro;
  private String Editora;
  private int ID_Livro;
  private String Nome_Livro;
  private String Autor;

    public LivroSALVA() {
    }

    public LivroSALVA(String Nome, int Idade, int CPF, int RG, int Ano_Lançamento, String Genero_Livro, String Editora, int ID_Livro, String Nome_Livro, String Autor) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.CPF = CPF;
        this.RG = RG;
        this.Ano_Lançamento = Ano_Lançamento;
        this.Genero_Livro = Genero_Livro;
        this.Editora = Editora;
        this.ID_Livro = ID_Livro;
        this.Nome_Livro = Nome_Livro;
        this.Autor = Autor;
    }

  
          


    
}
