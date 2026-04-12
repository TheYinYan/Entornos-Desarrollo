package src.practica4;

import java.util.*;

/**
 * Gestor de productos que implementa optimizaciones de rendimiento.
 * 
 * Mejoras aplicadas según el ejercicio:
 * <ul>
 *   <li>1. HashMap en lugar de ArrayList para búsqueda O(1)</li>
 *   <li>2. Eliminación de búsquedas redundantes</li>
 *   <li>3. Índice por categoría con HashMap para búsqueda O(1)</li>
 *   <li>4. Comparator con lambda para ordenación más eficiente</li>
 *   <li>5. Cache para calculateTotalPrice() evitando recorrer la lista</li>
 * </ul>
 *
 * @author Samuel Ruiz Martin
 * @version 2.0
 * @since 2026-04-12
 */
public class ProductManager {
    
    /** MEJORA 1: HashMap para búsqueda por ID en tiempo O(1) */
    private Map<Integer, Product> productMap;
    
    /** MEJORA 3: HashMap para búsqueda por categoría en tiempo O(1) */
    private Map<String, List<Product>> productsByCategory;
    
    /** MEJORA 5: Cache para el precio total, evita recalcular cada vez */
    private double cachedTotalPrice;

    /**
     * Constructor que inicializa las estructuras de datos optimizadas.
     */
    public ProductManager() {
        productMap = new HashMap<>();
        productsByCategory = new HashMap<>();
        cachedTotalPrice = 0.0;
    }

    /**
     * Añade un producto al gestor.
     * Complejidad: O(1)
     *
     * @param product Producto a añadir
     */
    public void addProduct(Product product) {
        // MEJORA 1: Inserción O(1) en HashMap
        productMap.put(product.getId(), product);
        
        // MEJORA 3: Mantener índice por categoría
        if (!productsByCategory.containsKey(product.getCategory())) {
            productsByCategory.put(product.getCategory(), new ArrayList<>());
        }
        productsByCategory.get(product.getCategory()).add(product);
        
        // MEJORA 5: Actualizar cache
        cachedTotalPrice += product.getPrice();
    }

    /**
     * Elimina un producto por su ID.
     * MEJORA 2: Acceso directo sin búsqueda redundante.
     * Complejidad: O(1)
     *
     * @param productId ID del producto a eliminar
     */
    public void removeProductById(int productId) {
        // MEJORA 2: Acceso directo O(1) sin recorrer la lista
        Product removedProduct = productMap.remove(productId);
        if (removedProduct != null) {
            // Actualizar índice por categoría
            List<Product> categoryList = productsByCategory.get(removedProduct.getCategory());
            if (categoryList != null) {
                categoryList.remove(removedProduct);
            }
            // MEJORA 5: Actualizar cache
            cachedTotalPrice -= removedProduct.getPrice();
        }
    }

    /**
     * Busca un producto por su ID.
     * MEJORA 1: Búsqueda en tiempo O(1) gracias al HashMap.
     *
     * @param productId ID del producto a buscar
     * @return Producto encontrado o null si no existe
     */
    public Product findProductById(int productId) {
        // MEJORA 1: Búsqueda O(1) con HashMap
        return productMap.get(productId);
    }

    /**
     * Busca productos por categoría.
     * MEJORA 3: Búsqueda en tiempo O(1) gracias al índice precalculado.
     *
     * @param category Categoría a buscar
     * @return Lista de productos en esa categoría
     */
    public List<Product> findProductsByCategory(String category) {
        // MEJORA 3: Búsqueda O(1) con HashMap
        List<Product> result = productsByCategory.get(category);
        return result != null ? result : new ArrayList<>();
    }

    /**
     * Calcula el precio total de todos los productos.
     * MEJORA 5: Utiliza cache para evitar recorrer toda la lista.
     * Complejidad: O(1) (sin cache sería O(n))
     *
     * @return Suma de todos los precios de productos
     */
    public double calculateTotalPrice() {
        // MEJORA 5: Devolver cache sin recorrer la lista
        return cachedTotalPrice;
    }

    /**
     * Actualiza el precio de un producto.
     * MEJORA 2: Sin búsqueda redundante, acceso directo.
     *
     * @param productId ID del producto a actualizar
     * @param newPrice  Nuevo precio del producto
     */
    public void updateProductPrice(int productId, double newPrice) {
        // MEJORA 2: Acceso directo sin llamar a findProductById()
        Product product = productMap.get(productId);
        if (product != null) {
            double oldPrice = product.getPrice();
            product.setPrice(newPrice);
            // MEJORA 5: Actualizar cache
            cachedTotalPrice += (newPrice - oldPrice);
        }
    }

    /**
     * Ordena los productos por precio.
     * MEJORA 4: Utiliza lambda expression como Comparator más eficiente.
     */
    public void sortProductsByPrice() {
        // MEJORA 4: Comparator con lambda (más eficiente y legible)
        List<Product> productList = new ArrayList<>(productMap.values());
        productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }

    /**
     * Imprime todos los productos por consola.
     */
    public void printAllProducts() {
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }
}