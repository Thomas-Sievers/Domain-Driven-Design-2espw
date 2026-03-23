import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Membro> membros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarLivros(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void removerLivro(Livro livro){
        livros.remove(livro);
        System.out.println("Livro removido: " + livro);
    }

    public void registrarMembro(Membro membro){
        membros.add(membro);
        System.out.println("Membro adicionado: " + membro);
    }

    public void registrarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
        System.out.println("Emprestimo registrado: " + emprestimo);
    }

    public void devolverLivro(Emprestimo emprestimo){
        emprestimos.remove(emprestimo);
        System.out.println("Livro devolvido: " + emprestimo);
    }

    public void salvarDadosArquivo(String nomeArquivo) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))){
            for (Livro livro: livros){
                writer.write("Livro: " + livro + "\n");
            }
            for (Membro membro: membros){
                writer.write("Membro: " + membro + "\n");
            }
            for (Emprestimo emprestimo: emprestimos){
                writer.write("Emprestimo: " + emprestimo + "\n");
            }

        }
    }

    public void carregarDadosArquivos(String nomeArquivo) throws IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))){
            String linha;
            while((linha = reader.readLine()) != null){
                System.out.println("Linha");
            }
        }
    }

    public Livro buscarLivroTitulo(String titulo){
        for(Livro l: livros){
            if(l.getTitulo().trim().equalsIgnoreCase(titulo.trim())){
                return l;
            }
        }
        return null;
    }

    public Membro buscarMembroNome(String nome){
        for(Membro m: membros){
            if(m.getNome().trim().equalsIgnoreCase(nome.trim())){
                return m;
            }
        }
        return null;
    }
}
