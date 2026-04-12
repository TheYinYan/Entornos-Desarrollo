# Práctica 2: Refactorización de código

[Readme Principal](../README.md)

[Código Invoice](../src/practica2/Invoice.java)

[Código App](../src/practica2/App.java)

[Documentación Javadoc](../doc/practica2/)

El objetivo de esta práctica es que utilices herramientas y técnicas de refactorización y mejoras de código para transformar un código desorganizado y difícil de mantener en un código más limpio, eficiente y fácil de entender.

## Herramientas y técnicas de refactorización:
- **Renombrado de variables y métodos** (con el atajo F2 en VS Code).

- **Refactorización de métodos** (extraer métodos a partir de fragmentos de código repetidos).

- **Renombrado de clases y archivos** (con el atajo F2 en VS Code).

- **Reorganización de código** (moviendo métodos y variables a lugares más lógicos dentro de la clase).

- **Refactorización de cadenas** (uso de String.format() y otros métodos de concatenación).

- **Extracción de clases** para evitar clases grandes y difíciles de entender.

El siguiente [código Java](../src/practica2/Invoice.java) contiene varios problemas estructurales y de legibilidad. Identifícalos y aplica refactorización para mejorar el código.

## Problemas detectados en el código:

- **Duplicación de lógica:** El cálculo de *taxAmount* se repite en varios métodos (en *calculateTaxAmount()*, *applyDiscount()* y en el constructor de *Invoice*).

- **Métodos demasiado grandes:** El método *printInvoiceDetails()* es responsable de demasiadas cosas. Debería dividirse en funciones más pequeñas.

- **Código no modularizado:** La lógica de impuestos y descuentos podría ser más modular.

- **Poca claridad en los nombres de las variables y métodos:** Algunas funciones no son suficientemente descriptivas, por ejemplo, *applyDiscount()* podría ser más claro sobre cómo se aplica el descuento (y también cómo se recalcula el impuesto).

- **Uso de concatenación de cadenas ineficiente:** Concatenar las cadenas dentro del método *printInvoiceDetails()* no es la forma más eficiente ni clara de presentar los resultados.

- **Redundancia en el cálculo de impuestos:** El impuesto (*taxAmount*) se calcula de forma redundante en varios lugares.+

## Tareas de refactorización:

1. **Renombrar variables y métodos:**

    - Renombrar *totalAmount* a *subtotal* para que sea más claro.

    - Renombrar *taxAmount* a *tax* para mayor claridad.

    - Renombrar el método *printInvoiceDetails()* a *printInvoiceSummary()* para reflejar mejor su propósito.

    - Renombrar *applyDiscount()* a *applyDiscountAndUpdateTax()* para que sea más claro sobre lo que hace.

    - Renombrar *calculateTotalAmountWithTax()* a *getTotalAmountWithTax()* para hacer el método más intuitivo.

2. **Extraer métodos:**

    - Extraer la lógica de cálculo de impuestos en un método independiente que pueda ser reutilizado.

    - Extraer la lógica de impresión en diferentes métodos más pequeños, como *printInvoiceHeader(), printTaxDetails(),* etc.

3. **Modularización de cálculos:**

    - Crear un método privado *recalculateTax()* que se llame cada vez que se actualice el total (por ejemplo, después de un descuento).

4. **Mejorar el uso de cadenas:**

    - Utilizar *String.format()* en lugar de concatenaciones de cadenas para mejorar la legibilidad y la eficiencia de los mensajes de impresión.

5. **Eliminar redundancias:**

    - Eliminar el cálculo redundante del impuesto y la actualización del monto total tras aplicar un descuento.