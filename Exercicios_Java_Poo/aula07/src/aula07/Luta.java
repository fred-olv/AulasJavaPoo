package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovado;
    //metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1!=l2)){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante =l2;
        }else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;        
        }
    }
    public void lutar(){
        if(this.aprovado){
            System.out.println("###DESAFIANTE###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIADO###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("==========RESULTADO DA LUTA==========");
            switch(vencedor){
                case 0://empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://desafiado vence
                    System.out.println("Vitoria do "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.getDerrota();
                    break;
                case 2://desafiante vence 
                    System.out.println("Vitoria do "+this.desafiante.getNome());
                    this.desafiado.getDerrota();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("=============================================");
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    //metodos setters e getters
    
    public void setdesafiado(Lutador de){
        this.desafiado = de;
    }
    public Lutador getdesafiado(){
        return desafiado;
    }
    
    public void setdesafiante(Lutador ds){
        this.desafiante = ds;
    }
    public Lutador getdesafiador(){
        return desafiante;
    }
    
    public void setround(int rd){
        this.round = rd;
    }
    public int getround(){
        return round;
    }
    
    public void setaprovado(boolean ap){
        this.aprovado =  ap;
    }
    public boolean getaprovado(){
        return aprovado;
    }
}
