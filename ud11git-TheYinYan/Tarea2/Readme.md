# Comandos básicos en local.

[Readme Principal](/README.md) <br>
[Readme T1.1](../README.md)

## Escribe los comandos según su descripción:

1. Transforma el directorio actual en un repositorio de Git. Se añade un subdirectorio de .git con todos los archivos necesarios del repositorio

    ```bash
    git init
    ls -la
    ```
    
    ![Imagen](../Imagenes/Tarea2/1.png)

2. Especifica qué archivos quieres añadir al repositorio (a staging area, staged). Prepara los archivos modificados

    ```bash
    git add <archivo>
    ```
    
    ![Imagen](../Imagenes/Tarea2/2.png)
 
3. Confirma los cambios (a directorio git, committed)

    ```bash
    git commit -m "mensaje del commit"
    ```
    
    ![Imagen](../Imagenes/Tarea2/3.png)
    
4. Clona un repositorio existente

    ```bash
    git clone <url>
    ```
    
    ![Imagen](../Imagenes/Tarea2/4.png)
 
5. Muestra el estado de los archivos

    ```bash
    git status
    ```
    
    ![Imagen](../Imagenes/Tarea2/5.png)
 
6. Muestra estado abreviado

    ```bash
    git status -s
    ```
    
    ![Imagen](../Imagenes/Tarea2/6.png)
 
7. Ignora archivos

    ```bash
    nano .gitignore
    ```
    
    ![Imagen](../Imagenes/Tarea2/7.png)
    ![Imagen](../Imagenes/Tarea2/7.1.png)

 
8. Mostrar los cambios: líneas exactas que fueron añadidas y eliminadas. Compara lo que tienes en tu directorio de trabajo con lo que está en el área de preparación

    ```bash
    git diff    
    git diff --staged
    git diff --cached
    ```
    
    ![Imagen](../Imagenes/Tarea2/8.png)
    ![Imagen](../Imagenes/Tarea2/8.1.png)
    ![Imagen](../Imagenes/Tarea2/8.2.png)


9. Mostrar los cambios: líneas exactas que fueron añadidas y eliminadas. Compara tus cambios preparados con la última instantánea confirmada

    ```bash
    git commit -a -m "mensaje del commit"
    ```
    
    ![Imagen](../Imagenes/Tarea2/9.png)
 
10. Confirma los cambios sin pasar por el área de preparación (a directorio git, committed)

    ```bash
    git commit -a -m "mensaje del commit"
    ```
    
    ![Imagen](../Imagenes/Tarea2/10.png)
 
11. Eliminar archivos del directorio de trabajo y del área de preparación

    ```bash
    git rm -f <archivo>
    ```
    
    ![Imagen](../Imagenes/Tarea2/11.png)
 
12. Renombrar archivos del directorio de trabajo y del área de preparación

    ```bash
    git mv <archivo_antiguo> <archivo_nuevo>
    ```
    
    ![Imagen](../Imagenes/Tarea2/12.png)

13. Muestra el historial de confirmaciones

    ```bash
    git log
    ```
    
    ![Imagen](../Imagenes/Tarea2/13.png)
 
14. Muestra sólo las dos últimas confirmaciones indicando las diferencias introducidas en cada confirmación 

    ```bash
    git log -p -2
    ```
    
    ![Imagen](../Imagenes/Tarea2/14.png)
 
15. Rectifica el último commit ***(Para salir Guradando cambios ESC + :wq y sin guardar cambio ESC + :w)***

    ```bash
    git commit --amend
    ```
    
    ![Imagen](../Imagenes/Tarea2/15.png)
    ![Imagen](../Imagenes/Tarea2/15.1.png)


[Readme Principal](/README.md) <br>
[Readme T1.1](../README.md)