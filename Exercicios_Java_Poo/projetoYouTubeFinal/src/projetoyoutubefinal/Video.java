package projetoyoutubefinal;
public class Video implements AcoeVideo {
    //Atributos
    private String titulo;
    private int avaliacao;
    private int Views;
    private int curtidas;
      private boolean reproduzindo;
    //Fim atributos
    //Construtor

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.Views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
      
      
      
    //Inicio métodos getters e setters
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return Views;
    }

    public void setViews(int Views) {
        this.Views = Views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
  
    //Fim métodos getterss e setters
    
    
    
    
    
    
    
    //Métodos abstratos
    @Override
    public void play() {
    }
    @Override
    public void pause() {
    }
    @Override
    public void like() {
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", Views=" + Views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
}
