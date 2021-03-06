/** Programa que crea 4 fíos, os executa e espera a que estes terminen. Os fíos escriben 5 veces o
 * número de iteración do bucle e o seu nome. En cada iteración, despois de escribir o seu nome,
 * bloquéanse durante un segundo e volven a estar dispoñibles para a súa execución.* */
package ex2psp;

/**
 *
 * @author andrea
 */
public class Ex2PSP {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 4; i++) {
            new BucleHilos("hilo" + i).start();
           
        }
        BucleHilos.sleep(7000);
        System.out.println("Termina el hilo principal");
    }

}
