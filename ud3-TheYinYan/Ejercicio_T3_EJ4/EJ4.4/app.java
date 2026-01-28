import CuentaBancaria.CuentaBancaria;
public class app {
    public static void main(String[] args) {
        CuentaBancaria CB1 = new CuentaBancaria(100);
        CB1.depositar(12);
        CB1.retirar(100);
        CB1.retirar(30);
    }
}
