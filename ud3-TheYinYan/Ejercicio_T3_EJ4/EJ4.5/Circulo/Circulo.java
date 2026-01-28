package Circulo;
public class Circulo {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getArea(){
        double pi = Math.PI;
        return pi*Math.pow(radio, 2);
    }
}
