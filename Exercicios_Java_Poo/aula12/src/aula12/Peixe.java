package aula12;
public class Peixe extends Animal{

    //atributos
    private String corEscamas;
    //metodos
    public void soltarBolhas(){
        System.out.println("Soltar uma Bolha");
    }
    //metodos abstratos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comer Substancias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz Som");
    }
    //getters e setters
    public String getCorEscamas() {
        return corEscamas;
    }
    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
    
    
}
