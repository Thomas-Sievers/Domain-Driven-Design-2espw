public class Livro {
    private String titulo;
    private String autor;
    private int ISBN;
    private int quantidade;

    public Livro(String titulo, String autor, int ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public int adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
        return this.quantidade;
    }

    public int removerEstoque(int quantidade){
        if(this.quantidade == 0){
            System.out.println("Não temos esse livro no estoque.");
        }
        else{
            this.quantidade -= quantidade;
        }
        return this.quantidade;
    }
}