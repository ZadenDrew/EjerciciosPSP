package exercicio_5;

/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 2/11/2018
 */
public class Fio extends Thread {

    String nombre;
    int numero;

    public Fio(String nom, int num) {
        nombre = nom;
        numero = num;

    }

    @Override
    public void run() {

        System.out.println("Ola, son o " + nombre + " número " + numero);

    }

}
