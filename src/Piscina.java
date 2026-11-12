import java.util.Scanner;

public class Piscina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indique el numero de litros que posee la piscina");
        int L_piscina1 = in.nextInt();
        System.out.println("Inque ahora cuantos litros posee nuestro bareeño");
        int L_barreno1 = in.nextInt();
        System.out.println("Indique cuantos litros pierde la piscina");
        int L_perdida1 = in.nextInt();
        System.out.println("Ahora indique los mismos datos de la piscina del vecino (teninedo en cuenta el orden de piscina-bareeño-perdida");
        int L_piscina2 = in.nextInt();
        int L_barreno2 = in.nextInt();
        int L_perdida2 = in.nextInt();
        if (L_barreno1<109 && L_barreno1>1 && L_piscina1<109 && L_piscina1>1 && L_piscina2<109 && L_piscina2>1 && L_barreno2<109 && L_barreno2>1){
        int veces_rellenar1 = L_piscina1/L_barreno1-L_perdida1;
        int veces_rellenar2 = L_piscina2/L_barreno2-L_perdida2;
        int resultado = 0;
        if (veces_rellenar1==veces_rellenar2){
            System.out.println(resultado);
        } else if (veces_rellenar1>veces_rellenar2) {
            System.out.println(resultado+1);
        }else{
            System.out.println(resultado-1);
        }
        }


    }
}
