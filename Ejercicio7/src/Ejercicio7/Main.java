package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        int hora, minutos;

        while (true) {
            System.out.print("Introduce un día de la semana (lunes a viernes): ");
            dia = sc.nextLine().toLowerCase().trim();
            if (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") &&
                !dia.equals("jueves") && !dia.equals("viernes")) {
                System.out.println("Día inválido. Por favor, introduce un día válido.");
                continue;
            }

            System.out.print("Introduce la hora (0-23): ");
            while (!sc.hasNextInt()) {
                System.out.println("Hora inválida. Por favor, introduce un número válido.");
                sc.next();
            }
            hora = sc.nextInt();
            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida. Por favor, introduce una hora válida.");
                sc.nextLine();
                continue;
            }

            System.out.print("Introduce los minutos (0-59): ");
            while (!sc.hasNextInt()) {
                System.out.println("Minutos inválidos. Por favor, introduce un número válido.");
                sc.next();
            }
            minutos = sc.nextInt();
            if (minutos < 0 || minutos > 59) {
                System.out.println("Minutos inválidos. Por favor, introduce minutos válidos.");
                sc.nextLine();
                continue;
            }

            sc.nextLine();

            int minutosHastaFinDeSemana = minutosRestantesParaFin(dia, hora, minutos);
            if (minutosHastaFinDeSemana >= 0) {
                System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana.");
                break;
            } else {
                System.out.println("La hora ingresada está después del viernes a las 15:00.");
                break;
            }
        }
        sc.close();
    }

    public static int minutosRestantesParaFin(String dia, int hora, int minutos) {
        int diaNumerico;

        if (dia.equals("lunes")) {
            diaNumerico = 0;
        } else if (dia.equals("martes")) {
            diaNumerico = 1;
        } else if (dia.equals("miercoles")) {
            diaNumerico = 2;
        } else if (dia.equals("jueves")) {
            diaNumerico = 3;
        } else {
            diaNumerico = 4;
        }

        int minutosFinSemana = 5 * 24 * 60 + 15 * 60;
        int minutosActuales = diaNumerico * 24 * 60 + hora * 60 + minutos;
        return minutosFinSemana - minutosActuales;
    }
}
