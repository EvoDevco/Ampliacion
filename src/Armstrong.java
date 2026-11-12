import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int suma=0;
        System.out.println("Indique el numero");
        String numero= in.nextLine();
        for (int posicion = 0;posicion < numero.length();posicion++){
            char numero_1 = numero.charAt(posicion);
            suma += Character.getNumericValue(numero_1)*Character.getNumericValue(numero_1)*Character.getNumericValue(numero_1);
        }
        if (suma == Integer.parseInt(numero)){
            System.out.println("El numero indicado es de armstrong");
        }else{
            System.out.println("el numero indicado no es de armstrong.");
        }
    }
}