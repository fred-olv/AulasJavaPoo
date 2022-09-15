package aula10;
public class Aluno extends Pessoa {
    
    //atributos
    private boolean matricula;
    private String curso;
    //metodos
    public void cancerlarMatricula(){
        System.out.println("matricula sera cancelada! ");
        this.matricula = false;
        
    }
    //metodos epeciais

  
    public boolean getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
