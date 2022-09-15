package javaapplication39;
public class Caneta {
String modelo;
String cor;
float ponta;
int carga;
boolean tampada;
void status(){
    System.out.println(" uma caneta "+this.cor);
    System.out.println(" esta tampada "+this.tampada);
    System.out.println(" qual é a ponta "+this.ponta);
    System.out.println(" qual é o modelo "+this.modelo);
    System.out.println(" como está de carga "+this.carga);
}

void rabiscar(){
    if (this.tampada == true){
        System.out.println("Erro, não posso rabiscar");
    }else{
        System.out.println("Estou rabiscando");
    }
}
void tampar(){
    this.tampada = true;
}
void destampar(){
    this.tampada = false;
    
}
}

