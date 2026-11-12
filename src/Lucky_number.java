import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Lucky_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma = 0;
        int resultado=0;
        String fecha_completa = in.nextLine();
        String[] fechas = fecha_completa.split("-");
        List<String> numeros = new ArrayList<>();
        for (String fecha:fechas){
            numeros.addAll(Arrays.asList(fecha.split("")));
        }
        for (String cifras:numeros){
            if (!(Integer.parseInt(cifras)==0)){
            suma+= Integer.parseInt(cifras);
            }
        }
        String[] cifras=String.valueOf(suma).split("");
        for (String cifra:cifras){
            resultado+=Integer.parseInt(cifra);
        }
        System.out.println("El lucky number resultante es: " + resultado);
    }
}