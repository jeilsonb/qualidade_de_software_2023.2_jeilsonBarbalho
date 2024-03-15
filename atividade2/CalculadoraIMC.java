public class CalculadoraIMC {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String determinarGrauObesidade(double imc) {
        if (imc < 16)
            return "Magreza Grave";
        else if (imc >= 16 && imc < 17)
            return "Magreza Moderada";
        else if (imc >= 17 && imc < 19)
            return "Magreza Leve";
        else if (imc >= 19 && imc < 25)
            return "Saudável";
        else if (imc >= 25 && imc < 30)
            return "Sobrepeso";
        else if (imc >= 30 && imc < 35)
            return "Obesidade Grau 1";
        else
            return "Obesidade Grau 2";
    }
}
