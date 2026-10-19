import java.util.Scanner;

public class Main {
    /**
     * Programa para demonstrar o uso de vetores
     * em Java
     *
     * @param args
     */

    // todo -> Definir quantas notas estão acima da média!
    public static void main(String[] args) {
        // Leitura de dados a partir do teclado.
        Scanner entrada = new Scanner(System.in);
        // Variável que armazena 10 dados do tipo Double.
        double[] notas = new double[5];
        double media = 0;
        double notasAcumuladas = 0;

        System.out.println("Programa para calcular a média " +
                "das notas de 10 estudantes.");

        System.out.println();

        // Estrutura de repetição para ler os dados;
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nInsira a nota %d: ", (i + 1));
            notas[i] = entrada.nextDouble();
        }

        System.out.println();

        // Estrutura de repetição para exibir as notas lidas.
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %2d: %3.2f\n", (i + 1), notas[i]);
//            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println();

        // Estrutura para acúmulo das notas
        for (int i = 0; i < notas.length; i++) {
            notasAcumuladas += notas[i];
        }

        media = notasAcumuladas / notas.length;

        System.out.println("A média das notas é de: " + media + " pontos.");

        System.out.println("Até mais!!! \uD83D\uDD96\uD83C\uDFFD");
    }
}
