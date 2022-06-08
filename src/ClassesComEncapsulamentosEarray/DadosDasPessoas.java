/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesComEncapsulamentosEarray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import visualização.AtendenteTela;

/**
 *
 * @author jrama
 */
public class DadosDasPessoas {

    public static void main(String[] args) {
        Path arquivo = Paths.get("dados_das_pessoas.txt");

        try {
            List<String> linhas = Files.readAllLines(arquivo);

            
                Scanner msg = new Scanner(System.in);
                if(linhas.equals("Jaozin")){
                    System.out.println("verdade");

            }else{
                    System.out.println("false");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
