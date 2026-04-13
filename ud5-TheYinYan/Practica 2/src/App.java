import java.io.*;
import java.util.*;

public class App {
    private static CPIFP miCentro;
    private static List<Estudiante> estudiantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    // Archivos
    private static final String CARPETA = "datos/";
    private static final String ARCHIVO_CPIFP = CARPETA + "cpifp.txt";
    private static final String ARCHIVO_ESTUDIANTES = CARPETA + "estudiantes.txt";
    
    public static void main(String[] args) {
        // Crear carpeta de datos si no existe
        new File(CARPETA).mkdir();
        
        // Cargar datos existentes
        cargarCPIFP();
        cargarEstudiantes();
        
        // Si no hay CPIFP, crearlo
        if (miCentro == null) {
            System.out.println("=== NUEVO CPIFP ===");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            miCentro = new CPIFP(nombre, direccion, telefono);
            guardarCPIFP();
        }
        
        // Menú principal
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Opción: ");
            
            switch (opcion) {
                case 1:
                    mostrarDatosCentro();
                    break;
                case 2:
                    aniadirEstudiante();
                    break;
                case 3:
                    quitarEstudiante();
                    break;
                case 4:
                    listarEstudiantes();
                    break;
                case 5:
                    buscarEstudiante();
                    break;
                case 0:
                    System.out.println("Guardando datos...");
                    guardarCPIFP();
                    guardarEstudiantes();
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
    
    // ========== MÉTODOS DE FICHERO ==========
    
    private static void guardarCPIFP() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_CPIFP))) {
            writer.println(miCentro.toFileString());
        } catch (IOException e) {
            System.out.println("Error al guardar CPIFP: " + e.getMessage());
        }
    }
    
    private static void cargarCPIFP() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CPIFP))) {
            String linea = reader.readLine();
            if (linea != null) {
                miCentro = CPIFP.fromFileString(linea);
                System.out.println("✓ CPIFP cargado: " + miCentro.getNombre());
            }
        } catch (FileNotFoundException e) {
            // No hay archivo, se creará uno nuevo
        } catch (IOException e) {
            System.out.println("Error al cargar CPIFP: " + e.getMessage());
        }
    }
    
    private static void guardarEstudiantes() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_ESTUDIANTES))) {
            for (Estudiante e : estudiantes) {
                writer.println(e.toFileString());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar estudiantes: " + e.getMessage());
        }
    }
    
    private static void cargarEstudiantes() {
        estudiantes.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_ESTUDIANTES))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                Estudiante e = Estudiante.fromFileString(linea);
                if (e != null) {
                    estudiantes.add(e);
                }
            }
            System.out.println("✓ Cargados " + estudiantes.size() + " estudiantes");
        } catch (FileNotFoundException e) {
            // No hay archivo, empezamos vacío
        } catch (IOException e) {
            System.out.println("Error al cargar estudiantes: " + e.getMessage());
        }
    }
    
    // ========== MÉTODOS DEL MENÚ ==========
    
    private static void mostrarMenu() {
        System.out.println("\n=== GESTIÓN CPIFP ===");
        System.out.println("1. Ver datos del centro");
        System.out.println("2. Añadir estudiante");
        System.out.println("3. Quitar estudiante");
        System.out.println("4. Listar estudiantes");
        System.out.println("5. Buscar estudiante por ID");
        System.out.println("0. Salir");
    }
    
    private static void mostrarDatosCentro() {
        System.out.println("\n--- DATOS DEL CENTRO ---");
        System.out.println("  Nombre: " + miCentro.getNombre());
        System.out.println("  Dirección: " + miCentro.getDireccion());
        System.out.println("  Teléfono: " + miCentro.getTelefono());
        System.out.println("  Total estudiantes: " + estudiantes.size());
    }
    
    private static void aniadirEstudiante() {
        System.out.println("\n--- AÑADIR ESTUDIANTE ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        
        // Comprobar si ya existe
        for (Estudiante e : estudiantes) {
            if (e.getId().equals(id)) {
                System.out.println("Error: Ya existe un estudiante con ese ID");
                return;
            }
        }
        
        Estudiante nuevo = new Estudiante(nombre, id);
        nuevo.setCpifpNombre(miCentro.getNombre());
        estudiantes.add(nuevo);
        System.out.println("✓ Estudiante añadido correctamente");
    }
    
    private static void quitarEstudiante() {
        System.out.println("\n--- QUITAR ESTUDIANTE ---");
        System.out.print("ID del estudiante: ");
        String id = scanner.nextLine();
        
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId().equals(id)) {
                estudiantes.remove(i);
                System.out.println("✓ Estudiante eliminado correctamente");
                return;
            }
        }
        System.out.println("Error: No se encontró estudiante con ID " + id);
    }
    
    private static void listarEstudiantes() {
        System.out.println("\n--- LISTADO DE ESTUDIANTES ---");
        if (estudiantes.isEmpty()) {
            System.out.println("  No hay estudiantes registrados");
        } else {
            for (Estudiante e : estudiantes) {
                System.out.println("  " + e);
            }
        }
    }
    
    private static void buscarEstudiante() {
        System.out.println("\n--- BUSCAR ESTUDIANTE ---");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        
        for (Estudiante e : estudiantes) {
            if (e.getId().equals(id)) {
                System.out.println("✓ Estudiante encontrado:");
                System.out.println("  " + e);
                return;
            }
        }
        System.out.println("No se encontró estudiante con ID " + id);
    }
    
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Error: Introduce un número válido: ");
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}