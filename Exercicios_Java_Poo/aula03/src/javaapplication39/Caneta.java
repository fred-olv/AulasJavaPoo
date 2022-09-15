package javaapplication39;

public class Caneta {
    
public String modelo;
public String cor;
private float ponta;
protected int carga;
private boolean tampada;

public void status(){
    System.out.println(" uma caneta "+this.cor);
    System.out.println(" esta tampada "+this.tampada);
    System.out.println(" qual é a ponta "+this.ponta);
    System.out.println(" qual é o modelo "+this.modelo);
    System.out.println(" como está de carga "+this.carga);
}

public void rabiscar(){
    if (this.tampada == true){
        System.out.println("Erro, não posso rabiscar");
    }else{
        System.out.println("Estou rabiscando");
    }
}
protected void tampar(){
    this.tampada = true;
}
protected void destampar(){
    this.tampada = false;
    
}
}

