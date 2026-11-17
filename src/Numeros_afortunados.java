import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Numeros_afortunados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el numero del que desea sacar los numeros afortunados: ");
        int numero = input.nextInt();
        List<Integer> numeros = new ArrayList<>();
        if (numero<2){
            System.out.println("El numero indicado NO es valido, porfavor, indique un numero mayor a 1");
        }else {
            for (int numeroa = 1; numeroa <= numero; numeroa++) {
                numeros.add(numeroa);
            }
            int saltos=1;
            do {
                numeros.removeFirst();
                int salavamos=0;
                for (int i=0;i<numeros.size();i++){
                    if (salavamos==saltos){
                        numeros.remove(i);
                        salavamos=0;
                        i--;
                    }else{
                        salavamos++;
                    }
            } saltos++;
            }while (saltos<numeros.size());
            System.out.println(numeros);
        }
    }
}