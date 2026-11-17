import java.util.Arrays;
public class Burbuja {
    public static void main(String[] args) {
        int[] lista = {65,2,7,2,7,2,8,9,1};
        int[] lista_ordenada = Arrays.copyOf(lista,lista.length);
        Arrays.sort(lista_ordenada);
        while (! (Arrays.equals(lista_ordenada,lista))){
            for (int i = 0;i<lista.length-1;i++){
            if (lista[i]>lista[i+1]) {
                int numeroE = lista[i + 1];
                lista[i + 1] = lista[i];
                lista[i] = numeroE;
            }
        }
        }
        System.out.println(Arrays.toString(lista));
    }
}