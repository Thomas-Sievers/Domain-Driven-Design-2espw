public class Main {
    static void main() {
        Livro livro1 = new Livro("O último reino", "Bernard Cornwell", 123);
        Membro membro1 = new Membro("Thomas", 1, "email@gmail.com");
        Emprestimo emprestimo1 = new Emprestimo("O último reino", "Thomas", "03/11/2026");

        System.out.println("Depois que você adicionou, temos " + livro1.adicionarEstoque(10) + " deste livro no nosso estoque.");
        System.out.println("Depois que você retirou, temos " + livro1.removerEstoque(5) + " deste livro no nosso estoque.");

        emprestimo1.devolverEmprestimo("O último reino", "Thomas");

    }
}
