package exercicio_9;

/**
 *
 * @author andrea
 */
public class Ascensor {

    private int estacionado = 20;
    private boolean ascensorOcupado = false;

    /**
     * Si el ascensor está ocupado :esperamos,
     * si no :compara el piso en el que nos encontramos con la planta en la que está el ascensor.
     * Indica si está subiendo o bajando.
     * Cambiamos el boleano para indicar que el ascensor está libre
     *
     * @param planta
     * @throws InterruptedException
     */
    public synchronized void enMovemento(int planta) throws InterruptedException {
        if (ascensorOcupado == true) {
            wait();
        }
        if (planta > estacionado) {
            System.out.println("Ascensor subiendo");
            estacionado = planta;
        } else {
            System.out.println("Ascensor bajando");
            estacionado = planta;
        }
        System.out.println("El ascensor se encuentra en la planta " + estacionado);
        ascensorOcupado = false;
        notifyAll();

    }

    /**
     * Pedimos el ascensor desde la planta indicada, si el ascensor está en
     * movimiento esperamos.
     * Cuando termine nos redirige al método "enMovemento()"
     *
     * @param planta
     * @throws InterruptedException
     */
    public synchronized void pedirAscensor(int planta) throws InterruptedException {
        if (ascensorOcupado == true) {
            wait();
        }
        enMovemento(planta);
        notifyAll();

    }
}
