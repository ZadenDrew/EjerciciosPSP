
package exercicio_7;

/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 15/12/2018
 */
public class Enviar extends Thread {

    private Buzon buzon;

    public Enviar(Buzon buzon) {
        this.buzon = buzon;
    }

    @Override
    public void run() {
        
      buzon.enviar();

    }
    
}
