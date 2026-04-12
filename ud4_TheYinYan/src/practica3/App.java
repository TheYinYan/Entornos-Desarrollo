package src.practica3;

/**
 * Clase principal que demuestra el funcionamiento del patrón Singleton
 * con la clase DatabaseConnection.
 * 
 * @author Samuel Ruiz Martín
 * @version 1.0
 * @since 2026-04-12
 */
public class App {

    /**
     * Método principal que prueba el patrón Singleton.
     * Crea múltiples referencias a DatabaseConnection y verifica que
     * todas apuntan a la misma instancia.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear la primera instancia de DatabaseConnection
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        
        // Crear la segunda instancia de DatabaseConnection
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        // Mostrar si ambas instancias son la misma
        System.out.println("¿db1 es igual a db2? " + (db1 == db2));
        
        // Ejecutar una consulta usando la instancia única
        db1.executeQuery("SELECT * FROM users");

        // Intentar ejecutar otra consulta desde la segunda instancia (que debe ser la misma)
        db2.executeQuery("SELECT * FROM orders");
    }
}