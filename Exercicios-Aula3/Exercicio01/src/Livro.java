public class Livro {
    private String titulo;
    private String autor;
    private int ISBN;

    //Preciso adicionarLivro, removerLivro
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public Livro(String titulo, String autor, int ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }
}