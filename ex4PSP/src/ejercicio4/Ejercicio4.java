/**
 * Realiza un programa en java que execute tres fíos de forma concurrente. Un de
 * eles debe sumar os números pares del 1 ao 1000, outro os impares, e outro, os
 * que terminen en dous ou en tres.*
 *
 */
package ejercicio4;

/**
 *
 * @author oracle
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hilo principal iniciando.");
        //Primero, construye un objeto MiHilo.
        FioPai FioP = new FioPai("Pai");
        //Luego, construye un hilo de ese objeto.
        Thread FioUn = new Thread(FioP, "#1");
        Thread FioDous = new Thread(FioUn, "#2");
        Thread FioTres = new Thread(FioDous, "#3");

        //Finalmente, comienza la ejecución del hilo.
        FioUn.start();
        int sumPar = 0;
        String cad = "";
        for (int j = 0; j <= 1000; j = j + 2) {
            cad = cad + " " + j;
            sumPar = sumPar + j;
        }
        //  System.out.println(cad);
        System.out.println("Suma de los 1000 primeros números pares :" + sumPar);
        FioUn.join(100);
        FioDous.start();
        int sumImp = 0;
        String cadena = "";
        for (int i = 1; i <= 1000; i = i + 2) {
            cadena = cadena + " " + i;
            sumImp = sumImp + i;
        }

        // System.out.println(cadena);
        System.out.println("Suma de los 1000 primeros números impares : " + sumImp);
        FioDous.join(100);
        FioTres.start();
        String cad3 = "";
        int sum = 0;
        for (int n = 0; n <= 1000; n++) {
            if ((n % 10 == 2) || (n % 10 == 3)) {
                cad3 = cad3 + "" + n;
                sum = sum + n;

            }
            // System.out.println(cad3);

        }
        System.out.println("Suma de los 1000 primeros números terminados en 2-3 : " + sum);
        try {
            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }

}
