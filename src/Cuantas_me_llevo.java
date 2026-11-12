import java.util.Scanner;

public class Cuantas_me_llevo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indiquee el primer numero");
        int numero_1 = in.nextInt();
        System.out.println("Indiquee el segundo numero");
        int numero_2= in.nextInt();
        String n1 = String.valueOf(numero_1);
        String n2 = String.valueOf(numero_2);
        int[] array = new int[5];
        int[] array_2 = new int[5];
        int contador = 0;
        if (n1.length()!=n2.length()){
            System.out.print("Los numeros deben ser de la misma largaria, de lo contrario no se pueden llevar a cabo las operaciones.");
        }else {
            for (int posicion = 0; posicion < n1.length(); posicion++) {
                array[posicion] = Integer.parseInt(String.valueOf(n1.charAt(posicion)));
            }
            for (int posicion2 = 0; posicion2 < n2.length(); posicion2++) {
                array_2[posicion2] = Integer.parseInt(String.valueOf(n2.charAt(posicion2)));
            }
            for (int posicion3 = 0; posicion3 < array.length; posicion3++) {
                if (array[posicion3] + array_2[posicion3] >= 10) {
                    contador += 1;
                }
            }
        }
        System.out.println("El numero de llevadas es: " + contador);
    }
}