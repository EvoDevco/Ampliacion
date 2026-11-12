import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma=0;
        System.out.println("Indique su año de nacimiento");
        String año= in.nextLine();
        System.out.println("Ahora indique de manera numerica el mes");
        String mes = in.nextLine();
        System.out.println("Y finalmente el dia, de manera numerica denuevo.");
        String dia = in.nextLine();
        String fecha_completa = dia+mes+año;
        for (int posicion = 0;posicion < fecha_completa.length();posicion++){
            char numero = fecha_completa.charAt(posicion);
            suma += Character.getNumericValue(numero);
        }
        int numero_suerte=0;
        String suma_S =String.valueOf(suma);
        for (int posicion2 = 0;posicion2 < suma_S.length();posicion2++){
            char numero = fecha_completa.charAt(posicion2);
            numero_suerte += Character.getNumericValue(numero);
        }
        System.out.println("Tu numero de la suerte es: " + numero_suerte);
    }
}
