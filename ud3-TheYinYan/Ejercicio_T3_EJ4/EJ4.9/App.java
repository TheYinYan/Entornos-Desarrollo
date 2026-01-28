import Empleado.Empleado;
import Empleado.Gerente;
public class App {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", 2000);
        System.out.println("Salario empleado: " + e1.salarioTotal());

        Empleado g1 = new Gerente("Luis", 3000, 500); 
        System.out.println("Salario gerente: " + g1.salarioTotal());
    }
}
