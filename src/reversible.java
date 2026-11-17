import java.util.Scanner;
public class reversible {
    public static void main(String[] args) {
        System.out.println("Indique el numero que desee analizar: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        String[] cifras = String.valueOf(numero).split("");
        String[] cifras_I = new String[cifras.length];
        for (int i = 0; i < cifras.length; i++) {
            cifras_I[i] = cifras[cifras.length - 1 - i];
        }
        if (Integer.parseInt(cifras_I[0]) == 0) {
            System.out.println("El numero NO es reversible");
        } else {
            int suma = 0;
            int suma_I = 0;
            for (String cifra : cifras) {
                suma += Integer.parseInt(cifra);
            }
            for (String cifra_I : cifras_I) {
                suma_I += Integer.parseInt(cifra_I);
            }
            if (suma == suma_I) {
                System.out.println("El numero es reversible");
            } else {
                System.out.println("El numero NO es reversible");
            }
        }
    }
}