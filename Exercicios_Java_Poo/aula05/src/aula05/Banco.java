package aula05;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //inicio do metodo construtor
    public Banco(){
        this.saldo = 0;
        this.status = false;
    }
    //fim do metodo construtor
    
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta "+this.getnumConta());
        System.out.println("Tipo "+this.gettipo());
        System.out.println("Dono "+this.getdono());
        System.out.println("Saldo "+this.getsaldo());
        System.out.println("Status "+this.getstatus());
    }
    
    public void abriConta(String t){
        this.settipo(t);
        this.setstatus(true);
        if (t=="cc"){
            this.setsaldo(50);
        }else if (t=="cp"){
            this.setsaldo(150);
        }
        System.out.println("conta aberta com sucesso");
    }
    
    public void fecharConta(){
        if(this.getsaldo() > 0){
            System.out.println("conta com dinheiro");
        }else if(this.getsaldo() < 0){
            System.out.println("conta em debito");
        }else{
            this.setstatus(false);
            System.out.println("conta fechada com sucesso");
        }
        }
 
    public void depositar(double v){
        if(this.getstatus()){
            this.setsaldo(this.getsaldo()+v);
            System.out.println("desposito realizado com sucesso"+this.getdono());
        }else {
            System.out.println("impossivel depositar");
        }
        
    }
    
    public void sacar(double v){
        if (this.getstatus()){
            if(this.getsaldo() >= v){
                this.setsaldo(this.getsaldo()- v);
                System.out.println("saldo realizado"+this.getdono());
            }else{
                System.out.println("saldo insuficiente");
            }
        }else{
            System.out.println("impossivel sacar");
        }
        
    }
    
    public void pagarMensal(){
        int v= 0;
        if(this.gettipo() == "cc" ){
            v = 12;
        }else if(this.gettipo() == "cp"){
            v = 20;
        }
    
        if(this.getstatus()){
            this.setsaldo(this.getsaldo() - v);             
        }else{
            System.out.println("impossivel pagar");
        }
        
    }
    
    // declarar os set e get apartir daqui:
    //-------------------------------------
    //-------------------------------------
    
    public void setnumConta(int n){
        this.numConta = n;
    }
    public int getnumConta (){
        return this.numConta;
    }
    
    public void settipo(String t){
        this.tipo = t;
    }
    public String gettipo(){
        return this.tipo;
    }
    
    public void setdono(String d){
        this.dono = d;
    }
    public String getdono(){
        return this.dono;
    }
    
    public void setsaldo(double s){
        this.saldo = s;
    }
    public double getsaldo(){
        return this.saldo;
    }
    
    public void setstatus(boolean st){
        this.status = st;
    }
    public boolean getstatus(){
        return this.status;
    }
    
}
