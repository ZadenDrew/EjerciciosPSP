package exercicio_4;

/**
 *
 * @author andrea
 */
public class Impares extends Thread {

    int sumImp = 0;
    String cadena = "";

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i = i + 2) {
            cadena = cadena + " " + i;
            sumImp = sumImp + i;
        }
        System.out.println("Suma de los 1000 primeros números impares : " + sumImp);
    }
}
