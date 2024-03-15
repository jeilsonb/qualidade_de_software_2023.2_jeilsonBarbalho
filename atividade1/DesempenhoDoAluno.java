public class DesempenhoDoAluno {
    
    private int[] notas = new int[3];
    private int contador = 0;
    private String status = "";
    
    public void adicionarNota(int nota) {
        if (contador < 3) {
            if (nota >= 0 && nota <= 100) {
                notas[contador] = nota;
                contador++;
            } else {
                status = "Erro";
            }
        }
    }
    
    public String calcularDesempenho() {
        // Se todas as três notas foram fornecidas
        if (contador == 3) {
            // Calcula a média das notas
            double media = (notas[0] + notas[1] + notas[2]) / 3.0;
            
            // Calcula o status do aluno com base na média
            if (media < 60) {
                status = "Reprovado";
            } else if (media >= 60 && media < 70) {
                status = "D";
            } else if (media >= 70 && media < 80) {
                status = "C";
            } else if (media >= 80 && media < 90) {
                status = "B";
            } else if (media >= 90 && media <= 100) {
                status = "A";
            }
        }
        return status;
    }
}
