package aula10;
public class Professor extends Pessoa{
    //atributos
    private String especialidade;
    private double salario;
    //metodos
    public void receberAumento(double aum){
        this.salario +=aum;
        
        
    }
    //metodos especiais


    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
