package Empleado;
public class Empleado {
    protected String nombre;
    protected int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public int salarioTotal(){
        return salario;
    }
}
