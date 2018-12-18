/**
 * Realiza un programa en java que execute tres fíos de forma concurrente. Un de
 * eles debe sumar os números pares del 1 ao 1000, outro os impares, e outro, os
 * que terminen en dous ou en tres.*
 *
 */
package exercicio_4;

/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 2/11/2018
 */
public class Exercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //construye un hilo de ese objeto.
        Pares FioUn = new Pares();
        Impares FioDous = new Impares();
        Valores FioTres = new Valores();

        //Finalmente, comienza la ejecución de los hilos.
        FioUn.start();

        FioUn.join(100);
        FioDous.start();

        FioDous.join(100);
        FioTres.start();

    }

}
