package ex1psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrea
 */
public class BucleHilos extends Thread {

    public BucleHilos(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ->" + getName());
            try {
                BucleHilos.sleep((long)(Math.random()*1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(BucleHilos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println("Termina hilo " + getName());
      
    }
}
