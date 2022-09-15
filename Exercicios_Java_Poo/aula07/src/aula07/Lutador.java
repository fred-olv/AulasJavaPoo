package aula07;
public class Lutador {
    //Atributo
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    
       //METODOS PUBLICOS
    public void ganharLuta(){
        this.setVitoria(getVitoria()+1);
    }
    public void perderLuta(){
        this.setDerrota(getDerrota()+1);
    }
    public void empatarLuta(){
        this.setEmpate(getEmpate()+1);
    }
    public void apresentar(){
        System.out.println("LUTADOR: "+getNome());
        System.out.println("ORIGEM: "+getNacionalidade());
        System.out.println(getIdade()+" ANOS");
        System.out.println(getAltura()+"M DE ALURA");
        System.out.println("PESANDO: "+getPeso()+"KG");
        System.out.println("GANHOU: "+getVitoria());
        System.out.println("PERDEU: "+getDerrota());
        System.out.println("EMPATOU: "+getEmpate());
    }
    public void statu(){
        System.out.println(getNome()+"É um peso "+this.getCategoria());
        System.out.println("Ganhou "+getVitoria()+" Vezes");
        System.out.println("Perdeu "+getDerrota()+" Vezes");
        System.out.println("Empatou "+getEmpate()+" Vezes");
    }
    
    //Metodo construtor
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
                
    }
    //Metodos getter e setter
    
    public void setNome(String no){
        this.nome = no;
    }
    public String getNome(){
        return nome;
    }
    
    public void setNacionalidade (String na){
        this.nacionalidade = na;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    public int getIdade (){
        return idade;
    }
    
    public void setAltura(double al){
        this.altura = al;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double pe){
        this.peso = pe;
        this.setCategoria();
    }
    public double getPeso(){
        return peso;
    }
    
    private void setCategoria (){
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9 ){
            this.categoria = "Medio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "invalido";
        }
    }
    public String getCategoria (){
        return categoria;
    }
    
    public void setVitoria(int vi){
        this.vitoria = vi;
    }
    public int getVitoria(){
        return vitoria;
    }
    
    public void setDerrota(int de){
        this.derrota = de;
    }
    public int getDerrota(){
        return derrota;
    }
    
    public void setEmpate(int em){
        this.empate = em;
    }
    public int getEmpate(){
        return empate;
    }
 
}
