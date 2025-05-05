public class Main {
    public static void main(String[] args) {
        // moltiplica
        int prodotto = Esercizio1.moltiplica(10, 5);
        System.out.println("Prodotto: " + prodotto);

        // concatena
        String frase = Esercizio1.concatena("Il risultato è: ", prodotto);
        System.out.println("Stringa concatenata: " + frase);

        // inserisciInArray
        String[] originali = {"a", "b", "c", "d", "e"};
        String[] nuovo = Esercizio1.inserisciInArray(originali, "Nuovo");

        System.out.println("Nuovo array:");
        for (String s : nuovo) {
            System.out.println(s);
        }
    }
}
