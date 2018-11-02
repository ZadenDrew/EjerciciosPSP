package ejercicio4;

/**
 *
 * @author oracle
 */
public class FioPai implements Runnable {

    String nomeFio;

    public FioPai(String nomeFio) {
        this.nomeFio = nomeFio;
    }

    @Override
    public void run() {
        System.out.println("Comenzando " + nomeFio);
   
        System.out.println("Terminando " + nomeFio);

    }

}
