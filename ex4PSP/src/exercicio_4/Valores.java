package exercicio_4;

/**
 *
 * @author andrea
 */
public class Valores extends Thread {

    int sum = 0;
    String cad3 = "";

    public void run() {
        for (int n = 0; n <= 1000; n++) {
            if ((n % 10 == 2) || (n % 10 == 3)) {
                cad3 = cad3 + "" + n;
                sum = sum + n;

            }
        }
        System.out.println("Suma de los 1000 primeros números terminados en 2-3 : " + sum);
    }
}
