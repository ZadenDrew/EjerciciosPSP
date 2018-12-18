
package exercicio_8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrea
 */
public class Tartaruga extends Thread {

    private Carreira car;

    public Tartaruga(Carreira carreira) {
        this.car = carreira;
    }

    @Override
    public void run() {
        // Invocamos el metodo sincronizado de la clase carrera
        System.out.println("Tartaruga posición 1");
        try {
            car.tTartaruga();
        } catch (InterruptedException ex) {
            Logger.getLogger(Tartaruga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
