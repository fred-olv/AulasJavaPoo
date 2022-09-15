package aula10;
public class Funcionario extends Pessoa{
    
    //atributos
    private String setor;
    private boolean trabalhando;
    //metodos
    public void mudarDeTrabalho(){
        this.trabalhando = !this.trabalhando;
        
    }
    //metodos especiais

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }
    
}
