package exercicio_3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 2/11/2018
 */
public class FiosFillos extends Thread {

    // Propiedades
    int hilo;

    // Constructor
    public FiosFillos(int hilo) {
        this.hilo = hilo;
        if(hilo <=5)
        System.out.println("Hola soy el hilo : " + " h" + hilo);
    }

    // Métodos
    @Override
    public void run() {
        FiosFillos hilof;

        if (hilo <= 5) {
            try {

                hilof = new FiosFillos(hilo + 1); // Se crea el hijo
                hilof.start(); // Se inicia el hijo

                for (int i = 0; i <= 10; i++) {
                    sleep((long) ((Math.random() * (600)) + 100));
                    System.out.println("Hilo: " + hilof + " ejecución = " + i);
                }
                hilof.join();
                System.out.println("El hilo " + hilof + "ha terminado");
            } catch (InterruptedException ex) {
                Logger.getLogger(FiosFillos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
