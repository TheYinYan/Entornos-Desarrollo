import Producto.Producto;

public class app {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Monopoli", 20, 2);
        Producto producto2 = new Producto("Funko POP", 20, 4);

        producto1.vender(2);
        producto1.vender(2);
        producto2.vender(5);
    }
}
