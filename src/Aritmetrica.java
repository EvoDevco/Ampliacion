import java.util.*;

public class Aritmetrica {
    //Dios me salve porque esto parece muuuuy complejo//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        List<String> numeros = new ArrayList<>();
        frase = frase.replaceAll(" ","");
        for (int i=0;i<frase.length();i++){
            numeros.add(String.valueOf(frase.charAt(i)));
        }
        for (int posicion = 0; posicion<numeros.size();posicion++) {
            int operacion = 0;
            if (Objects.equals(numeros.get(posicion), "*") || Objects.equals(numeros.get(posicion), "/") || Objects.equals(numeros.get(posicion), "+") || Objects.equals(numeros.get(posicion), "-")){
                switch (numeros.get(posicion)){
                    case "*" :
                        operacion= Integer.parseInt(numeros.get(posicion-2))*Integer.parseInt(numeros.get(posicion-1));
                        numeros.set(posicion,String.valueOf(operacion));
                        numeros.subList((posicion-2),posicion).clear();
                        posicion=-1;
                        break;
                    case "/":
                        operacion= Integer.parseInt(numeros.get(posicion-2))/Integer.parseInt(numeros.get(posicion-1));
                        numeros.set(posicion,String.valueOf(operacion));
                        numeros.subList((posicion-2),posicion).clear();
                        posicion=-1;
                        break;
                    case "+":
                        operacion= Integer.parseInt(numeros.get(posicion-2))+Integer.parseInt(numeros.get(posicion-1));
                        numeros.set(posicion,String.valueOf(operacion));
                        numeros.subList((posicion-2),posicion).clear();
                        posicion=-1;
                        break;
                    case "-":
                        operacion= Integer.parseInt(numeros.get(posicion-2))-Integer.parseInt(numeros.get(posicion-1));
                        numeros.set(posicion,String.valueOf(operacion));
                        numeros.subList((posicion-2),posicion).clear();
                        posicion=-1;
                        break;
                }
            }
        }
        System.out.println(numeros.get(0));
    }
}