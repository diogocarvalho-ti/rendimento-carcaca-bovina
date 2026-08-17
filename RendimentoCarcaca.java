import java.util.Scanner;

public class RendimentoCarcaca {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE RENDIMENTO DE CARCACA BOVINA ===");

        System.out.print("Digite o peso vivo do animal (kg): ");
        double pesoVivo = entrada.nextDouble();

        System.out.print("Digite o peso da carcaca (kg): ");
        double pesoCarcaca = entrada.nextDouble();

        double rendimento = (pesoCarcaca / pesoVivo) * 100;

        System.out.println("\n=== RESULTADO ===");
        System.out.printf("Peso vivo: %.2f kg%n", pesoVivo);
        System.out.printf("Peso da carcaca: %.2f kg%n", pesoCarcaca);
        System.out.printf("Rendimento de carcaca: %.2f%%%n", rendimento);

        entrada.close();
    }
}
