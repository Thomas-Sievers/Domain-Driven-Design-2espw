import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner =  new Scanner(System.in);

        String removeLivro;
        String devolveLivro;

        List<Livro> biblioteca = new ArrayList<>();
        List<Emprestimo> emprestimos = new ArrayList<>();

        Membro membro1 = new Membro("Thomas", 1, "email@gmail.com");

        biblioteca.add(new Livro("O último reino", "Bernard Cornwell", 1));
        biblioteca.add(new Livro("Comece pelo porque", "Simon Sinked", 2));

        emprestimos.add(new Emprestimo("O último reino", membro1.getNome(), "11/03/2026"));

        System.out.println("Digite o nome do livro que quer remover: ");
        removeLivro = scanner.nextLine();

        biblioteca.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(removeLivro));

        System.out.println("Digite o nome do livro que quer devolver: ");
        devolveLivro = scanner.nextLine();

        emprestimos.removeIf(emprestimo -> emprestimo.getLivro().equalsIgnoreCase(devolveLivro));



    }
}
