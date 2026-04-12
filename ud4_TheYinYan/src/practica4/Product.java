package src.practica4;

/**
 * Representa un producto con identificador, nombre, categoría y precio.
 * Esta clase es la entidad base para el gestor de productos.
 *
 * @author Samuel Ruiz Martin
 * @version 1.0
 * @since 2026-04-12
 */
public class Product {
    
    /** Identificador único del producto */
    private int id;
    
    /** Nombre del producto */
    private String name;
    
    /** Categoría a la que pertenece el producto */
    private String category;
    
    /** Precio del producto */
    private double price;

    /**
     * Constructor que inicializa un producto con todos sus atributos.
     *
     * @param id       Identificador único del producto
     * @param name     Nombre del producto
     * @param category Categoría del producto
     * @param price    Precio del producto
     */
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return El ID del producto
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene la categoría del producto.
     *
     * @return La categoría del producto
     */
    public String getCategory() {
        return category;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece un nuevo precio para el producto.
     *
     * @param price Nuevo precio del producto
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve una representación en cadena del producto.
     *
     * @return Cadena con los datos del producto
     */
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}