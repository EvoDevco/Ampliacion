import java.util.Scanner;
import java.util.Arrays;

public class NumerosVampiro {
    public static final String ANSI_ROJO = "\u001B[31m";
    public static final String ANSI_VERDE = "\u001B[32m";
    public static final String ANSI_AMARILLO = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        int n_vampiro, n_colmillos,n_cifras;
        int num=0;
        System.out.println("Introduce un nuemro para ver si es vampiro o no");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        n_cifras = String.valueOf(num).length();

        if (n_cifras ==4){
            int a[] = new int[n_cifras];
            for (int i = 0; i < n_cifras; i++) {
                a[i] = Integer.parseInt(String.valueOf(num).substring(i,i+1));
            }



            for (int i = 0; i < n_cifras; i++) {
                for    (int j = 0; j < n_cifras; j++) {
                    if (i != j) {
                        n_vampiro = a[i] * 10 + a[j];
                        n_colmillos = num / n_vampiro;
                        if (n_vampiro * n_colmillos == num) {
                            System.out.println(ANSI_VERDE+"El numero " +ANSI_AMARILLO+ num + ANSI_VERDE+" es un numero vampiro con colmillos " +ANSI_AMARILLO+ n_vampiro + ANSI_VERDE+" y " +ANSI_AMARILLO+ n_colmillos+ ANSI_RESET);
                            return;
                        }
                    }
                }
            }

        }else{
            System.out.println(ANSI_ROJO + "Error el numero no es valido" + ANSI_RESET);
        }
    }
}