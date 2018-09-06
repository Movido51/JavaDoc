
package proyecto_javadoc;
import java.util.Scanner
/**
 * Descrpcion de la Funcionalidad Clase
 * @author Estudiante
 * @version 1.0
 * @since 06/09/2018
 */
import becker.robots.*;
public class newKarel {
     public static void main(String[] args) {
        Scanner Lectura= new Scanner(System.in);
        String aff= Lectura.next();
        Karel2 prub= new Karel2();
        prub.move(1);        
        prub.Pick();
        prub.move(1);        
        prub.Pick();
        prub.move(1);        
        prub.Pick();
        prub.turn();
        prub.turn();
        prub.move(1);
        prub.move(1);
        prub.move(1);
        prub.turn();
        prub.move(1);
        prub.Put();
        prub.move(1);
        prub.Put();
        prub.move(1);
        prub.Put();
    }
     
    
}
