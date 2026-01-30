# Tarea 7: Pruebas unitarias con jUnit. Tiempo
[Readme Tema 3](../Readme.md) <br>
[Readme Principal](../../Readme.md) <br>

[Main Tiempo](tiempo/src/main/java/com/eed/tiempo/Tiempo.java)

[Test Tiempo](tiempo/src/test/java/com/eed/tiempo/TiempoTest.java)

- Creamos el campo dia porque no existia con sus Set y Get
    ```java
        private int dias;

        ...
        public int getDias() {
            return dias;
        }

        protected void setDias(int dias) {
            this.dias = dias;
        }
    ```
- Constructor Tiempo para que normalice normaliza porque no normalizaba y añada dias ya que no existía

  **Antes:**

  ```java
    public Tiempo(int horas, int minutos, int segundos) throws CantidadNegativaException {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }
  ```

  **Despues:**

  ```java
	public Tiempo(int horas, int minutos, int segundos) throws CantidadNegativaException {
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
		setDias(0);

		normaliza();
	}
  ```

- Poner los set a protect para poder hacerle los test


- La Funcion normaliza modificado para normalizar horas aumentando dias cada 24h y quitar while que no hacen nada

  **Antes:**
  ```java
	public Tiempo normaliza() {
		while (this.minutos > 59) {
			this.minutos -= 60;
			this.horas++;
		}
		while (this.segundos > 59) {
			this.segundos -= 60;
			this.minutos++;
		}
		while (this.minutos < 0) {
			this.minutos += 59;
			this.horas--;
		}
		while (this.segundos < 0) {
			this.segundos += 59;
			this.minutos--;
		}
		return this;// kk. innecesario
	}
  ```

  **Despues:**
  ```java
	public Tiempo normaliza() {
		while (this.minutos > 59) {
			this.minutos -= 60;
			this.horas++;
		}
		while (this.segundos > 59) {
			this.segundos -= 60;
			this.minutos++;
		}
		while (this.horas >= 24) {
			this.horas -= 24;
			this.dias++;
		}
		return this;// kk. innecesario
	}
  ```

- Normalizar la suma de tiempos con enteros
    ```java
    public void suma(int sumaHoras, int sumaMinutos, int sumaSegundos) throws CantidadNegativaException {
            setHoras(horas + sumaHoras);
            setMinutos(minutos + sumaMinutos);
            setSegundos(segundos + sumaSegundos);
            normaliza();
        }
    ```
[Readme Tema 3](../Readme.md) <br>
[Readme Principal](../../Readme.md) <br>