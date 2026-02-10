# Tarea 8: Pruebas con JUnit y Mockito
[Readme Tema 3](../Readme.md) <br>
[Readme Principal](../../Readme.md) <br>

## Ejercicio 1: Verificar que un servicio de login consulta correctamente al repositorio de usuarios

**Descripción:** Imagina que tienes un servicio de login llamado *ServicioLogin*, que depende de un repositorio de usuarios llamado *RepositorioUsuarios*. El servicio consulta al repositorio para verificar si el usuario existe.

Escribe un test usando **Mockito** para simular el repositorio y verificar que el método de login hace la consulta correctamente. Usa **assertEquals** para validar el comportamiento.

**Objetivo:**
- Crear un mock para una clase de dependencia (*RepositorioUsuarios*).
- Verificar que el método del servicio interactúe correctamente con el mock usando **assertTrue**.

**Codigo Ejercicio**
- [*RepositorioUsuarios*](ejercicio1/src/main/java/com/example/RepositorioUsuarios.java)
- [*ServicioLogin*](ejercicio1/src/main/java/com/example/ServicioLogin.java)
- [*ServicioLoginTest*](ejercicio1/src/test/java/com/example/ServicioLoginTest.java)

## Ejercicio 2: Verificar que un servicio de notificación envía un mensaje

**Descripción:** Crea una clase *ServicioNotificacion* que depende de una clase *ProveedorNotificaciones* para enviar notificaciones. El servicio utiliza el proveedor para enviar un mensaje.

Usa **Mockito** para simular el *ProveedorNotificaciones* y verifica que el método enviarNotificacion es llamado correctamente.

**Objetivo:**
- Simular un servicio de notificación.
- Verificar que el método de envío de notificaciones es invocado correctamente.

**Codigo Ejercicio**
- [*ProveedorNotificaciones*](ejercicio2/src/main/java/com/example/ProveedorNotificaciones.java)
- [*ServicioNotificacion*](ejercicio2/src/main/java/com/example/ServicioNotificacion.java)
- [*ServicioNotificacionTest*](ejercicio2/src/test/java/com/example/ServicioNotificacionTest.java)

## Ejercicio 3: Verificar que un sistema de envío de órdenes calcula el total correctamente

**Descripción:** Tienes una clase *SistemaOrdenes* que depende de una clase *ProveedorDescuentos* para calcular un descuento sobre el total de la orden. El sistema tiene un método *calcularTotal* que devuelve el total después de aplicar el descuento.

Escribe una prueba usando **Mockito** para simular el proveedor de descuentos y verificar que el sistema calcula el total correctamente.

**Objetivo:**
- Simular el comportamiento de una dependencia externa que proporciona un descuento.
- Validar el comportamiento con **assertEquals**.

**Codigo Ejercicio**
- [*ProveedorDescuentos*](ejercicio3/src/main/java/com/example/ProveedorDescuentos.java)
- [*SistemaOrdenes*](ejercicio3/src/main/java/com/example/SistemaOrdenes.java)
- [*SistemaOrdenesTest*](ejercicio3/src/test/java/com/example/SistemaOrdenesTest.java)

## Ejercicio 4: Verificar que un sistema de gestión de inventario elimina productos correctamente

**Descripción:** Tienes una clase *Inventario* que depende de un *RepositorioInventario*. El sistema tiene un método *eliminarProducto* que elimina un producto del inventario y otro método *contineProducto* que verifica si el producto sigue en el inventario.

Escribe una prueba con **Mockito** para simular el repositorio e investigar si el sistema elimina un producto correctamente.

**Objetivo:**
- Verificar que el sistema interactúa con la clase de repositorio usando **verify**.
- Validar con **assertFalse** que el producto ha sido eliminado (porque el repositorio ya no lo contiene).

**Codigo Ejercicio**
- [*RepositorioInventario*](ejercicio4/src/main/java/com/example/RepositorioInventario.java)
- [*Inventario*](ejercicio4/src/main/java/com/example/Inventario.java)
- [*InventarioTest*](ejercicio4/src/test/java/com/example/InventarioTest.java)

[Readme Tema 3](../Readme.md) <br>
[Readme Principal](../../Readme.md) <br>