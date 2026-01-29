package com.eed.tiempo;

/**
 * Clase que gestiona intervalos de tiempo en horas, minutos y segundos. *
 * 
 * @author Magarin
 * @version "%I%, %G%"
 */
public class Tiempo {
	private int horas;
	private int minutos;
	private int segundos;
	private int dias;

	public Tiempo(int horas, int minutos, int segundos) throws CantidadNegativaException {
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
		setDias(0);

		normaliza();
	}

	public int getDias() {
		return dias;
	}

	protected void setDias(int dias) {
		this.dias = dias;
	}

	public int getHoras() {
		return horas;
	}

	protected void setHoras(int horas) throws CantidadNegativaException {
		if (horas < 0)
			throw new CantidadNegativaException("Las horas no pueden ser negativas");
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	protected void setMinutos(int minutos) throws CantidadNegativaException {
		if (minutos < 0)
			throw new CantidadNegativaException("Los minutos no pueden ser negativos");
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	protected void setSegundos(int segundos) throws CantidadNegativaException {
		if (segundos < 0)
			throw new CantidadNegativaException("Los segundos no pueden ser negativos");

		this.segundos = segundos;
	}

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

	public Tiempo suma(Tiempo tiempo) throws CantidadNegativaException {
		Tiempo resultado = new Tiempo(this.horas + tiempo.horas, this.minutos + tiempo.minutos,
				this.segundos + tiempo.segundos);
		resultado.normaliza();
		return resultado;
	}

	public void suma(int sumaHoras, int sumaMinutos, int sumaSegundos) throws CantidadNegativaException {
		setHoras(horas + sumaHoras);
		setMinutos(minutos + sumaMinutos);
		setSegundos(segundos + sumaSegundos);
		normaliza();
	}

	@Override
	public String toString() {
		return "Tiempo [horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}

}
