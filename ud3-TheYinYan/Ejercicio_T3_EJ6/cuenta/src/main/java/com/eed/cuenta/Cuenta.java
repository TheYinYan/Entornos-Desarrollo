package com.eed.cuenta;

/**
 * Cuenta corriente
 * 
 * @author lmagarin
 * 
 */
public class Cuenta {
	/**
	 * último código de cuenta asignado. Común a todas las cuentas Para identificar
	 * a cada cuenta con un número único
	 */
	private static int ultimoCodigo;
	/**
	 * Identificador único de cada cuenta. Se genera en el constructor
	 * automáticamente a partir del contado ultimoCodigo
	 */
	private int codigo;
	private int saldo = 100;

	/**
	 * Crea una cuenta con el saldo inicial indicado
	 * 
	 * @param saldoInicial saldo inicial de la cuenta
	 */
	public Cuenta(int saldoInicial) throws CantidadNegativaException {
		codigo = ++ultimoCodigo;
		setSaldo(saldoInicial);
	}

	public void reintegro(int cantidad) throws ReintegroException {
		if (cantidad > saldo)
			throw new ReintegroException("ERROR. No se ha podido realizar el reintegro.");

		saldo -= cantidad;
	}

	public void ingreso(int cantidad) throws CantidadNegativaException {
		if (cantidad < 0)
			throw new CantidadNegativaException("No se puede hacer ingreso de una cantidad negativa");
		saldo += cantidad;
	}

	public int getSaldo() {
		return saldo;
	}

	public void transferencia(int dinero, Cuenta cuenta) throws TransferenciaException {
		if (saldo < dinero)
			throw new TransferenciaException(
					"ERROR. No se ha podido realizar la transferencia.\n" + toString() + "\n" + cuenta.toString());

		setSaldo(this.saldo - dinero);
		cuenta.setSaldo(cuenta.getSaldo() + dinero);
	}

	private void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [codigo=" + codigo + ", saldo=" + saldo + "]";
	}

	public int getCodigo() {
		return codigo;
	}

}