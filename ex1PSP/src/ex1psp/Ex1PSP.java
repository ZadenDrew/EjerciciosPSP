/** Programa en Java que cree dous fíos e os executa. Os fíos escriben dez veces un número de
 * iteración do bucle e seu nome. En cada iteración, despois de escribir o seu nome, se bloquean
 * durante un tempo aleatorio de segundos e después volven a estar dispoñibles para a súa
 * execución.* */
package ex1psp;

/**
 *
 * @author andrea
 */
public class Ex1PSP {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 2; i++) {
            new BucleHilos("hilo" + i).start();
        }
        BucleHilos.sleep(7000);
        System.out.println("Termina el hilo principal");

    }

}
