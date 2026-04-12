package src.practica2;

/**
 * Clase de prueba para verificar el funcionamiento de la clase Invoice.
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("=== Práctica 2: Prueba de Invoice Refactorizado ===\n");
        
        // Prueba 1: Crear factura básica
        System.out.println("--- Prueba 1: Crear factura básica ---");
        Invoice invoice1 = new Invoice(1001, "Juan Pérez", 1000.00);
        invoice1.printInvoiceSummary();
        
        // Prueba 2: Actualizar nombre del cliente
        System.out.println("\n--- Prueba 2: Actualizar nombre del cliente ---");
        invoice1.updateCustomerName("María García");
        invoice1.printInvoiceSummary();
        
        // Prueba 3: Aplicar descuento
        System.out.println("\n--- Prueba 3: Aplicar descuento del 10% ---");
        invoice1.applyDiscountAndUpdateTax(10);
        invoice1.printDiscountDetails();
        
        // Prueba 4: Verificar getTotalAmountWithTax()
        System.out.println("\n--- Prueba 4: getTotalAmountWithTax() ---");
        System.out.println(String.format("Total con impuesto: %.2f", invoice1.getTotalAmountWithTax()));
        
        // Prueba 5: Múltiples descuentos
        System.out.println("\n--- Prueba 5: Múltiples descuentos ---");
        Invoice invoice2 = new Invoice(1002, "Carlos López", 500.00);
        System.out.println("Original:");
        invoice2.printInvoiceSummary();
        
        System.out.println("\nAplicando 20% descuento:");
        invoice2.applyDiscountAndUpdateTax(20);
        invoice2.printInvoiceSummary();
        
        System.out.println("\nAplicando 5% descuento adicional:");
        invoice2.applyDiscountAndUpdateTax(5);
        invoice2.printInvoiceSummary();
        
        System.out.println("\n=== Pruebas completadas ===");
    }
}