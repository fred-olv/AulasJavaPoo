
package aula03exercicio;

public class Aula03Exercicio {
     
    public static void main(String[] args) {
        
     Rpg dnd =new Rpg();
     dnd.freq = 2.0;
     dnd.ndejogadores = 5;
     dnd.nivel = 12;
     dnd.sistema = "dnd";
    
     dnd.dia();
     dnd.plataforma();
   
    Quadro exsi = new Quadro();
    exsi.cor = "amarela";
    exsi.lembranca = true;
    exsi.conteudo = true;
    exsi.decora();
    exsi.lembrar();
    }
    
}
