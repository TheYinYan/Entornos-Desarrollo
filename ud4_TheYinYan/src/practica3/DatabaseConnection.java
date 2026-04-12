package src.practica3;

/**
 * Clase Singleton que simula una conexión a una base de datos.
 * Garantiza que solo exista una única instancia durante toda la ejecución del programa.
 * 
 * @author Samuel
 * @version 1.0
 * @since 2026-04-12
 */
public class DatabaseConnection {
    
    /** Única instancia de la clase (Singleton) */
    private static DatabaseConnection instance;
    
    /** Indica si la conexión a la base de datos está activa */
    private boolean connected;

    /**
     * Constructor privado para evitar instanciación externa.
     * Inicializa la conexión como activa e imprime un mensaje de confirmación.
     */
    private DatabaseConnection() {
        this.connected = true;
        System.out.println("Conexión a la base de datos establecida correctamente.");
    }

    /**
     * Método estático que devuelve la única instancia de la clase.
     * Implementa el patrón Singleton con lazy initialization.
     * 
     * @return La única instancia de DatabaseConnection
     */
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    /**
     * Ejecuta una consulta simulada en la base de datos.
     * 
     * @param query La consulta SQL a ejecutar
     */
    public void executeQuery(String query) {
        if (connected) {
            System.out.println("Ejecutando consulta: " + query);
        } else {
            System.out.println("No se puede ejecutar la consulta. Conexión cerrada.");
        }
    }
}