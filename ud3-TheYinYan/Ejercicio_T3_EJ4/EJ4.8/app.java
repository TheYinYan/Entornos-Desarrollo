import Figura.Figura;
import Figura.Triangulo;

public class app {
    public static void main(String[] args) {

        Figura f1 = new Figura();
        f1.dibujar();

        Figura f2 = new Triangulo();
        f2.dibujar();
    }
}
