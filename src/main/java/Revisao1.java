public class Revisao1 {
    public static void main(String[] args) {
        int[] entradaMinutos = {200, 600, 1800, 110, 50, 666, 777, 2560, 45};
        int horas;
        int minutos;
        int horaEmMinutos = 60;

        for (int entrada : entradaMinutos) {
            horas = entrada / horaEmMinutos;
            minutos = entrada % horaEmMinutos;

            System.out.printf("Entrada: %d, horas: %d minutos: %d\n",
                    entrada,
                    horas,
                    minutos);
        }

        System.out.println("------------");

        for (int entrada : entradaMinutos) {
            minutos = entrada % horaEmMinutos;
            horas = (entrada - minutos) / horaEmMinutos;

            System.out.printf("Entrada: %d, horas: %d minutos: %d\n",
                    entrada,
                    horas,
                    minutos);
        }

    }
}
