import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre;
       int nota;
       String resultado;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Ingrese su nombre:");
       nombre=teclado.nextLine();
       System.out.println("Calificacion:");
       nota=teclado.nextInt();
       
       if (nota >=70){
     // System.out,println("aprobado");
           
       }
       else if (nota <70){
           System.out.println("reprobado");
       }
    }
    
}