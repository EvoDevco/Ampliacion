import java.util.Arrays;
import java.util.Scanner;

public class Escaleras_colores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indique el valor de las 4 cartas que ya poseees.");
        int [] array1 = new int[4];
        for (int repeticiones = 0; repeticiones<4;repeticiones++){
            array1[repeticiones] = in.nextInt();
        }
        Arrays.sort(array1);
        if (array1[3]<15 && array1[0]>0) {
            if (array1[1] - array1[0] != 1) {
                System.out.println("No podemos hacer una escalera de colores.");
            } else {
                if (array1[3] != 14) {
                    if (array1[0] == array1[1] - 1 && array1[1] == array1[2] - 1 && array1[2] == array1[3] - 1) {
                        int numero = array1[3] + 1;
                        System.out.println("el numero que requerimos seria: " + numero);
                    } else if (array1[0] != array1[1] - 1 && array1[1] == array1[2] - 1 && array1[2] == array1[3] - 1) {
                        int numero = array1[1] - 1;
                        System.out.println("el numero que requerimos seria: " + numero);
                    } else if (array1[0] == array1[1] - 1 && array1[1] != array1[2] - 1 && array1[2] == array1[3] - 1) {
                        int numero = array1[2] - 1;
                        System.out.println("el numero que requerimos seria: " + numero);
                    } else if (array1[0] == array1[1] - 1 && array1[1] == array1[2] - 1 && array1[2] != array1[3] - 1) {
                        int numero = array1[3] - 1;
                        System.out.println("el numero que requerimos seria: " + numero);
                    } else if (array1[0] != 1 && array1[3] != 14) {
                        System.out.println("No podemos hacer una escalera de colores con las cartas indicadas.");
                    }
                } else if (array1[3] == 14) {
                    if (array1[0] == array1[1] - 1 && array1[1] == array1[2] - 1 && array1[2] == array1[3] - 1) {
                        int numero = array1[0] - 1;
                        System.out.println("el numero que requerimos seria: " + numero);
                    } else if (array1[0] != array1[1] - 1 && array1[1] == array1[2] - 1 && array1[2] == array1[3] - 1) {
                        int numero = array1[1] - 1;
                        System.out.println("el numero que requerimos seria: " + numero);
                    } else if (array1[0] == array1[1] - 1 && array1[1] != array1[2] - 1 && array1[2] == array1[3] - 1) {
                        int numero = array1[2] - 1;
                        System.out.println("el numero que requerimos seria: " + numero);
                    } else if (array1[0] == array1[1] - 1 && array1[1] == array1[2] - 1 && array1[2] != array1[3] - 1) {
                        int numero = array1[3] - 1;
                        System.out.println("el numero que requerimos seria: " + numero);
                    } else if (array1[0] != 1 && array1[3] != 14) {
                        System.out.println("No podemos hacer una escalera de colores con las cartas indicadas.");
                    }
                }
            }
        }
    }
}
