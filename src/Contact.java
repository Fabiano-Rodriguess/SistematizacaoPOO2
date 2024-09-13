public class Contact {
    private String nome;
    private String numeroTelefone;
    private String email;

    public Contact(String nome, String numeroTelefone, String email) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }

    public String getnome() { return nome; }
    public String getnumeroTelefone() { return numeroTelefone; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "NOME: " + nome + ", NUMERO: " + numeroTelefone + ", EMAIL: " + email;
    }
}
