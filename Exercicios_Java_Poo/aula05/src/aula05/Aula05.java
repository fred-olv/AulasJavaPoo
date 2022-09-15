package aula05;

public class Aula05 {

    public static void main(String[] args) {
        Banco p1 = new Banco();
       p1.setdono("Gabriela");
       p1.setnumConta(1111);
       p1.abriConta("cc");
       p1.sacar(50);
       p1.depositar(200);
       p1.pagarMensal();
       p1.sacar(188);
       p1.fecharConta();
       
       p1.estadoAtual();
        
    }
    
}
