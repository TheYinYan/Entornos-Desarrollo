package Animal;

public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.printf("%s esta comiendo%n",nombre);
    }

}
