public class Estudiante {
    private String nombre;
    private String id;
    private String cpifpNombre;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpifpNombre() {
        return cpifpNombre;
    }

    public void setCpifpNombre(String cpifpNombre) {
        this.cpifpNombre = cpifpNombre;
    }

    // Formato para guardar en fichero: id|nombre|cpifpNombre
    public String toFileString() {
        return id + "|" + nombre + "|" + cpifpNombre;
    }

    // Crear estudiante desde una línea del fichero
    public static Estudiante fromFileString(String linea) {
        String[] partes = linea.split("\\|");
        if (partes.length == 3) {
            Estudiante e = new Estudiante(partes[1], partes[0]);
            e.setCpifpNombre(partes[2]);
            return e;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', id='" + id + "', cpifp='" + cpifpNombre + "'}";
    }
}