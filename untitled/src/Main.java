import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
 
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("árbol", "tree");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("plátano", "banana");
        diccionario.put("coche", "car");
        diccionario.put("avión", "airplane");
        diccionario.put("ordenador", "computer");
        diccionario.put("teléfono", "phone");
        diccionario.put("televisión", "television");
        diccionario.put("papel", "paper");
        diccionario.put("lapiz", "pencil");
        diccionario.put("reloj", "watch");
        diccionario.put("ropa", "clothes");
        diccionario.put("zapatos", "shoes");


        Random random = new Random();


        String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspañol[random.nextInt(palabrasEspañol.length)];
        }

        // Pedir al usuario que ingrese las traducciones al inglés
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("¡Bienvenido al juego de traducción Español-Inglés!");
        for (String palabra : palabrasSeleccionadas) {
            System.out.print("Traduce '" + palabra + "' al inglés: ");
            String traduccionUsuario = scanner.nextLine();
            String traduccionCorrecta = diccionario.get(palabra);
            if (traduccionUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + traduccionCorrecta);
                respuestasIncorrectas++;
            }
        }


        System.out.println("\n--- Resultado ---");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);


        scanner.close();
    }
}
