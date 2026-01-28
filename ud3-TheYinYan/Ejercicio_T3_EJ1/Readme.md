# Tarea 1: Creación de casos de prueba

[Readme Principal](/README.md) <br>
[Readme T3](../README.md)

## 1. Casos - Suma

### TC-SUMA-01

**Título:** Suma de dos números enteros positivos <br>
**Objetivo:** Verificar que la calculadora suma correctamente dos números positivos.<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 5

- **Número 2:** 10

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 5.

3. Seleccionar la operación suma (+).

4. Introducir el número 10.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 15.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia.<br>

### TC-SUMA-02

**Título:** Sumar un número positivo y un número negativo.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la suma de un entero positivo y otro negativo<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 5

- **Número 2:** -1

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 5.

3. Seleccionar la operación suma (+).

4. Introducir el número -1.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 4.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-SUMA-03

**Título:** Sumar cero a un número.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la suma de un entero positivo y 0<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 5

- **Número 2:** 0

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 5.

3. Seleccionar la operación suma (+).

4. Introducir el número 0.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 5.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-SUMA-04

**Título:** Sumar números extremos (por ejemplo, límites máximo y mínimo de enteros). <br>
**Objetivo:** Verificar que la calculadora realiza correctamente la suma de los límites máximo y mínimo de enteros<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 99

- **Número 2:**  1

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 99.

3. Seleccionar la operación suma (+).

4. Introducir el número 1.

5. Pulsar “=”.

**Resultado esperado:** Se muestra Mensaje de error o desbordamiento.<br>
**Criterios de aceptación:** El sistema no se bloquea y muestra error controlado.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-SUMA-05

**Título:** Sumar con entradas no válidas (por ejemplo, "5 + a"). <br>
**Objetivo:** Verificar el manejo de entradas incorrectas.<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 5

- **Número 2:** a

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 5.

3. Seleccionar la operación suma (+).

4. Introducir el número a.

5. Pulsar “=”.

**Resultado esperado:** Se muestra Mensaje de error<br>
**Criterios de aceptación:** El sistema no se bloquea y muestra error controlado.<br>
**Postcondiciones:** Pantalla limpia. <br>

## 2. Casos - Resta

### TC-RESTA-01

**Título:** Restar dos números enteros positivos.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la resta entre dos entero positivo<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 5

- **Número 2:** 2

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 5.

3. Seleccionar la operación resta (-).

4. Introducir el número 2.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 3.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-RESTA-02

**Título:** Restar un número negativo de un positivo.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la resta de un entero positivo y otro negativo<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 5

- **Número 2:** -2

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 5.

3. Seleccionar la operación resta (-).

4. Introducir el número -2.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 7.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-RESTA-03

**Título:** Restar cero a un número.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la resta de un entero positivo y 0<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 7

- **Número 2:** 0

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 7.

3. Seleccionar la operación resta (-).

4. Introducir el número 0.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 7.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-RESTA-04

**Título:** Restar números extremos.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la resta de los límites máximo y mínimo de enteros<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** -99

- **Número 2:** 1

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número -99.

3. Seleccionar la operación resta (-).

4. Introducir el número 1.

5. Pulsar “=”.

**Resultado esperado:** Se muestra Mensaje de error o desbordamiento.<br>
**Criterios de aceptación:** El sistema no se bloquea y muestra error controlado.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-RESTA-05

**Título:** Resta con entrada no válida<br>
**Objetivo:** Verificar el manejo de entradas incorrectas.<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 6

- **Número 2:** x

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 6.

3. Seleccionar la operación resta (-).

4. Introducir el número x.

5. Pulsar “=”.

**Resultado esperado:** Se muestra Mensaje de error.<br>
**Criterios de aceptación:** El sistema no se bloquea y muestra error controlado.<br>
**Postcondiciones:** Pantalla limpia. <br>

## 3. Casos - Multiplicación

### TC-Multiplicación-01

**Título:** Multiplicar dos números enteros positivos.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la Multiplicación entre dos entero positivo<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 5

- **Número 2:** 2

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 5.

3. Seleccionar la operación Multiplicación (*).

4. Introducir el número 2.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 10.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-Multiplicación-02

**Título:** Multiplicar un número negativo de un positivo.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la Multiplicación de un entero positivo y otro negativo<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 5

- **Número 2:** -2

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 5.

3. Seleccionar la operación Multiplicación (*).

4. Introducir el número -2.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado -10.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-Multiplicación-03

**Título:** Multiplicar cero a un número.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la Multiplicación de un entero positivo y 0<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 7

- **Número 2:** 0

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 7.

3. Seleccionar la operación Multiplicación (*).

4. Introducir el número 0.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 0.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-Multiplicación-04

**Título:** Multiplicar números extremos.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la Multiplicación de los límites máximo y mínimo de enteros<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 99

- **Número 2:** 99

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 99.

3. Seleccionar la operación Multiplicación (*).

4. Introducir el número 99.

5. Pulsar “=”.

**Resultado esperado:** Se muestra Mensaje de error o desbordamiento.<br>
**Criterios de aceptación:** El sistema no se bloquea y muestra error controlado.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-Multiplicación-05

**Título:** Multiplicar con entrada no válida<br>
**Objetivo:** Verificar el manejo de entradas incorrectas.<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 6

- **Número 2:** !

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 6.

3. Seleccionar la operación Multiplicación (*).

4. Introducir el número !.

5. Pulsar “=”.

**Resultado esperado:** Se muestra Mensaje de error.<br>
**Criterios de aceptación:** El sistema no se bloquea y muestra error controlado.<br>
**Postcondiciones:** Pantalla limpia. <br>

## 4. Casos - División

### TC-División-01

**Título:** Dividir dos números enteros positivos.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la División entre dos entero positivo<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 10

- **Número 2:** 2

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 10.

3. Seleccionar la operación División (/).

4. Introducir el número 2.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 5.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-División-02

**Título:** Dividir un número negativo de un positivo.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la División de un entero positivo y otro negativo<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 10

- **Número 2:** -2

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 10.

3. Seleccionar la operación División (/).

4. Introducir el número -2.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado -5.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-División-03

**Título:** Dividir cero a un número.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la División de un entero positivo y 1<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 7

- **Número 2:** 1

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 7.

3. Seleccionar la operación División (/).

4. Introducir el número 1.

5. Pulsar “=”.

**Resultado esperado:** Se muestra el resultado 7.<br>
**Criterios de aceptación:** El resultado mostrado es correcto.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-División-04

**Título:** Dividir números extremos.<br>
**Objetivo:** Verificar que la calculadora realiza correctamente la División de los límites máximo y mínimo de enteros<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 7

- **Número 2:** 0

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 7.

3. Seleccionar la operación División (/).

4. Introducir el número 0.

5. Pulsar “=”.

**Resultado esperado:** Se muestra Mensaje de error “No se puede dividir entre cero”.<br>
**Criterios de aceptación:** El sistema no se bloquea y muestra error controlado.<br>
**Postcondiciones:** Pantalla limpia. <br>

### TC-División-05

**Título:** Dividir con entrada no válida<br>
**Objetivo:** Verificar el manejo de entradas incorrectas.<br>
**Precondiciones:** La calculadora está iniciada y lista para recibir datos.<br>

### Entradas / Datos de prueba:

- **Número 1:** 6

- **Número 2:** %

### Pasos de ejecución:

1. Abrir la calculadora.

2. Introducir el número 6.

3. Seleccionar la operación División (/).

4. Introducir el número %.

5. Pulsar “=”.

**Resultado esperado:** Se muestra Mensaje de error.<br>
**Criterios de aceptación:** El sistema no se bloquea y muestra error controlado.<br>
**Postcondiciones:** Pantalla limpia. <br>

[Readme Principal](/README.md) <br>
[Readme T3](../README.md)

