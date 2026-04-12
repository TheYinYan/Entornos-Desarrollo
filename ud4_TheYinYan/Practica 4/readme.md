# Práctica 4: Optimización de código

[Readme Principal](../README.md)

[Código ProductManager](../src/practica4/ProductManager.java)

[Código Product](../src/practica4/Product.java)

[Código App](../src/practica4/App.java)

[Documentación Javadoc](../docs/practica4/)

El objetivo de esta práctica es que optimices el rendimiento y la eficiencia de código en Java. A partir de un código proporcionado, deberás identificar áreas que pueden mejorarse, ya sea en términos de rendimiento, uso de memoria o claridad.

## Problemas detectados en el código:
1. **Uso de *ArrayList* para búsqueda y eliminación:**

    - La búsqueda de productos por *id* y la eliminación de productos son operaciones de **búsqueda lineal**. Si la lista crece mucho, estas operaciones se vuelven lentas.

    - Las operaciones de eliminación también involucran mover todos los elementos siguientes, lo que puede ser costoso en términos de tiempo.

2. **Redundancia en búsqueda de producto:**

   - El método *findProductById()* se utiliza tanto para eliminar como para actualizar el precio de un producto. Si hay muchas búsquedas y eliminaciones, se podría optimizar.

3. **Uso de *ArrayList* en el método *findProductsByCategory*():**

    - El método *findProductsByCategory()* recorre toda la lista para encontrar productos de una categoría específica. Si hay una gran cantidad de productos, esta búsqueda es ineficiente.

4. **Comparación de precios de productos con un *Comparator* anónimo:**

    - La ordenación de productos por precio está utilizando un *Comparator* anónimo, que es funcional pero no la forma más eficiente ni más clara.

5. **Cálculo de total de precios:**

    - El método *calculateTotalPrice()* recorre toda la lista de productos cada vez que se llama. Si se calculan muchos totales, esto podría optimizarse.

## Tareas de optimización:

1. **Reemplazar *ArrayList* con una *HashMap* para Búsqueda Rápida:**

    - En lugar de usar un *ArrayList* para almacenar los productos, sustituirlo por un *HashMap*<Integer, Product> donde la clave es el id del producto. Esto permitirá realizar búsquedas, eliminaciones y actualizaciones en tiempo **O(1)**, en lugar de **O(n)**.

2. **Eliminar Búsquedas Repetidas:**

    - Modificar el código para que no se repita la búsqueda del producto por id. Por ejemplo, al actualizar el precio de un producto, no es necesario buscarlo nuevamente si ya se tiene la referencia.

3. **Optimizar el Método findProductsByCategory:**

    - Si el número de productos es grande, se podría utilizar una estructura de datos como un *HashMap*<String, List<Product>> que mapea categorías a listas de productos. Esto permitiría encontrar productos de una categoría en **O(1)** en lugar de **O(n)**.

4. **Optimizar la Ordenación de Productos:**

    - Usar un *Comparator* más eficiente o considerar si es necesario ordenar los productos repetidamente. Si los productos se ordenan con frecuencia, podría ser útil ordenar la lista una vez y mantenerla ordenada con una estructura de datos adecuada.

5. **Optimizar el Cálculo del Total de Precios:**

    - Evitar el cálculo repetido del total en *calculateTotalPrice()* recorriendo la lista de productos cada vez. Una opción sería mantener un campo adicional que almacene el total y solo actualizarlo cuando cambie el precio de un producto o cuando se añadan/eliminan productos.