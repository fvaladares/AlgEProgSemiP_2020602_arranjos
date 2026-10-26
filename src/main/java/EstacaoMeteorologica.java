/*
03 - Uma estação meteorológica precisa registrar a
** temperatura média dos 5 primeiros dias da semana **
(de Segunda a Sexta-feira). Escreva um programa em Java que:

Peça para a pessoa utilizadora digitar a temperatura
de cada um dos 5 dias.
Calcule e exiba a temperatura média da semana.
Identifique e exiba quais dias
(ex: "Dia 1" , "Dia 3" , ou “Segunda-feira” , “Terça-feira” ...) tiveram
 temperatura estritamente acima da média calculada.

 */


import java.util.Scanner;

public class EstacaoMeteorologica {
    public static void main(String[] args) {
        int qtdDias = 5;

        double[] temperaturas = new double[qtdDias];
        double temperaturaMedia = 0;
        double temperaturaAcumulada = 0;
        int i = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println(".:|Programa para cálculo da temperatura média|:.");

        System.out.println("Vamos iniciar...");

        // Usando while para realizar a leitura de dados do arranjo
        // e o somatório
        while (i < qtdDias) {
            System.out.printf("Informe a temperatura do dia %d: ", (i + 1));
            temperaturas[i] = entrada.nextDouble();
            temperaturaAcumulada += temperaturas[i];
            i++;
        }

        // Calculando a temperatura média
        temperaturaMedia = temperaturaAcumulada / qtdDias;

        System.out.println();
        System.out.println("Dias em que a temperatura está" +
                " estritamente acima da média: ");
        for (i = 0; i < qtdDias; i++) {
            double temperatura = temperaturas[i];
            if (temperatura > temperaturaMedia)
                System.out.printf("%d; ", (i + 1));
        }
    }
}
