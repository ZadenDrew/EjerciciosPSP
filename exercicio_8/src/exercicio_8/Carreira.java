package exercicio_8;

/**
 *
 * @author andrea
 */
public class Carreira {
 

    private int posL = 1;
    private int posT = 1;


    private boolean meta = false;

    String txtLebre = "Lebre";
    String txtTar = "Tartaruga";

    /**
     *
     * @throws InterruptedException
     */
    public synchronized void tLebre() throws InterruptedException {

        while (meta != true) {
            int rNum = azar();
            if (rNum >= 1 && rNum <= 20) {
                muestraPos(posL, txtLebre);
            } else if (rNum > 20 && rNum <= 40) {
                posL += 9;
                meta(posT, txtLebre);

            } else if (rNum > 40 && rNum <= 50) {
                posL -= 12;
                posL = posInferioaInicial(posL);
                muestraPos(posL, txtLebre);

            } else if (rNum > 50 && rNum <= 80) {
                posL += 1;
                meta(posL, txtLebre);

            } else {
                posL -= 2;
                posL = posInferioaInicial(posL);
                muestraPos(posL, txtLebre);

            }

            notify();
            wait();

        }
        notify();
    }

    /**
     *
     * @throws InterruptedException
     */
    public synchronized void tTartaruga() throws InterruptedException {

        while (meta != true) {
            int rNum = azar();
            if (rNum >= 1 && rNum <= 50) {
                posT += 3;
                meta(posT, txtTar);

            } else if (rNum > 50 && rNum <= 70) {
                posT -= 6;
                posT = posInferioaInicial(posT);
                muestraPos(posT, txtTar);

            } else {
                posT += 1;
                meta(posT, txtTar);

            }
            notify();
            wait();

        }
        notify();
    }

    /**
     * Metodo que genera un numero al azar comprendido entre 1 y 100 y devuelve
     * un entero
     *
     * @return int
     */
    public int azar() {

        return (int) (Math.random() * 100 + 1);
    }

    /**
     * Comprueba que la posición no sea inferior a 1 si es así lo sustituye por
     * 1, si no, devuelve la posición recogida
     *
     * @param pos
     * @return int
     */
    private int posInferioaInicial(int pos) {
        if (pos < 1) {
            return 1;
        } else {
            return pos;
        }
    }

    /**
     * Comprueba si alguno de los 2 animales ha llegado a la meta recibe tanto
     * la posición como el nombre, si no, llama al metodo para mostrar la
     * posicion
     *
     * @param pos
     * @param nome
     */
    private void meta(int pos, String nome) {
        if (pos >= 70) {
            meta = true;
            muestraPos(pos, nome);
            System.out.println("GANÓ " + nome);
        } else {
            muestraPos(pos, nome);
        }
    }

    /**
     * Muestra la posición y el nombre que recibe pos pantalla.
     *
     * @param pos
     * @param nome
     */
    private void muestraPos(int pos, String nome) {
        System.out.println("Posición " + pos + " " + nome);
    }

}
