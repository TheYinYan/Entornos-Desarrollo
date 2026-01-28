package Vehiculo;

public class Coche {
    protected String modelo;
    protected Motor motor;

    public Coche(String modelo, Motor motor){
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void infoCoche() {
        System.out.printf("Tu coche %s tiene un motor %s de %.2f $%n",modelo,motor.nombre,motor.precio);
    }
}
