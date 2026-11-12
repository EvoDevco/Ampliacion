import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio_4_por_finalizar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[4];
        int numero = 0;
        System.out.println("Indique el numero");
        numero = in.nextInt();
        int contador=0;
            array[0] = Integer.parseInt(String.valueOf(numero).substring(0, 1));
            array[1] = Integer.parseInt(String.valueOf(numero).substring(1, 2));
            array[2] = Integer.parseInt(String.valueOf(numero).substring(2, 3));
            array[3] = Integer.parseInt(String.valueOf(numero).substring(3, 4));
            if (array[0]!=array[1]|array[0]!=array[2]|array[0]!=array[3]){
                Arrays.sort(array);
                int numero_ascendente = array[0]*1000+array[1]*100+array[2]*10+array[3];
                int numero_descente = array[3]*1000+array[2]*100+array[1]*10+array[0];
                for (int iteracion = 1;numero!=6174;contador++){
                    numero=numero_descente-numero_ascendente;
                        array[0] = Integer.parseInt(String.valueOf(numero).substring(0, 1));
                        array[1] = Integer.parseInt(String.valueOf(numero).substring(1, 2));
                        array[2] = Integer.parseInt(String.valueOf(numero).substring(2, 3));
                        array[3] = Integer.parseInt(String.valueOf(numero).substring(3, 4));
                        Arrays.sort(array);
                        numero_ascendente = array[0]*1000+array[1]*100+array[2]*10+array[3];
                        numero_descente = array[3]*1000+array[2]*100+array[1]*10+array[0];
                        contador = iteracion;
                }
            }else {
                System.out.println("el numero no es valido");
                }
        System.out.println("El numero entregado se tranformara en 6174 tras " + contador + " iteraciones");
    }
}

