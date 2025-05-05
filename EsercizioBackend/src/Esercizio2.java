import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa:");
        String a = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String b = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String c = scanner.nextLine();

        String treStringhe = concat(a, b, c);
        System.out.println("Stringa concatenata: " + treStringhe);
    }

    public static String concat(String a, String b, String c) {
        return a + b + c;
    }
}
