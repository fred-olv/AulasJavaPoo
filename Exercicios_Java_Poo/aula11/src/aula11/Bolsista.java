package aula11;
public class Bolsista extends Aluno {
    
    //atributos
    private int bolsa;
    //metodos
    public void removerBolsa(){
        System.out.println("Renovando bolsa do aluno "+this.getNome());
        
    }
    
    //metodos especiais

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista pagamento facilitado.");
        
    }
}

