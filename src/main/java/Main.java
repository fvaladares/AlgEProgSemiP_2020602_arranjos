import java.util.Scanner;

// https://github.com/fvaladares/AlgEProgSemiP_2020602_arranjos
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
        int n = 5;
        // Variável que armazena 10 dados do tipo Double.
        double[] notas = new double[n];
        double media = 0;
        double notasAcumuladas = 0;

        System.out.println("Programa para calcular a média " +
                "das notas de " + n + " estudantes.");

        System.out.println();

        // Estrutura de repetição para ler os dados;
        // notas.length -- Retorna o tamanho do vetor
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


        System.out.println("Notas acima da média: ");
        // Exibe as notas que estão acima da média da turma
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= media) {
                System.out.print(notas[i] + "; ");
            }
        }
        System.out.println();

        System.out.println("Notas acima da média: ");
        // Exibindo as notas que estão acima da média usando o enhanced for. (foreach)
        for (double nota : notas) {
            if (nota >= media) {
                System.out.print(nota + "; ");
            }
        }



        System.out.println("\nAté mais!!! \uD83D\uDD96\uD83C\uDFFD");
    }
}
