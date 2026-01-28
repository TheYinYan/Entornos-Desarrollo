package CuentaBancaria;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.printf("Se a depositado  %.2f $ en su cuenta, ahora tiene queda %.2f $ %n", cantidad, saldo);
    }

    public void retirar(double cantidad) {
        if (saldo - cantidad < 0) {
            System.out.printf("No puedes retiar más del saldo actual %.2f $ %n", saldo);
        } else {
            saldo -= cantidad;
            System.out.printf("Se a retirado %.2f $ de su cuenta, le queda %.2f $ %n", cantidad, saldo);
        }
    }

}