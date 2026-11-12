import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Ano_2013 {
    public static void main(String[] args) {
        boolean dobe_cifra=false;
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el año del inicio de la serie.");
        int ano = input.nextInt();
        char valor =' ';
        char[] palabras=String.valueOf(ano).toCharArray();
        Arrays.sort(palabras);
        for (char palabra:palabras){
            if (palabra== valor){
                dobe_cifra=true;
                break;
            }
            valor=palabra;
        }
        if (dobe_cifra){
            boolean continua =true;
            List<Character> numeros = new ArrayList<>();
            do {
                numeros.clear();
                ano-=1;
                palabras=String.valueOf(ano).toCharArray();
                Arrays.sort(palabras);
                boolean doble= false;
                for (char palabra:palabras){
                    if (!(numeros.contains(palabra))){
                        numeros.add(palabra);
                    }else{
                        doble = true;
                    }
                }
                if (!doble){
                    continua=false;
                }
            }while (continua);
        }else{
            boolean continua =true;
            do {
                boolean continua2 =true;
                List<Character> numeros = new ArrayList<>();
                numeros.clear();
                ano-=1;
                palabras=String.valueOf(ano).toCharArray();
                Arrays.sort(palabras);
                boolean sin_dobles= true;
                for (char palabra:palabras){

                    if (!(numeros.contains(palabra))){
                        numeros.add(palabra);
                    }else{
                        sin_dobles = false;
                    }
                }
                if (!sin_dobles){
                    continua=false;
                }
            }while (continua);
        }
        System.out.println("La serie indicada por el año termina en el año: " + (ano+1));
    }
}