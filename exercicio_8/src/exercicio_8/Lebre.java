
package exercicio_8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrea
 */
public class Lebre  extends Thread {

    private Carreira car;

    public Lebre(Carreira carreira) {
        this.car = carreira;
    }

    @Override
    public void run() {
        // Invocamos el metodo sincronizado de la clase carrera
        try {
            System.out.println("Lebre posición 1");
            car.tLebre();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lebre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

