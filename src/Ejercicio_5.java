import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Indique la longitud del codigo (8 o 13)");
        int longitud = in.nextInt();
        in.nextLine();

        if (longitud != 8 && longitud != 13) {
            System.out.println("La longitud debe ser 8 o 13.");
            return;
        }

        System.out.println("Indique el codigo a comprobar");
        String numero = in.nextLine().trim();

        if (numero.length() != longitud || !numero.matches("[0-9]+")) {
            System.out.println("El codigo debe contener exactamente " + longitud + " cifras.");
            return;
        }

        int suma = 0;
        for (int pos = 0; pos < numero.length() - 1; pos++) {
            int digito = Character.getNumericValue(numero.charAt(pos));
            int posicionDesdeLaDerecha = numero.length() - 1 - pos;
            suma += digito * (posicionDesdeLaDerecha % 2 == 1 ? 3 : 1);
        }

        int digitoComprobacion = (10 - suma % 10) % 10;
        int ultimoDigito = Character.getNumericValue(numero.charAt(numero.length() - 1));

        if (digitoComprobacion == ultimoDigito) {
            System.out.println("El codigo es correcto");
        } else {
            System.out.println("El codigo no es correcto.");
        }
    }
}
