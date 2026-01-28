package Empleado;

public class Gerente extends Empleado {
    protected int bono;

    public Gerente(String nombre, int salario, int bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public int salarioTotal() {
        return salario + bono;
    }
}
