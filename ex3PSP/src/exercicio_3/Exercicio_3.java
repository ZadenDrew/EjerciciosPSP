/**
 * Realizar un programa que cree un fío, que a súa vez cree outro fío, e así
 * consecutivamente, ata un total de cinco fíos. Cada fío debe presentar os e u
 * nome indicando que comenzou, crear os eu fío fillo e presentar os e u nome 10
 * veces indicando que se está procesando, esperando un tempo aleatorio entre
 * 100 e 600 milisegundos entre cada presentación. Cada fío deberá esperar a que
 * o seu fillo termine antes de presentar os eu último mensaxe indicando os eu
 * nome e que rematou.*
 */
package exercicio_3;

/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 2/11/2018
 */
public class Exercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiosFillos h = null;

        h = new FiosFillos(1); // Se crea el hijo
        h.start();
        
        System.out.println("5 HILOS CREADOS...");

    }
}
