package Producto;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (stock == 0) {
            System.out.printf("No hay %s en Stock %n",nombre);
        } else if (stock - cantidad < 0) {
            System.out.printf("No tenemos la suficiente cantidad de %d %s, tenemos %d %s %n",cantidad,nombre,stock,nombre);
        } else {
            System.out.printf("Aqui tiene su %s, quedan %d %s%n",nombre,stock,nombre);
            stock-=cantidad;
        }
    }

    public double getPrecio() {
        return precio;
    }
}
