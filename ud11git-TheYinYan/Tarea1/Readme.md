# Comienzo con git por línea de comandos.

[Readme Principal](/README.md) <br>
[Readme T1.1](../README.md)

## Parte 1 — Crear un Token en GitHub

1. Entra a GitHub → Settings → Developer settings → Personal access tokens → Fine-grained tokens.

   ![Imagen](../Imagenes/Tarea1/1.png)

   Luengo vamos a Developer settings

   ![Imagen](../Imagenes/Tarea1/1.1.png)

   Abrimos listas de personal acces token y le damos a tokens Classic

   ![Imagen](../Imagenes/Tarea1/1.2.png)

2. Pulsa Generate new token.

   Desplegamos lista de Generate new token y le damos al classic

   ![Imagen](../Imagenes/Tarea1/1.3.png)

3. Rellena los campos:

   Name: algo descriptivo _(por ejemplo token-educaand)_

   Expiration: _30 o 90 días_ o _Ninguna_

   ![Imagen](../Imagenes/Tarea1/3.1.png)

   Marcamos el campo de repop para otrogar todos los permiso del repo al token

   ![Imagen](../Imagenes/Tarea1/3.2.png)

   Luego le damos a generar token

   ![Imagen](../Imagenes/Tarea1/3.3.png)

   Copiamos el token **_(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)_**

   ![Imagen](../Imagenes/Tarea1/3.4.png)

## Parte 2 — Configurar el repositorio local

1.  Deshabilitar la auticaciónj de Windows.

    ```bash
    git config --local --unset-all credential.helper || true
    git config --local credential.helper ""
    ```

    ![Imagen](../Imagenes/Tarea1/4.png)

2.  Cachear las cedenciales locales

    ```bash
    git config --local credential.helper "store --file .git/credentials"
    ```

    ![Imagen](../Imagenes/Tarea1/4.1.png)

    ```bash
    git push
    ``` 
    ![Imagen](../Imagenes/Tarea1/4.2.png)

3. Comprobamos el archivo 

    ![Imagen](../Imagenes/Tarea1/4.3.png)

4. hacemos un cat 

    ![Imagen](../Imagenes/Tarea1/4.4.png)

## Parte 3 — Diferencia entre --local y --global

|  Opción   | Archivo que modifica        |   Afecta a                      | ¿Cuándo usarla? | 
|-----------|-----------------------------|---------------------------------|-----------------|
| --local   | .git/config dentro del repo |   Solo a ese repositorio actual | Configuración específica: credenciales, comportamiento distinto en este proyecto |
| --global  | ~/.gitconfig                |   Todos los repos del usuario   | Datos personales y ajustes generales: nombre, email, editor, alias | 
 

[Readme Principal](/README.md) <br>
[Readme T1.1](../README.md)
