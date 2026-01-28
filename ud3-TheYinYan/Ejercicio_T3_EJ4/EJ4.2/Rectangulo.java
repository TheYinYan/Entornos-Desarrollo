public class Rectangulo {
    protected int base;
    protected int altura;

    public int calcularArea() {
        return this.base * this.altura;
    }

    public int calcularPerimetro() {
        return (this.base + this.altura)*2;
    }
}