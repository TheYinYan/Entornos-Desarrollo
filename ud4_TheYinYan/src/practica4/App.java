package src.practica4;

/**
 * Clase principal de prueba para el ProductManager optimizado.
 * Demuestra el funcionamiento de todas las operaciones con las mejoras aplicadas.
 *
 * @author Samuel Ruiz Martin
 * @version 1.0
 * @since 2026-04-12
 */
public class App {

    /**
     * Método principal que ejecuta las pruebas del gestor de productos.
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        
        // Añadir productos de prueba
        manager.addProduct(new Product(1, "Laptop", "Electronics", 999.99));
        manager.addProduct(new Product(2, "Mouse", "Electronics", 25.50));
        manager.addProduct(new Product(3, "Desk", "Furniture", 299.99));
        manager.addProduct(new Product(4, "Chair", "Furniture", 149.99));
        manager.addProduct(new Product(5, "Keyboard", "Electronics", 75.00));
        
        System.out.println("=== Práctica 4: ProductManager Optimizado ===\n");
        
        // Prueba de calculateTotalPrice() con cache
        System.out.println("--- calculateTotalPrice() (con cache) ---");
        System.out.println("Total precio: " + manager.calculateTotalPrice());
        
        // Prueba de findProductById() con HashMap O(1)
        System.out.println("\n--- findProductById() (búsqueda O(1)) ---");
        System.out.println("Buscar producto ID 3: " + manager.findProductById(3));
        
        // Prueba de findProductsByCategory() con índice O(1)
        System.out.println("\n--- findProductsByCategory() (índice O(1)) ---");
        System.out.println("Productos categoría Electronics: " + manager.findProductsByCategory("Electronics"));
        
        // Prueba de updateProductPrice() sin búsqueda redundante
        System.out.println("\n--- updateProductPrice() (sin búsqueda redundante) ---");
        manager.updateProductPrice(1, 899.99);
        System.out.println("Total después de actualizar precio: " + manager.calculateTotalPrice());
        
        // Prueba de removeProductById() con acceso directo O(1)
        System.out.println("\n--- removeProductById() (eliminación O(1)) ---");
        manager.removeProductById(2);
        System.out.println("Total después de eliminar producto: " + manager.calculateTotalPrice());
        
        // Prueba de printAllProducts()
        System.out.println("\n--- printAllProducts() ---");
        manager.printAllProducts();
        
        // Resumen de mejoras
        System.out.println("\n--- Resumen de mejoras aplicadas ---");
        System.out.println("✓ 1. HashMap para búsqueda por ID: O(1)");
        System.out.println("✓ 2. Eliminación de búsquedas redundantes");
        System.out.println("✓ 3. Índice por categoría con HashMap: O(1)");
        System.out.println("✓ 4. Comparator con lambda más eficiente");
        System.out.println("✓ 5. Cache para calculateTotalPrice(): O(1)");
    }
}