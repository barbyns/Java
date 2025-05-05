public class Esercizio1 {

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String s, int n) {
        return s + n;
    }

    public static String[] inserisciInArray(String[] array, String nuova) {
        String[] nuovoArray = new String[6];
        for (int i = 0; i < 2; i++) {
            nuovoArray[i] = array[i];
        }
        nuovoArray[2] = nuova;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[2];
        nuovoArray[5] = array[3];
        return nuovoArray;
    }
}

