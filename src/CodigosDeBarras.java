import java.util.Scanner;

public class CodigosDeBarras {
    public static void main(String[] args) {
        int n_cifras, resultado = 0;
        String codigo_de_barras = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de cifras del codigo de barras:");
        codigo_de_barras = sc.nextLine();
        n_cifras = codigo_de_barras.length();

        int[] a = new int[n_cifras];
        if (n_cifras == 8 || n_cifras == 13) {
            //Saca los valores de cada cifra del codigo de barras y los mete en un array
            for (int i = 0; i < n_cifras; i++) {
                a[i] = Character.getNumericValue(codigo_de_barras.charAt(i));
            }
            //comprobar que tipo de codigo es y calcular el digito de control
            if (n_cifras==8){
                resultado =(a[6]*3)+a[5]+(a[4]*3)+a[3]+(a[2]*3)+a[1]+(a[0]*3);
                int b1 = Integer.parseInt(String.valueOf(resultado).substring(1, 2));
                resultado = 10 - b1;
                System.out.println("El digito de control es: " + resultado);
            } else { /*8414533043847*/
                resultado =a[11]*3+a[10]+a[9]*3+a[8]+a[7]*3+a[6]+a[5]*3+a[4]+a[3]*3+a[2]+a[1]*3+a[0];
                int b1 = Integer.parseInt(String.valueOf(resultado).substring(1, 2));
                resultado = 10 - b1;
                System.out.println("El digito de control es: " + resultado);
            }
            //comprobar si el digito de control es igual al ultimo numero del codigo de barras
            if (resultado == a[n_cifras - 1]) {
                System.out.println("El codigo de barras es valido.");
            } else {
                System.out.println("El codigo de barras no es valido.");
            }


        } else {
            System.out.println("El codigo de barras no es valido.");
        }
    }
}