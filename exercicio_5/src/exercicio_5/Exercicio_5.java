/** Escribe unha clase que cree dous fíos e force que a escritura do segundo sexa sempre anterior á
 * escritura por pantalla do primeiro.
 * Exemplo de ejecución:
 * Ola, son o fío número 2
 * Ola, son o fío número 1
 * a) faino con join
 * b )faino con prioridades * */
package exercicio_5;

/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 2/11/2018
 */
public class Exercicio_5 {

    /**
     * @param args the command line arguments
     */
    static int n = 1;

    public static void main(String[] args) throws InterruptedException {
        Fio h1 = new Fio("fio", n++);
        Fio h2 = new Fio("fio", n++);

        // La prioridad para h2 empieza a funcionar dandole un valor superior a 5
        h1.setPriority(1);
        h2.setPriority(10);

        h2.start();
        h1.start();

        /* Al usar join alternan priridad .Tuve que darle mucha diferencia de tiempo entre los dos joins para que 
        prevaleciese siempre el h2 como prioritario*/
        h1.join(20);
        h2.join(1);

    }

}
