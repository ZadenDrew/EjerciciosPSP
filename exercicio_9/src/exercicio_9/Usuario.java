
package exercicio_9;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrea
 */
public class Usuario extends Thread {

    public int planta;
    public Ascensor ascensor;

    public Usuario(int planta, Ascensor ascensor) {
        this.planta = planta;
        this.ascensor = ascensor;
    }
    
    /**
     * El usuario pide el ascensor desde la planta en la que se encuentra,
     * invocando al método pedirAscensor() y pasándole como parámetro el int planta.
     */
    @Override
    public void run() {

        try {
            ascensor.pedirAscensor(planta);
        } catch (InterruptedException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
