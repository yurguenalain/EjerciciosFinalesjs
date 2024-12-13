package Ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> transl = new HashMap<>();

        transl.put("hola", "hello");
        transl.put("mamá", "mom");
        transl.put("papá", "dad");
        transl.put("tío", "uncle");
        transl.put("tía", "aunt");
        transl.put("hijo", "son");
        transl.put("hija", "daughter");
        transl.put("mi", "my");
        transl.put("es", "is");
        transl.put("sol", "sun");
        transl.put("luna", "moon");
        transl.put("adiós", "goodbye");
        transl.put("taza", "cup");
        transl.put("carro", "car");
        transl.put("casa", "house");
        transl.put("hermano", "brother");
        transl.put("hermana", "sister");
        transl.put("escuela", "school");
        transl.put("clase", "class");
        transl.put("zapato", "shoe");
        transl.put("manzana", "apple");
        transl.put("árbol", "tree");

        Scanner scanner = new Scanner(System.in);
        String spanish;

        do {
            System.out.print("Escribe una palabra en español y te la traduciré al inglés (escribe 'salir' para terminar): ");
            spanish = scanner.nextLine().toLowerCase().trim();

            if (!spanish.equals("salir")) {
                if (transl.containsKey(spanish)) {
                    System.out.println("La traducción de '" + spanish + "' es '" + transl.get(spanish) + "'.");
                } else {
                    System.out.println("La palabra '" + spanish + "' no se encuentra en el diccionario.");
                }
            }
        } while (!spanish.equals("salir"));

        scanner.close();
        System.out.println("¡Gracias por usar el traductor!");
    }
}
