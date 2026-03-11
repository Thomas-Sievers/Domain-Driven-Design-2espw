public class Emprestimo {
    private String livro;
    private String membro;
    private String dataEmprestimo;

    public Emprestimo(String livro, String membro, String dataEmprestimo){
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void devolverEmprestimo(String livro, String membro){
        System.out.println("Você devolveu seu livro!");
    }
}
