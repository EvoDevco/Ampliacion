import java.util.Scanner;

public class Radar_tramo {
    public static void main(String[] args) {
        int distanica_metros,maxVHM,tiempo_segundos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la distancia en metros");
        distanica_metros= sc.nextInt();
        System.out.println("Ahora indique la maxima velocidad permitida en hectometros.");
        maxVHM= sc.nextInt();
        System.out.println("Y finalmente el tiempo usado en segundos");
        tiempo_segundos= sc.nextInt();
        if (distanica_metros<0){
            System.out.println("ERROR");
        } else if (maxVHM<0) {
            System.out.println("ERROR");
        } else if (tiempo_segundos<0) {
            System.out.println("ERROR");
        }
        double max_M_S = (double)maxVHM*100/3600;
        double tiempo_viaje_correcto= distanica_metros/max_M_S;
        if (tiempo_viaje_correcto>tiempo_segundos){
            if (tiempo_segundos-tiempo_viaje_correcto>tiempo_viaje_correcto/5){
                System.out.println("PUNTOS");
            }
            else {
                System.out.println("MULTA");
            }
        }else {
            System.out.println("BIEN");
        }
    }
}
