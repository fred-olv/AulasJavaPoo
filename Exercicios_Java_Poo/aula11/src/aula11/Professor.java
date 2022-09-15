package aula11;
public class Professor extends Pessoa {
    
    //atributos
    private String especialidade;
    private int salario;
    //metodos
    public void receberAumento(){
        
    }
    //metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
