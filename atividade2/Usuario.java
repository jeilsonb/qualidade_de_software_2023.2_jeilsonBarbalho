public class Usuario {
    private String cpf;
    private String nome;
    private double peso;
    private double altura;

    public Usuario(String cpf, String nome, double peso, double altura) {
        this.cpf = cpf;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}