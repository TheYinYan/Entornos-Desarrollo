package src.practica2;

/**
 * Clase que representa una factura comercial con cálculos de impuestos y descuentos.
 * Versión refactorizada siguiendo las tareas de la práctica.
 *
 * @author Samuel Ruiz Martín
 * @version 2.0
 */
public class Invoice {
    private int invoiceNumber;
    private String customerName;
    private double subtotal;      // Renombrado: antes totalAmount
    private double tax;           // Renombrado: antes taxAmount

    /**
     * Constructor que inicializa una factura con número, cliente y subtotal.
     *
     * @param invoiceNumber Número único de factura
     * @param customerName  Nombre del cliente
     * @param subtotal      Subtotal antes de impuestos
     */
    public Invoice(int invoiceNumber, String customerName, double subtotal) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.subtotal = subtotal;
        this.tax = calculateTaxFromSubtotal();  // Usa método extraído
    }

    /**
     * Método extraído: Calcula el impuesto a partir del subtotal actual (15%).
     *
     * @return Monto del impuesto (subtotal * 0.15)
     */
    private double calculateTaxFromSubtotal() {
        return subtotal * 0.15;
    }

    /**
     * Método extraído: Recalcula el impuesto después de cambios en el subtotal.
     * Se llama cada vez que se actualiza el total (después de un descuento).
     */
    private void recalculateTax() {
        this.tax = calculateTaxFromSubtotal();
    }

    /**
     * Renombrado: antes calculateTotalAmountWithTax()
     *
     * @return Total con impuesto incluido
     */
    public double getTotalAmountWithTax() {
        return subtotal + tax;
    }

    /**
     * Renombrado: antes printInvoiceDetails()
     * Ahora usa métodos extraídos para la impresión.
     */
    public void printInvoiceSummary() {
        printInvoiceHeader();
        printAmountDetails();
    }

    /**
     * Método extraído: Imprime la cabecera de la factura.
     */
    private void printInvoiceHeader() {
        System.out.println("Invoice Details:");
        System.out.println(String.format("Invoice Number: %d", invoiceNumber));
        System.out.println(String.format("Customer Name: %s", customerName));
    }

    /**
     * Método extraído: Imprime los detalles de montos.
     */
    private void printAmountDetails() {
        System.out.println(String.format("Subtotal: %.2f", subtotal));
        System.out.println(String.format("Tax Amount: %.2f", tax));
        System.out.println(String.format("Amount with Tax: %.2f", getTotalAmountWithTax()));
    }

    /**
     * Actualiza el nombre del cliente.
     *
     * @param newName Nuevo nombre del cliente
     */
    public void updateCustomerName(String newName) {
        customerName = newName;
    }

    /**
     * Renombrado: antes applyDiscount()
     * Aplica un descuento y recalcula el impuesto usando recalculateTax().
     *
     * @param discountPercentage Porcentaje de descuento a aplicar
     */
    public void applyDiscountAndUpdateTax(double discountPercentage) {
        subtotal = subtotal - (subtotal * discountPercentage / 100);
        recalculateTax();  // Método extraído para eliminar redundancia
    }

    /**
     * Imprime los detalles del descuento aplicado usando String.format().
     */
    public void printDiscountDetails() {
        System.out.println(String.format("Discount Applied: %.2f", subtotal));
        System.out.println(String.format("New Tax Amount: %.2f", tax));
        System.out.println(String.format("Amount After Discount: %.2f", getTotalAmountWithTax()));
    }
}