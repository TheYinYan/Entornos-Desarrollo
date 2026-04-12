# Práctica 3: Patrón de diseño Singleton

[Readme Principal](../README.md)

[Código (DatabaseConnection.java)](../src/practica3/DatabaseConnection.java)

[App.java](../src/practica3/App.java) 

[Documentación Javadoc](../doc/practica3/)

El objetivo de esta práctica es que apliques el patrón de diseño Singleton en Java. El patrón Singleton es uno de los patrones de diseño más comunes en programación orientada a objetos. Se utiliza cuando necesitamos garantizar que una clase tenga solo una instancia durante la ejecución de un programa y proporcionar un punto de acceso global a esa instancia. Este patrón es muy útil, por ejemplo, para gestionar conexiones a bases de datos o configuraciones globales.

## Instrucciones:

1. **Implementar la clase Singleton:**

    - Crea una clase llamada *DatabaseConnection*, que simula una conexión a una base de datos.

    - Asegúrate de que esta clase solo pueda tener una única instancia. Utiliza el patrón **Singleton** para lograr esto.

2. **Uso de la clase Singleton:**

    - Crea una clase principal llamada *App* que simule la ejecución de una aplicación donde se utilice la clase *DatabaseConnection* como una conexión única.

3. **Verificación de la unicidad de la instancia:**

    - Añade un método en la clase *DatabaseConnection* que imprima un mensaje indicando que la conexión ha sido establecida.

    - En la clase *App*, intenta crear múltiples instancias de *DatabaseConnection* y verifica que la instancia sea la misma en todas las ocasiones.

## Esquema de la práctica:
1. [**Clase Singleton:** *DatabaseConnection*:](/src/practica3/DatabaseConnection.java)
Esta clase debe garantizar que solo haya una instancia a lo largo del ciclo de vida del programa. 

2. [**Clase Principal:** *App*:](/src/practica3/App.java)
Esta clase debe crear varias instancias de *DatabaseConnection* y verificar que todas las instancias son la misma.

3. **Resultados esperados:**
    - Cuando se ejecute el programa, deberías ver el mensaje "Conexión a la base de datos establecida." solo una vez, indicando que solo se ha creado una instancia de la clase DatabaseConnection.

    - Cuando se verifique si las dos instancias db1 y db2 son iguales, el resultado debería ser true, porque ambas instancias apuntan a la misma instancia única.

    - Al ejecutar las consultas, ambas instancias (aunque se hayan creado por separado) deberían estar operando sobre la misma conexión.

4. **Salidas esperadas:**

    Conexión a la base de datos establecida.
    
    ¿db1 es igual a db2? true
    
    Ejecutando consulta: SELECT * FROM users
    
    Ejecutando consulta: SELECT * FROM orders