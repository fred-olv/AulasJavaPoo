package aula12;
public class Cachorro extends Mamifero {
    //metodos
    public void enterrarOsso(){
        System.out.println("Cavar e enterrar o osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando o Rabo");
    }
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
}
