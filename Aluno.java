package escola;

public class Aluno {
    private String nome;
    private int idade;
    private int RA;
    private Endereco endereco;
    private Responsavel responsavel;
    
    public Aluno(String nome, int idade, int RA, Endereco endereco, Responsavel responsavel){
        this.nome = nome;
        this.idade = idade;
        this.RA = RA;
        this.endereco = endereco;
        this.responsavel = responsavel;
    }
    
    public void mostraEndereco(){
        String txt = "Endereco: " + this.endereco.getRua() + ", " +
        this.endereco.getNumero() +  ", " +
        this.endereco.getCidade();
        System.out.println(txt);
    }
    
    public void mostraResponsavel(){
        String txt = "Responsavel: " + this.responsavel.getNomeResponsavel() + "\n" +
        "E-mail: " + this.responsavel.getEmail() + "\n" +
        "Telefone: " + this.responsavel.getTelefone();
        System.out.println(txt);
    }
    
    public String getNome() {
        System.out.println("\nNome: " + nome);
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        System.out.println("Idade: " + idade + " anos");
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRA() {
        System.out.println("RA: " + RA);
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
