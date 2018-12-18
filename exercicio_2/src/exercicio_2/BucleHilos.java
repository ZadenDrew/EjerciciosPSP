package exercicio_2;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 2/11/2018
 */
public class BucleHilos extends Thread {

    public BucleHilos(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " ->" + getName());
            try {
                BucleHilos.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BucleHilos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println("Termina hilo " + getName());
      
    }
}
