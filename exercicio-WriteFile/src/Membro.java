import java.util.ArrayList;
import java.util.List;

public class Membro {
    String nome;
    int id;
    String email;

    List<Membro> membroList = new ArrayList<>();

    public Membro(String nome, int id, String email){
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public void adicionarMembro(Membro membro){
        membroList.add(membro);
    }
}
