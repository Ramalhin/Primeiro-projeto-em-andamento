package ClassesComEncapsulamentosEarray;

/**
 *
 * @author JoãoRamalho
 */
public class Pessoa {
    private String nome, profissao, nacionalidade, usuario;
    private char sexo;
    private int idade;
    

    public Pessoa(String nome, char sexo, int idade, String profissao, String nacionalidade, String usuario) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.profissao = profissao;
        this.nacionalidade = nacionalidade;
        this.usuario = usuario;
        
        
    }

    public Pessoa() {
        
    }

    Pessoa(String nome, char sexo, int idade, String profissao, String nacionalidade) {

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
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    
    public String imprimir() {
        return "\nNOME: " + nome +"\nIDADE: " + idade +"\nSEXO: " + sexo+"\nPROFISSAO: "+ profissao+"\nNACIONALIDADE: "+nacionalidade+"\nNOME DE USUÁRIO:"+usuario;
    }
}
