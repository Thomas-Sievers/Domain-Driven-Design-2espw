public class Membro {
    private String nome;
    private int id;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Membro(String nome, int id, String email){
        this.nome = nome;
        this.id = id;
        this.email = email;
    }
}