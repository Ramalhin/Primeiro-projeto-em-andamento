package ClassesComEncapsulamentosEarray;


import ClassesComEncapsulamentosEarray.InfoPessoas;
import java.util.ArrayList;


public class ListaGerenciada {
    private ArrayList<InfoPessoas> lista;
    
    public ListaGerenciada(){
        lista = new ArrayList();
    }
    
    public void inserir(InfoPessoas pessoa){
        lista.add(pessoa);
    }
    
    
}
