package projetoyoutubefinal;
public class Gafanhoto extends Pessoa {
    
    //Atributos
    private String login;
    private int TotAssistindo;
    //Fim atributos
    
    //Construtor
    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome,idade,sexo);
        this.login = login;
        this.TotAssistindo = 0;
    }
    //FimCosntrutor
    
    //Métodos
    public void viuMaisUm(){
        
    }
    //Fim métodos
    
    //Métodos Getters e Setters
    
    //Fim métodos Getters e Setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return TotAssistindo;
    }

    public void setTotAssistindo(int TotAssistindo) {
        this.TotAssistindo = TotAssistindo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public double getExperiencia() {
        return experiencia;
    }

    @Override
    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
    
}
