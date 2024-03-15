import java.util.Scanner;

public class testaDesempenho {
    public static void main(String[] args) {
        DesempenhoDoAluno desempenho = new DesempenhoDoAluno();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nDigite a primeira nota:");
        int nota1 = scanner.nextInt();
        desempenho.adicionarNota(nota1);
        
        System.out.println("Digite a segunda nota:");
        int nota2 = scanner.nextInt();
        desempenho.adicionarNota(nota2);
        
        System.out.println("Digite a terceira nota:");
        int nota3 = scanner.nextInt();
        desempenho.adicionarNota(nota3);
        
        // Retorna o status textual do desempenho do aluno
        System.out.println("\nStatus do aluno: " + desempenho.calcularDesempenho() + "\n");
        
        scanner.close();
    }
}
