package ClassesComEncapsulamentosEarray;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;


public class InfoPessoas {
    private String nome;
    private char sexo;
    private int idade;
    private String profissao;
    private String nacionalidade;
    private String usuario;
    

    public InfoPessoas(String nome, char sexo, int idade, String profissao, String nacionalidade, String usuario) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.profissao = profissao;
        this.nacionalidade = nacionalidade;
        this.usuario = usuario;
      
    }

    public InfoPessoas() {
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String imprimir() {
        return "\nNOME: " + nome
               +"\nIDADE: " + idade
               +"\nSEXO: " + sexo
               +"\nPROFISSAO: "+ profissao
               +"\nNACIONALIDADE: "+nacionalidade
               +"\nUSUARIO:"+usuario;
        
        
    }
    public String salvar(){
      
        try {
             FileWriter fw = new FileWriter("dados_das_pessoas.txt", true);  
             PrintWriter pw = new PrintWriter(fw);
             pw.println("Nome: "+this.nome);
             pw.println("Idade: "+this.idade);
             pw.println("Sexo: "+this.sexo);
             pw.println("Profissão: "+this.profissao);
             pw.println("Nacionalidade: "+this.nacionalidade);
             pw.println("Usuario: "+this.usuario);
             pw.println("------------------------------------------------------\n");
             pw.flush();
             pw.close();
             fw.close();
             
             
        } catch (IOException erro) {
           JOptionPane.showMessageDialog(null, "InfoPessoas");
        }
         
        
        
        return null;
    }
}
