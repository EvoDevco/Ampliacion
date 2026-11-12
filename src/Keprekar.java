import java.util.Arrays;
import java.util.Scanner;

public class Keprekar {
    public static void main(String[] args) {
        int kaprekar = 6174;
        int num, a1, a2, a3, a4, iteraciones = 0;
        int[] arr = new int[4];
        //Pedir numero al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de 4 cifras para comprobar si es un numero de Kaprekar:");
        num = sc.nextInt();
        //Comprobar si el numero es de 4 cifras como maximo
        if (num > 9999) {
            System.out.println("El numero introducido es demasiado grande");
            //Comprobar si el numero es como minimo de 4 cifras, si no añairle 0s
        } else if (num <10){ num= num*1000;}
        else if (num <100){ num= num*100;}
        else if (num <1000){ num= num*10;}

        //separar los valores independientes del numero para comprobar que son diferentes

        a1 = Integer.parseInt(String.valueOf(num).substring(0, 1));
        a2 = Integer.parseInt(String.valueOf(num).substring(1, 2));
        a3 = Integer.parseInt(String.valueOf(num).substring(2, 3));
        a4 = Integer.parseInt(String.valueOf(num).substring(3, 4));

        if ((a1!=a2) || (a2!=a3) || (a3!=a4)) {

            //Hacer bucle hasta que el numero sea igual que el numero de kaprekar

            while (num != kaprekar) {
                //separar los valores independientes del numero para haer el array
                a1 = Integer.parseInt(String.valueOf(num).substring(0, 1));
                a2 = Integer.parseInt(String.valueOf(num).substring(1, 2));
                a3 = Integer.parseInt(String.valueOf(num).substring(2, 3));
                a4 = Integer.parseInt(String.valueOf(num).substring(3, 4));
                //hacer array
                arr = new int[]{a1, a2, a3, a4};

                Arrays.sort(arr);

                int num_asc = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
                int num_desc = arr[3] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[0];

                //Restar los numeros ordenados para saber el numero actual

                num = num_desc - num_asc;
                if (num<1000){num=num*10;}
                iteraciones++;
            }
            //mostrar erros si el numero no es de almenos dos numeros diferentes, lo comprobamos en el if de arriba
        } else {
            System.out.println("El numero introducido no tiene almenos 2 cifras direfernestes");

            //mostrar por panalla el numero de interaciones que ha echo el programa nates de que el numero se comvierta en kaprekar

        }System.out.println("Numnero de iteraciones:" + iteraciones);
    }
}