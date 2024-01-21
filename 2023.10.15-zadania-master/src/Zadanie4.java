import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        /****** algorytm do generowanioa tablicy z losowymi liczbami *******/
        int[] naszaTablica = new int[100];
        Random losowacz = new Random();
        for (int i = 0; i < 100; i++) {
            naszaTablica[i] = losowacz.nextInt(0, 1001);
            System.out.print(naszaTablica[i] + " ");
        }

        /******* algorytm wyszukiwania największej liczby *******/
        int max = naszaTablica[0];
        for(int i = 1; i < 100; i++) {
            if(naszaTablica[i] > max) {
                max = naszaTablica[i];
            }
        }

        System.out.println();
        System.out.println(max);
    }
}
