import java.util.Arrays;
import java.util.Scanner;

public class lyrchel {
    public static void main(String[] args) {
        System.out.println("Indique el numero que desee analizar: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        System.out.println(Numeros_Lyrchel(numero));
    }

    public static int Numeros_Lyrchel(int num){
        int resultado=0;
        int iteraciones=0;
        do {
            if (num>=1000000000){
                resultado=-1;
                break;
            }
        String[] cifras = String.valueOf(num).split("");
        String[] cifras_I = Arrays.copyOf(cifras,cifras.length);
            for (int i = 0; i < cifras.length; i++) {
                cifras_I[i] = cifras[cifras.length - 1 - i];
            }
            if (Arrays.equals(cifras,cifras_I) && iteraciones>0){
                resultado= iteraciones;
            }else{
                String suma = "";
                String suma_I = "";
                for (String cifra:cifras){
                    suma= suma+cifra;
                }
                for (String cifra_I:cifras_I){
                    suma_I = suma_I+cifra_I;
                }
                num = Integer.parseInt(suma)+Integer.parseInt(suma_I);
            }
            iteraciones++;
        }while (resultado==0);
        return resultado;
    }
}
