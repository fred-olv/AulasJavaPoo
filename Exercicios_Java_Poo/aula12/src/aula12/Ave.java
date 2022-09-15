package aula12;
public class Ave extends Animal {

    //atributos
    private String corPena;
    //metodos
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comer frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    //getters e setters
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
