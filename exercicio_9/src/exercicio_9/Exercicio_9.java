/**Desenvolve un programa empregando fíos que simule o comportamento dun ascensor nun
 * edificio de 20 plantas. Cando alguén chama o ascensor desde un piso, irá a ese piso cando
 * poda (se está parado, vai nese intre, se está en marcha, só poderá ir cando teña rematado o
 * seu percorrido, xa sexa de subida ou de baixada). Para poder controlar este movemento,
 * precisamos coñecer cal é o piso no que se atopa o ascensor.**/

package exercicio_9;
/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 15/12/2018
 */
public class Exercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
         * Instanciamos un objeto tipo ascensor y varios hilos tipo usuario para
         * probar el funcionamiento del ascensor
         */
        Ascensor asc = new Ascensor();
        
        Usuario us = new Usuario(5,asc);
        Usuario us2 = new Usuario(18,asc);
        Usuario us3 = new Usuario(20,asc);
        
        //Iniciamos los hilos
        us.start();
        us2.start();
        us3.start();

    }
    
}
