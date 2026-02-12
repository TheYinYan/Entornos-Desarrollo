# Unidad 3: Diseño y realización de pruebas

[Readme Principal](/Readme.md)

- [Tarea 1: Creación de casos de prueba](Ejercicio_T3_EJ1/Readme.md)

- [Tarea 2: Codigo 1 Definición Pruebas](Ejercicio_T3_EJ2/Readme.md)

- [Tarea 3: Codigo 2 Definición Pruebas](Ejercicio_T3_EJ3/Readme.md)

- [Tarea 4: Ejercicios clases en Java](Ejercicio_T3_EJ4/Readme.md)

- [Tarea 5: Pruebas unitarias con JUnit. Calculadora](Ejercicio_T3_EJ5/Readme.md)

- [Tarea 6: Pruebas unitarias con JUnit. Cuenta](Ejercicio_T3_EJ6/Readme.md)

- [Tarea 7: Pruebas unitarias con jUnit. Tiempo](Ejercicio_T3_EJ7/Readme.md)

- [Tarea 8: Pruebas con JUnit y Mockito](Ejercicio_T3_EJ8/Readme.md)

# Ejercicios de Repaso

## EJERCICIO 1 — ServicioRegistro

### Descripción

Tienes un servicio que registra usuarios y usa un repositorio para guardarlos.

Si el usuario ya existe → devuelve false

Si no existe → lo guarda y devuelve true

### Objetivo

Crear tests que verifiquen:

1. usuario nuevo se registra correctamente
2. usuario existente NO se registra

[RepositorioRegistro](Repaso/repaso1/src/main/java/com/example/RepositorioRegistro.java) <br>
[ServicioRegistro](Repaso/repaso1/src/main/java/com/example/ServicioRegistro.java)<br>
[Test](Repaso/repaso1/src/test/java/com/example/RepositorioRegistroTest.java)<br>


## EJERCICIO 2 — ServicioPago

### Descripción

Un servicio procesa pagos usando un proveedor externo.

### Objetivo

Tests que:

1. pago exitoso devuelve true
2. pago fallido devuelve false
3. verificar que se llamó al proveedor

[ProveedorPago](Repaso/repaso2/src/main/java/com/example/ProveedorPago.java) <br>
[ServicioPago](Repaso/repaso2/src/main/java/com/example/ServicioPago.java)<br>
[Test](Repaso/repaso2/src/test/java/com/example/ServicioPagoTest.java)<br>


## EJERCICIO 3 — ServicioCorreo

### Descripción

Servicio que envía correos usando un proveedor externo.

### Objetivo

Test que:

1. llama correctamente al proveedor
2. verifica número de llamadas

[ProveedorCorreo](Repaso/repaso3/src/main/java/com/example/ProveedorCorreo.java) <br>
[ServicioCorreo](Repaso/repaso3/src/main/java/com/example/ServicioCorreo.java)<br>
[Test](Repaso/repaso3/src/test/java/com/example/ServicioCorreoTest.java)<br>