package aula10;
public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("pedro");
        p2.setNome("maria");
        p3.setNome("claudio");
        p4.setNome("fabina");
        
        p2.setCurso("informatica");
        p3.setSalario(2500.55);
        p4.setSetor("estoque");
        
        p1.setSexo("masculino");
        p4.setSexo("feminino");
        p2.setIdade(42);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
    
}
