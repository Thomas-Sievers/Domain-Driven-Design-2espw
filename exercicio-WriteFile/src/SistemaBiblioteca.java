import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class SistemaBiblioteca {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int escolha = 0;

        while (escolha != 4){
            System.out.println("---- Sistema da Biblioteca ----");
            System.out.println("1 - Livro");
            System.out.println("2 - Membros");
            System.out.println("3 - Emprestimos");
            System.out.println("4 - Sair");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    int escolhaLivro = 0;
                    System.out.println("---- Opções de Livro ----");
                    System.out.println("1 - Ver livros");
                    System.out.println("2 - Adicionar livro");
                    System.out.println("3 - Remover livro");
                    escolhaLivro = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolhaLivro) {
                        case 1:
                            for (Livro livro : biblioteca.getLivros()) {
                                System.out.println(livro.toString());
                                scanner.nextLine();
                            }
                        break;
                        case 2:
                            String titulo;
                            String autor;
                            int ISBN;

                            System.out.println("---- Adicionar Livro ----");
                            System.out.println("Qual o título do livro?");
                            titulo = scanner.nextLine();

                            System.out.println("Qual é o autor do livro?");
                            autor = scanner.nextLine();

                            System.out.println("Qual é o ISBN do livro?");
                            ISBN = scanner.nextInt();
                            scanner.nextLine();

                            Livro livro = new Livro(titulo, autor, ISBN);
                            biblioteca.adicionarLivros(livro);
                            System.out.println("Livro adicionado: " + livro.toString());
                            break;
                        case 3:
                            String escolhaRemoverLivro;

                            System.out.println("---- Remover Livro ----");
                            System.out.println("Qual livro deseja remover?");
                            escolhaRemoverLivro = scanner.nextLine();

                            boolean livroRemovido = biblioteca.getLivros().removeIf(l -> l.getTitulo().equalsIgnoreCase(escolhaRemoverLivro));

                            if (livroRemovido) {
                                System.out.println("Livro removido com sucesso!");
                            } else {
                                System.out.println("Livro não encontrado");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    int escolhaMembro = 0;
                    System.out.println("---- Opções de Membro ----");
                    System.out.println("1 - Ver membros");
                    System.out.println("2 - Adicionar membros");
                    System.out.println("3 - Remover membros");
                    escolhaMembro = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolhaMembro){
                        case 1:
                            for (Membro membro: biblioteca.getMembros()){
                                System.out.println(membro.toString());
                                scanner.nextLine();
                            }
                        break;
                        case 2:
                            String nome;
                            String email;
                            int id;

                            System.out.println("---- Adicionar Membro ----");
                            System.out.println("Qual o nome do membro?");
                            nome = scanner.nextLine();

                            System.out.println("Qual é o email do membro?");
                            email = scanner.nextLine();

                            System.out.println("Qual é o id do membro?");
                            id = scanner.nextInt();
                            scanner.nextLine();

                            Membro membro = new Membro(nome, id, email);
                            biblioteca.registrarMembro(membro);
                            System.out.println("Membro registrado com sucesso: " + membro.toString());
                        break;
                        case 3:
                            String escolhaRemoverMembro;

                            System.out.println("---- Remover Membro ----");
                            System.out.println("Qual membro deseja remover?");
                            escolhaRemoverMembro = scanner.nextLine();

                            // Trocar pra função remover livro
                            boolean membroRemovido = biblioteca.getMembros().removeIf(m -> m.getNome().equalsIgnoreCase(escolhaRemoverMembro));

                            if (membroRemovido) {
                                System.out.println("Membro removido com sucesso!");
                            }
                            else {
                                System.out.println("Membro não encontrado");
                            }
                        break;
                        default:
                        break;
                    }
                break;
                case 3:
                    int escolhaEmprestimo = 0;
                    System.out.println("---- Opções de Emprestimo ----");
                    System.out.println("1 - Ver emprestimos");
                    System.out.println("2 - Adicionar emprestimos");
                    System.out.println("3 - Remover emprestimos");
                    escolhaEmprestimo = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolhaEmprestimo){
                        case 1:
                            for (Emprestimo emprestimo: biblioteca.getEmprestimos()){
                                System.out.println(emprestimo.toString());
                                scanner.nextLine();
                            }
                        break;
                        case 2:
                            String livroEmprestimo;
                            String membroEmprestimo;

                            System.out.println("---- Adicionar Emprestimo ----");
                            System.out.println("Qual o nome do livro do emprestimo?");
                            livroEmprestimo = scanner.nextLine();

                            Livro livroAchado = biblioteca.buscarLivroTitulo(livroEmprestimo);

                            System.out.println("Qual é o membro que está alugando?");
                            membroEmprestimo = scanner.nextLine();

                            Membro membroAchado = biblioteca.buscarMembroNome(membroEmprestimo);

                            Emprestimo emprestimo = new Emprestimo(livroAchado, membroAchado, new Date());
                            biblioteca.registrarEmprestimo(emprestimo);

                        break;
                        case 3:
                            String escolhaParametroLivro;
                            String escolhaParametroMembro;

                            System.out.println("---- Remover Emprestimo ----");
                            System.out.println("Qual emprestimo deseja remover? Digite o nome do livro");
                            escolhaParametroLivro = scanner.nextLine();
                            System.out.println("Agora digite o nome do membro que fez o empréstimo: ");
                            escolhaParametroMembro = scanner.nextLine();

                            // Trocar pra função remover livro
                            boolean emprestimoRemovido = biblioteca.getEmprestimos().removeIf(e -> e.getLivro().getTitulo()
                                    .equalsIgnoreCase(escolhaParametroLivro) && e.getMembro().getNome().equalsIgnoreCase(escolhaParametroMembro));

                            if (emprestimoRemovido) {
                                System.out.println("Emprestimo removido com sucesso!");
                            }
                            else {
                                System.out.println("Emprestimo não encontrado");
                            }
                        break;
                        default:
                        break;
                    }
                break;
            }
        }
    }
}
