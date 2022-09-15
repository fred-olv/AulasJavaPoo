package aula08;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

 //metodos publicos

    public String detalhes() {
        return "Livro\n {" + "titulo=" + titulo + "\n  autor=" 
                        + autor + "\n  totalPagina=" + totalPagina 
                        + " pagAtual=" + pagAtual + "\n  aberto=" 
                        + aberto + "\n  leitor=" + leitor.getNome() 
                        + "  idade=" + leitor.getIdade()
                        + "  sexo=" + leitor.getSexo()+ '}';
    }

//metodo contrutor
    public Livro(String titulo, String autor, int totalPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPagina = totalPagina;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

//metodos especiais

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPagina() {
        return totalPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void folhear(int p) {
        if(p>this.getTotalPagina()){
            this.pagAtual=0;
        }else{
        this.pagAtual=p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

}
