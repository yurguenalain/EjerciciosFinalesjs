package Ejercicio10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hola", "hello");
        diccionario.put("mamá", "mom");
        diccionario.put("papá", "dad");
        diccionario.put("hermano", "brother");
        diccionario.put("hermana", "sister");
        diccionario.put("casa", "house");
        diccionario.put("carro", "car");
        diccionario.put("escuela", "school");
        diccionario.put("clase", "class");
        diccionario.put("zapato", "shoe");
        diccionario.put("manzana", "apple");
        diccionario.put("árbol", "tree");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("adiós", "goodbye");
        diccionario.put("taza", "cup");
        diccionario.put("hijo", "son");
        diccionario.put("hija", "daughter");
        diccionario.put("tío", "uncle");
        diccionario.put("tía", "aunt");

        List<String> palabrasEspañol = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabrasEspañol);

        Scanner scanner = new Scanner(System.in);
        int correctas = 0, incorrectas = 0;

        System.out.println("Bienvenido al juego de traducción. Traduce 5 palabras al inglés:");

        for (int i = 0; i < 5; i++) {
            String palabraEspañol = palabrasEspañol.get(i);
            System.out.print("Traduce al inglés la palabra '" + palabraEspañol + "': ");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            if (respuesta.equals(diccionario.get(palabraEspañol))) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabraEspañol));
                incorrectas++;
            }
        }

        System.out.println("\nJuego finalizado.");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}
