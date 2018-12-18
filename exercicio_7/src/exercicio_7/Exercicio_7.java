/**Programa que simule un buzón de correo (recurso compartido), de xeito que se
poida leer unha mensaje ou envialo. O buzón soamente pode almacear unha
mensaxe, de xeito que para poder escribir débese atopar baleiro e para poder leer
debe de estar cheo. Crear varios fíos lectores e escritores que manexen o buzón
de xeito sincronizado.**/

package exercicio_7;
/**
 *
 * @author Andrea Cabezas López
 * @since Fecha 15/12/2018
 */
public class Exercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws InterruptedException {
         Buzon buz = new Buzon();
        
       
        
        Enviar p1 = new Enviar(buz);
        Recibir p2 = new Recibir(buz);
        Enviar p3 = new Enviar(buz);
        Recibir p4 = new Recibir(buz);
        
        p1.start();
        p2.start();
        
        p4.start();
        p3.start();
        
   
    

    }

}
