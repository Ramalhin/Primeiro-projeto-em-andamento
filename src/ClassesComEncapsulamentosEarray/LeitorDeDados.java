package ClassesComEncapsulamentosEarray;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import visualização.AtendenteTela;

/**
 *
 * @author jrama
 */
public class LeitorDeDados {

    public String exibir(InfoPessoas pessoa) {

        StringBuilder builder = new StringBuilder();

        builder.append("\nNome: " + pessoa.getNome());
        builder.append("\nIdade: " + pessoa.getIdade());
        builder.append("\nSexo: " + pessoa.getSexo());
        builder.append("\nProfissão: " + pessoa.getProfissao());
        builder.append("\nNacionalidade: " + pessoa.getNacionalidade());
        builder.append("\nUsuario: " + pessoa.getUsuario());
        builder.append("\n------------------------------------------------------");

        return builder.toString();
    }

    public void salvar(InfoPessoas pessoa) {

        try {
            FileWriter fw = new FileWriter("dados das pessoas.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(pessoa.getNome());
            pw.println(pessoa.getIdade());
            pw.println(pessoa.getSexo());
            pw.println(pessoa.getProfissao());
            pw.println(pessoa.getNacionalidade());
            pw.println(pessoa.getUsuario());

            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "InfoPessoas");
        }

    }

    public void ler(InfoPessoas pessoa, Scanner scanner) throws IOException {

        pessoa.setNome(scanner.nextLine());
        pessoa.setIdade(Integer.parseInt(scanner.nextLine()));
        pessoa.setSexo(scanner.nextLine().charAt(0));
        pessoa.setProfissao(scanner.nextLine());
        pessoa.setNacionalidade(scanner.nextLine());
        pessoa.setUsuario(scanner.nextLine());

    }

    public List<InfoPessoas> lerVarios() {
        ArrayList<InfoPessoas> resultado;
        resultado = new ArrayList<>();
        try {
            Scanner msg = new Scanner(new FileInputStream("dados das pessoas.txt"));

            while (msg.hasNext()) {
                InfoPessoas pessoa = new InfoPessoas();
                ler(pessoa, msg);
                resultado.add(pessoa);
            }
            msg.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "InfoPessoas");
        }
        return resultado;
    }
    
    public String mostraArquivo() throws FileNotFoundException {
        File file = new File("dadosProduto.txt");
        Scanner sc = new Scanner(file);
        String texto = null;

        while (sc.hasNextLine()) {
            texto += sc.nextLine(); 
        }

        return texto;

    }
    public String leitura() {
        try(FileInputStream leitor = new FileInputStream("dadosProduto.txt")){
            int leitura;
            while((leitura = leitor.read())!= -1){
                byte b = (byte) leitura;
                
            }
            
        
    }catch(IOException e){
        e.printStackTrace();
    }
        return null;

}
        

}
