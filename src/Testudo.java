import java.util.Scanner;
//QUE LOCURAAAA
public class Testudo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indiquee el numero de legionarios");
        int legionarios = in.nextInt();
        int suma = 0;
        while (legionarios != 0) {
            if (legionarios >= 10 * 10) {
                System.out.println("testudo de 100");
                legionarios -= 100;
                suma+=100+10*4;
            } else if (legionarios >= 9 * 9) {
                System.out.println("testudo de 81");
                legionarios -= 81;
                suma+=81+9*4;
            } else if (legionarios >= 8 * 8) {
                System.out.println("testudo de 64");
                legionarios -= 64;
                suma+=64+8*4;
            } else if (legionarios >= 7 * 7) {
                System.out.println("testudo de 49");
                legionarios -= 49;
                suma+=49+7*4;
            } else if (legionarios >= 6 * 6) {
                System.out.println("testudo de 36");
                legionarios -= 36;
                suma+=36+6*4;
            } else if (legionarios >= 5 * 5) {
                System.out.println("testudo de 25");
                legionarios -= 25;
                suma+=25+5*4;
            } else if (legionarios >= 4 * 4) {
                System.out.println("testudo de 16");
                legionarios -= 16;
                suma+=16+4*4;
            } else if (legionarios >= 3 * 3) {
                System.out.println("testudo de 9");
                legionarios -= 9;
                suma+=9+3*4;
            } else if (legionarios >= 2 * 2) {
                System.out.println("testudo de 4");
                legionarios -= 4;
                suma+=4+2*4;
            } else {
                System.out.println("testudo de 1");
                legionarios -= 1;
                suma+=1+4;
            }
        }
        System.out.println("El numero de escudos usados es: " + suma);
    }
}