import java.util.Arrays;
import java.util.Scanner;

public class Orden {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique cuantos numeros desea añadir ");
        int largaria = input.nextInt();
        int[] numeros = new int[largaria];
        for (int posicion = 0; posicion<numeros.length;posicion++){
            System.out.println("Indique el numero en la posicion " + (posicion+1) + " :");
            numeros[posicion]= input.nextInt();
        }
        System.out.println(orden(numeros));

    }
    public static String orden(int[] numeros){
        String regresar = "";
        boolean iguales = true;
        boolean descendente = true;
        boolean ascendente = true;
        int anterior = numeros[0];
        int[] numeros_iguales = new int[numeros.length];
        Arrays.fill(numeros_iguales,numeros[0]);
        if (!(Arrays.equals(numeros_iguales,numeros))){
            iguales=false;
        }
        for (int analizados = 1; analizados<numeros.length;analizados++){
            if (numeros[analizados]<anterior){
                ascendente=false;
            }
            if (numeros[analizados]>=anterior){
                descendente=false;
            }
            anterior=numeros[analizados];
        }
        if (iguales) {
            regresar = "Iguales";
        }else if (ascendente){
            regresar = "Ascendente";
        } else if (descendente) {
            regresar = "Descendente";
        }else {
            regresar = "Desordenado";
        }
        return regresar;
    }
}