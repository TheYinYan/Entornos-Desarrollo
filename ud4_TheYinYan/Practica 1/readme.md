# Práctica 1: Documentación con Javadoc

[Readme Principal](../README.md)

[Código](../src/practica1/Car.java)

[Documentación Javadoc](../doc/practica1/)

## Objetivo

En esta práctica documentaremos código Java utilizando Javadoc. En muchos proyectos de software, una parte crucial del proceso es la documentación del código. Aunque el código mismo debe ser lo más claro posible, la documentación adicional es esencial para garantizar que otros desarrolladores puedan comprender, usar y modificar el código cuando sea necesario. Javadoc es la herramienta estándar de Java para generar documentación HTML a partir de comentarios en el código fuente.

Dado el siguiente [código Java](../src/practica1/Car.java), añade comentarios de documentación Javadoc para cada clase, método y campo. Genera después la documentación HTML correspondiente.

### Parte 1: Documentación con Javadoc

1. **Documentar la clase *Car***:

    - Escribir una descripción breve de lo que hace la clase ***Car*** (por ejemplo, ¿es un modelo de coche? ¿qué atributos tiene?). También puedes hacer mención al autor, la versión, etc.

2. **Documentar los atributos (*make, model, year, price*)**:

    - Para cada atributo de la clase, añadir una descripción de su propósito. Explicar qué representa cada uno y qué tipo de valores se espera que almacenen.

3. **Documentar los métodos**:

    - Añadir comentarios Javadoc para cada método. Explicar:

        - Qué hace el método.

        - Qué parámetros recibe (si tiene).

        - Qué valor devuelve (si tiene).

        - Los casos de uso o cualquier comportamiento específico del método.

### Parte 2: Generación de la documentación HTML
1. **Generar la Documentación HTML usando Javadoc**:

    - Una vez que los comentarios Javadoc estén añadidos, usa la herramienta Javadoc para generar la documentación HTML.

    - Si estás usando un IDE, la mayoría de ellos tendrá una opción para generar la documentación directamente desde el entorno.

    - Si estás trabajando desde la línea de comandos, puedes usar el siguiente comando:

      ```cmd
      javadoc -d doc Car.java
      ```

    Esto generará una carpeta *doc* que contendrá los archivos HTML con la documentación generada. Javadoc no generará salida para los campos privados a menos que pasemos explícitamente la opción *-private* al comando.

2. **Revisar la documentación generada**:

    - Debes revisar los archivos HTML generados para asegurarte de que la documentación es clara, completa y está correctamente estructurada.
