package escola;

public class Responsavel {
    private String nomeResponsavel;
    private String email;
    private int telefone;
    
    public Responsavel(String nomeResponsavel, String email, int telefone){
        this.nomeResponsavel = nomeResponsavel;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
