package exercicio_4;

/**
 *
 * @author andrea
 */
public class Pares extends Thread {

    int sumPar = 0;
    String cad = "";

    @Override
    public void run() {
        for (int j = 0; j <= 1000; j = j + 2) {
            cad = cad + " " + j;
            sumPar = sumPar + j;
        }
        System.out.println("Suma de los 1000 primeros números pares :" + sumPar);
    }

}
