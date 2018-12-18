
package exercicio_7;

/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 15/12/2018
 */
public class Recibir extends Thread {

    private Buzon buzon;

    public Recibir(Buzon buzon) {
        this.buzon = buzon;
    }

    @Override
    public void run() {

        buzon.leer();

    }
    
}
