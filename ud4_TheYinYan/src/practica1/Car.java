package src.practica1;

/**
 * Representa un vehículo automóvil con sus características básicas.
 * Esta clase permite crear objetos de tipo coche con marca, modelo, año y
 * precio,
 * y proporciona métodos para acceder y modificar estos atributos.
 *
 * @author Samuel Ruiz Martín
 * @version 1.0
 * @since 07-04-2026
 */
public class Car {

    /** Marca del fabricante del coche (ej. Toyota, Ford, BMW) */
    private String make;

    /** Nombre del modelo específico del coche (ej. Corolla, Focus, X5) */
    private String model;

    /** Año de fabricación del coche (debe ser un año válido, ej. 2020) */
    private int year;

    /** Precio del coche en dólares estadounidenses (valor positivo) */
    private double price;

    /**
     * Constructor para inicializar un objeto Car con sus atributos.
     *
     * @param make  La marca del coche (por ejemplo, "Toyota").
     * @param model El modelo del coche (por ejemplo, "Corolla").
     * @param year  El año de fabricación del coche (por ejemplo, 2025).
     * @param price El precio del coche (por ejemplo, 26800.0).
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Obtiene la marca del coche.
     *
     * @return La marca del coche.
     */
    public String getMake() {
        return make;
    }

    /**
     * Establece la marca del coche.
     *
     * @param make La nueva marca del coche.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Obtiene el modelo del coche.
     *
     * @return El modelo del coche.
     */
    public String getModel() {
        return model;
    }

    /**
     * Establece el modelo del coche.
     *
     * @param model El nuevo modelo del coche.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Obtiene el año de fabricación del coche.
     *
     * @return El año de fabricación del coche.
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece el año de fabricación del coche.
     *
     * @param year El nuevo año de fabricación del coche.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Obtiene el precio del coche.
     *
     * @return El precio del coche.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del coche.
     *
     * @param price El nuevo precio del coche.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve una descripción completa del coche, incluyendo su año, marca, modelo
     * y precio.
     *
     * @return Una cadena de texto con la descripción del coche.
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en forma de
     * cadena del objeto Car.
     *
     * @return Una cadena de texto que describe el coche.
     */
    @Override
    public String toString() {
        return carDescription();
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}