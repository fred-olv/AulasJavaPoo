package projetoyoutubefinal;
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;
    //Fim atributos
    //Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    //Fim Construtor
    //Métodos
    protected void ganharExp(){
        
    }
    //Fim métodos
    
    //Métodos Getters e Setters
    
    //Fim métodos Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
}
