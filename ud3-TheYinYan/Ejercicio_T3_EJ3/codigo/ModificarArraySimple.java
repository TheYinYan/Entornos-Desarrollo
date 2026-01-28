package codigo;

import java.util.Scanner; // Necesitamos esta herramienta para poder leer lo que el usuario escribe.

public class ModificarArraySimple {

    public static void main(String[] args) {
        // 1. CREAR EL ARRAY
        // Creamos una herramienta (objeto) para leer la entrada del teclado.
        Scanner teclado = new Scanner(System.in);

        int tamano = 0;

        // Bucle para pedir el tamaño del array.
        // Se repetirá hasta que el usuario dé un número mayor que 0.
        while (true) {
            System.out.print("Vamos a crear un array. Dame su longitud (número entero positivo): ");
            tamano = teclado.nextInt();
            if (tamano > 0) {
                break; // Si el número es válido, salimos del bucle.
            }
        }

        // Creamos un array de números enteros con el tamaño que nos ha dicho el usuario.
        int[] a = new int[tamano];

        // Rellenamos el array con valores consecutivos (0, 1, 2, 3...).
        for (int i = 0; i < tamano; i++) {
            a[i] = i;
        }

        // 2. MODIFICAR EL ARRAY
        System.out.println("Ahora vamos a modificar el array");

        // Bucle principal para modificar elementos.
        while (true) {
            int posicion = 0;

            // Bucle para pedir la posición a modificar.
            // Se repetirá hasta que el usuario dé una posición válida.
            while (true) {
                System.out.print("Dame una posición para cambiar, entre 1 y " + tamano + ": ");
                posicion = teclado.nextInt();
                // La posición debe estar dentro de los límites del array.
                // Corregido: se usa <= para permitir modificar también el último elemento.
                if (posicion > 0 && posicion <= tamano) {
                    break; // Si la posición es válida, salimos del bucle.
                } else {
                    System.out.println("Error: esa posición no existe.");
                }
            }

            // Pedimos el nuevo valor.
            System.out.print("Dame un valor nuevo para la posición " + posicion + ": ");
            int valor = teclado.nextInt();

            // Modificamos el valor en el array.
            // Restamos 1 a la posición porque los arrays en Java empiezan en el índice 0.
            a[posicion - 1] = valor;

            // Preguntamos si quiere modificar otro valor.
            System.out.print("¿Quieres modificar otro valor? (s/n): ");
            String respuesta = teclado.next();

            // Si la respuesta es "n" (o "N"), salimos del bucle principal.
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        // 3. MOSTRAR EL RESULTADO FINAL
        System.out.println("\nEl array final es:");
        for (int i = 0; i < tamano; i++) {
            // Imprimimos cada elemento con su posición (empezando en 1 para que sea más claro).
            System.out.println("a[" + (i + 1) + "] = " + a[i]);
        }

        // Cerramos la herramienta de lectura del teclado.
        teclado.close();
    }
}
