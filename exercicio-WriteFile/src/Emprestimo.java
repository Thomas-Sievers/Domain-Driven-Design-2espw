import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private Date dataEmprestimo;

    List<Emprestimo> emprestimoList = new ArrayList<>();

    public Emprestimo(Livro livro, Membro membro, Date dataEmprestimo){
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo){
        emprestimoList.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo){
        emprestimoList.remove(emprestimo);
    }

}
