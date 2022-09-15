package aula08;
public class Aula08 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
     
        p[0] = new Pessoa("Frederico", 34, "M");
        p[1] = new Pessoa("Gabriela", 27,"F");
        
        l[0] = new Livro("ACGEF","RR Martin" ,450, p[0]);
        l[1] = new Livro("Reliquias da Morte","JK Rowling", 580 , p[1]);
        l[2] = new Livro("onde os monstros habitam","Maurice Sendak", 25, p[1]);
        
        l[0].abrir();
        l[0].folhear(150);
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        
        
        
        
    }
    
}
