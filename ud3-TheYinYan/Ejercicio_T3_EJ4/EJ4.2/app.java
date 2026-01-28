public class app {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();

        rectangulo1.altura = 12;
        rectangulo1.base = 6;

        System.out.println("Area "+rectangulo1.calcularArea());
        System.out.println("Perimetro "+rectangulo1.calcularPerimetro());
    }
}
