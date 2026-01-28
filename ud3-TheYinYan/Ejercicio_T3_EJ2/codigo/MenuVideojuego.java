import java.util.Scanner;

public class MenuVideojuego {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Bienvenido al Juego de Aventura ---");
        System.out.println("Elige tu personaje:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.print("Tu elección: ");
        int personaje = teclado.nextInt();

        System.out.println("\nElige una acción:");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        System.out.println("3. Usar objeto");
        System.out.print("Tu elección: ");
        int accion = teclado.nextInt();
        
        System.out.print("\n¿Es de día? (true/false): ");
        boolean esDeDia = teclado.nextBoolean();

        System.out.println("\n--- Resultado de la Acción ---");

        // Inicio del análisis de complejidad
        if (personaje == 1) { // +1 decisión
            System.out.println("Has elegido al Guerrero.");
            if (accion == 1) { // +1 decisión
                System.out.println("¡El Guerrero ataca con su espada!");
            } else if (accion == 2) { // +1 decisión
                System.out.println("El Guerrero levanta su escudo para defenderse.");
            } else {
                System.out.println("El Guerrero busca en su mochila un objeto útil.");
            }

        } else if (personaje == 2) { // +1 decisión
            System.out.println("Has elegido al Mago.");
            if (accion == 1 && esDeDia) { // +2 decisiones (if y &&)
                System.out.println("El Mago lanza una bola de fuego potenciada por el sol.");
            } else if (accion == 1 && !esDeDia) { // +2 decisiones (if y &&)
                 System.out.println("El Mago invoca un hechizo de sombras.");
            } else if (accion == 2) { // +1 decisión
                System.out.println("El Mago crea una barrera mágica.");
            } else {
                System.out.println("El Mago bebe una poción de maná.");
            }

        } else if (personaje == 3) { // +1 decisión
            System.out.println("Has elegido al Arquero.");
            // Aquí no hay más decisiones anidadas para mantener el ejemplo claro
            System.out.println("El Arquero prepara su arco y flecha.");
        
        } else {
            System.out.println("Personaje no válido. Fin del juego.");
        }

        teclado.close();
    }
}
