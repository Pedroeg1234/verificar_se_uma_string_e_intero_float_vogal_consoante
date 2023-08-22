import java.util.Scanner;

public class is {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String frase= scanner.nextLine();

        System.out.println ("A string é composta somente por vogal: " + vogais(frase));
        System.out.println ("A string é composta somente por consoantes: " + consoantes(frase));
        System.out.println ("A string é composta por números inteiros: " + inteiro (frase));
        System.out.println ("A string é composta por um número real:" + real (frase));

    }

    public static boolean vogais (String frase){

        int vogais=0;
        
        for (int i=0;i<frase.length(); i++){
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || 
            frase.charAt(i) == 'O' || frase.charAt(i) == 'U' || 
            frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || 
            frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
            vogais++;
        }
        
    }
        if (vogais==frase.length()){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean consoantes (String frase){

        int consoantes=0;

        for (int i=0;i<frase.length();i++){

           char caracteratual= frase.charAt(i);
            if (frase.charAt(i) != 'A' &&
            frase.charAt(i) != 'E' &&
            frase.charAt(i) != 'I' &&
            frase.charAt(i) != 'O' &&
            frase.charAt(i) != 'U' &&
            frase.charAt(i) != 'a' &&
            frase.charAt(i) != 'e' &&
            frase.charAt(i) != 'i' &&
            frase.charAt(i) != 'o' &&
            frase.charAt(i) != 'u' &&
            !Character.isDigit(caracteratual)){
            consoantes++;
        }
        
            }
    

        if (consoantes== frase.length()){
            return true;
        }

        else {
            return false;
        }
    }

    public static boolean inteiro (String frase){

            if (frase.matches("-?\\d+")) {
                return true;
        }

        else {
            return false;
        }
    }

    public static boolean real (String frase){
        if (frase.matches("-?\\d+(\\.\\d+)?")){
            return true;
        }
        else {
            return false;
        }
    }

}