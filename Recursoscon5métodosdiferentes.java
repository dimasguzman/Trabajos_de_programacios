
/**
 *
 * @author Dimas
 */
public class Recursoscon5métodosdiferentes {

    public static void main(String[] args) {
        Mensajes mensajes = new Mensajes();
        mensajes.Primermétodo();
        mensajes.Segundométodo(69);
        mensajes.tercerMetodo(0,0);
        mensajes.cuartoMetodo(20);
    }

    public static class Mensajes {

        public void Primermétodo() {
            System.out.println("Estoy aprendiendo, pero seré el mejor programador del mundo");
        }

        public void Segundométodo(int nota) {
            if (nota > 70) {
                System.out.println(" Aprobado");
            } else {
                System.out.println("Reprobado");
            }

        }

        public int tercerMetodo(int dividendo, int divisor) {
            try {
                if (divisor != 0) {
                    return dividendo / divisor;
                }
            } catch (ArithmeticException e) {

            }
            System.out.println("No se puede dividir entre 0");
            return 0;
        }

        public void cuartoMetodo(int num) {
            int[] listaNu = null;
            if (num > 0) {
                listaNu = new int[num + 1];
                for (int i = 1; i < listaNu.length; i++) {
                    listaNu[i] = i;
                    System.out.println(listaNu[i]);
                }
            }

        }

    }

}
