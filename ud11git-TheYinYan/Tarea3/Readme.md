# Conceptos y comandos sobre ramas

[Readme Principal](../../Readme.md) <br>
[Readme T1.1](../README.md)

## ¿La gestión de ramas es exclusiva de Git?

No, la **gestión de ramas (branching)** no es exclusiva de Git; otros sistemas de control de versiones (como Mercurial o SVN) también la permiten <br> Sin embargo, **Git la hace mucho más eficiente y ligera**, ya que las ramas son simples punteros a commits, no copias completas del proyecto.

## ¿En qué consiste el trabajo con ramas?

El trabajo con ramas permite **desarrollar nuevas características, corregir errores o probar ideas** sin afectar el código principal. <br>
Cada rama representa una línea **independiente de desarrollo**, que puede luego fusionarse (merge) con otras ramas.

## Características del trabajo en ramas de Git

- Son **ligeras y rápidas** (solo punteros a commits).

- Permiten **trabajar en paralelo** sin interferencias.

- Facilitan **pruebas y desarrollo aislado.**

- Se pueden **fusionar** (merge) o **rebasar** (rebase).

- Git puede **detectar y gestionar conflictos** al combinar ramas.

## Metadatos que almacena un commit

Un commit guarda:

- Identificador único (**hash SHA-1 o SHA-256**).

- **Autor** (nombre y correo).

- **Fecha y hora** del commit.

- **Mensaje del commit** (descripción de los cambios).

- **Padre(s)** del commit (anterior o anteriores).

- **Instantánea (snapshot)** del árbol de archivos del proyecto.

## ¿Cuántos padres puede tener un commit?

Normalmente **1 padre**, pero tiene **2 padres o más** cuando se hace una **fusión (merge).**

## ¿Qué es una rama?

Una **rama (branch)** es un **puntero o referencia móvil a un commit específico**.<br>
Permite desarrollar de forma paralela sin alterar la rama principal.

## Rama por defecto y cuándo se crea

La rama por defecto se llama **_main_** (antes se usaba **_master_**). <br>
Se crea **automáticamente con el primer commit** del repositorio.

## ¿Cómo avanza la rama?

La rama **avanza automáticamente al hacer un nuevo commit:** <br>

El puntero de la rama se actualiza para apuntar al nuevo commit.

## Crear una rama (sin cambiar de rama)

```bash
git branch nombre_rama
```

Solo crea la rama. <br>
No crea commits nuevos ni cambia la referencia **_HEAD_**.

## Cambiar de rama (mover HEAD)

```bash
git checkout nombre_rama
```

Cambia la referencia **_HEAD_** para apuntar a esa rama y **actualiza los archivos del directorio de trabajo** según el commit correspondiente. <br>

En versiones modernas también puede usarse:

```bash
git switch nombre_rama
```

## Mostrar las ramas en modo gráfico

```bash
git log --graph --oneline --decorate --all
```

Muestra el historial de commits y ramas en forma de gráfico de árbol.

## Crear y saltar a una nueva rama

```bash
git checkout -b nombre_rama
```

O tambien <br>

```bash
git switch -c nombre_rama
```

Crea la rama y cambia a ella inmediatamente.

## Incorporar los cambios de otra rama (fusionar)

```bash
git merge nombre_rama
```

Combina los cambios de **_nombre_rama_** en la rama actual.

## Fusión Fast Forward (“avance rápido”)

Ocurre cuando la rama actual **no tiene commits propios** desde que se bifurcó. <br>
Git simplemente **mueve el puntero** de la rama hacia adelante, sin crear un commit de merge.

## Borrar una rama

```bash
git branch -d nombre_rama
```

Borra la rama si **ya fue fusionada.** <br>
Para **forzar el borrado** aunque no esté fusionada:

```bash
git branch -D nombre_rama
```

## Fusión a tres bandas (three-way merge)

Se produce cuando **ambas ramas tienen commits diferentes** desde su bifurcación. <br>
Git compara tres versiones: <br>

1. El **ancestro común**

2. El **último commit de la rama actual**

3. El **último commit de la rama fusionada**.

Y combina los cambios.

## Conflicto de fusión (merge conflict)

Ocurre cuando **dos ramas modifican la misma parte de un archivo de forma diferente**.
Git no puede decidir cuál versión conservar y pide al usuario resolverlo manualmente.

## Listar todas las ramas del repositorio

```bash
git branch
```

Muestra las ramas locales.<br>

Para incluir las remotas: <br>

```bash
git branch -a
```

## Rama activa y cómo se indica

La **rama activa** es aquella donde estás trabajando (la que apunta **_HEAD_**). <br>
En el listado de ramas, se indica con un **_asterisco_** \*:

```bash
    * main

      nueva-funcion
```

## Mostrar el último commit de cada rama

```bash
git branch -v
```

Muestra para cada rama el **_último commit_** y su mensaje resumido.

## Filtrar ramas fusionadas y significado del asterisco

```bash
git branch --merged
```

Muestra las ramas que **_ya han sido fusionadas_** con la actual.

- El **_asterisco_** (\*) indica la **_rama activa_**, es decir, aquella en la que estás situado actualmente.

## Forzar el borrado de una rama no fusionada

```bash
git branch -D nombre_rama
```

Elimina la rama **_aunque sus cambios no estén fusionados._**

[Readme Principal](../../Readme.md) <br>
[Readme T1.1](../README.md)