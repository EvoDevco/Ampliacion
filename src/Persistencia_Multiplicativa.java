import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Persistencia_Multiplicativa {
    public static void main(String[] args) {
        System.out.println("Indique el numero que desea analizar: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int saltos = 0;
        for (int i = 0;String.valueOf(numero).length()>1;i++){
            int suma = 1;
            String[] cifras = String.valueOf(numero).split("");
            for (String cifra:cifras){
                suma = suma*Integer.parseInt(cifra);
            }
            numero=suma;
            saltos++;
        }
        System.out.println(saltos);
    }
}