package aula03exercicio;


public class Rpg {
    public String sistema;
    public int ndejogadores;
    private boolean regras;
    public int nivel;
    public double freq;
    
    public void horario(){
        
    }
    public void plataforma(){
    if(this.sistema == "dnd"){
        System.out.println("Discor + roll20");
    } else if (this.sistema == "vampiro"){
            System.out.println("discord");
        }      
    }
    public void dia(){
        System.out.println(this.freq);
    }
}
