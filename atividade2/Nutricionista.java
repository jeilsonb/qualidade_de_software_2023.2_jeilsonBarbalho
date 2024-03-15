public class Nutricionista {
    private String crn;
    private String nome;

    public Nutricionista(String crn, String nome) {
        this.crn = crn;
        this.nome = nome;
    }

    // Getters
    public String getCrn() {
        return crn;
    }

    public String getNome() {
        return nome;
    }
}