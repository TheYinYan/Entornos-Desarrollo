public class CPIFP {
    private String nombre;
    private String direccion;
    private String telefono;

    public CPIFP(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Formato para guardar en fichero: nombre|direccion|telefono
    public String toFileString() {
        return nombre + "|" + direccion + "|" + telefono;
    }

    // Crear CPIFP desde una línea del fichero
    public static CPIFP fromFileString(String linea) {
        String[] partes = linea.split("\\|");
        if (partes.length == 3) {
            return new CPIFP(partes[0], partes[1], partes[2]);
        }
        return null;
    }

    @Override
    public String toString() {
        return "CPIFP{nombre='" + nombre + "', direccion='" + direccion + "', telefono='" + telefono + "'}";
    }
}