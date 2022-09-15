package aula03exercicio;

public class Quadro {
    public String formato;
    public String cor;
    public boolean lembranca;
    protected boolean conteudo;
    private String gancho;
    
    public void decora(){
        if (this.conteudo == true){
            System.out.println("Tem uma planta dentro do quadro!");
        }else {
            System.out.println("Não tem planta dentro do quadro");
        }
    }
    private void pendurado (){
        System.out.println("Esta na parede!");
    }
    public void lembrar(){
        if (this.lembranca == true){
            System.out.println("Boas lembranças");
        }else {
            System.out.println("Sem lembranças");
        }
    }
}