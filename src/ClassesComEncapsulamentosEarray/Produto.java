package ClassesComEncapsulamentosEarray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Produto {

    private String nome;
    private String preco;
    private String quantidade;
    private String codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String imprimir() {

        return "\nNOME: " + nome
                + "\nQUANTIDADE: " + quantidade
                + "\nPREÇO: " + preco
                + "\nCODIGO: " + codigo;

    }

    public String salvar() {

        try {
            FileWriter fw = new FileWriter("dadosProduto.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: " + this.nome);
            pw.println("Preço: " + this.preco);
            pw.println("Quantidade: " + this.quantidade);
            pw.println("Codigo: " + this.codigo);
            pw.println("------------------------------------------------------");
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Produto");
        }

        return null;
    }

    public class LerArquivo {

        public static void main(String[] args) {
            Path caminho = Paths.get("c:/Documentos/NetBeansProjects/ProjetoKakugawa/dadosProdutto.txt");
            try {
                byte[] texto = Files.readAllBytes(caminho);
                String leitura = new String(texto);

                JOptionPane.showMessageDialog(null, leitura);
            } catch (Exception e) {
            }
        }

    }
}
