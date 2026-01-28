import Vehiculo.Coche;
import Vehiculo.Motor;

public class app {
    public static void main(String[] args) {
        Motor motor1 = new Motor("5.0L V8 Coyote", 1000);
        Coche choche1 = new Coche("Mustang", motor1);
        choche1.infoCoche();
    }
}
