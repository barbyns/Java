import java.util.Scanner;

public class Esercizio2 { public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Inserisci una stringa, Hello");
    String a = scanner.next();
    System.out.println("Inserisci un'altra stringa, Hiu");
    String b = scanner.next();
    System.out.println("Inserisci un'altra stringa ancora, Maddonna");
    String c = scanner.next();
    String TreStringhe= concat(a,b,c);
    System.out.println(TreStringhe);
}
public static String concat (String a, String b, String c){
    return a+b+c;
}
}
