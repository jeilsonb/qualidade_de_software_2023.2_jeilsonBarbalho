import java.util.Scanner;

public class testaSistemaClinicaNutricao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de Usuário
        System.out.println("\nCadastro de Usuário:");
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();
        Usuario usuario = new Usuario(cpf, nomeUsuario, peso, altura);

        // Cadastro de Nutricionista
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("\nCadastro de Nutricionista:");
        System.out.print("CPN: ");
        String crn = scanner.nextLine();
        System.out.print("Nome: ");
        String nomeNutricionista = scanner.nextLine();
        @SuppressWarnings("unused")
        Nutricionista nutricionista = new Nutricionista(crn, nomeNutricionista);

        // Cálculo do IMC e determinação do grau de obesidade
        double imc = CalculadoraIMC.calcularIMC(usuario.getPeso(), usuario.getAltura());
        String grauObesidade = CalculadoraIMC.determinarGrauObesidade(imc);

        // Resultados
        System.out.println("\nResultados:");
        System.out.println("IMC: " + imc);
        System.out.println("Resultado Final: " + grauObesidade + "\n");

        scanner.close();
    }
}
