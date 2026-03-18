import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private int ISBN;

    List<Livro> biblioteca = new ArrayList<>();

    public Livro(String titulo, String autor, int ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public void adicionarLivroBiblioteca(Livro livro){
        biblioteca.add(livro);
    }

    public void removerLivroBiblioteca(Livro livro){
        biblioteca.remove(livro);
    }
}
