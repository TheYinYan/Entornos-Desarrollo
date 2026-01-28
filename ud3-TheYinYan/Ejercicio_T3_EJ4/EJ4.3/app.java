import Estudiante.Estudiante;

public class app {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Samuel",9.5);
        System.out.println("Alumno: "+estudiante1.getNombre());
        System.out.println("Nota: "+estudiante1.getNota());
    }
}
