import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        /*Random losowacz = new Random();
        int losowaLiczba = losowacz.nextInt(0, 101);
        System.out.println(losowaLiczba);*/

        /****** algorytm do generowanioa tablicy z losowymi liczbami *******/
        int[] naszaTablica = new int[100];
        Random losowacz = new Random();
        for (int i = 0; i < 100; i++) {
            naszaTablica[i] = losowacz.nextInt(0, 101);
            System.out.println(naszaTablica[i]);
        }

        /******* liczenie średniej ******/
        int suma = 0;
        for(int liczba : naszaTablica) {
            suma += liczba;
            //suma = suma + liczba;
        }

        double srednia = suma/100.0;
        System.out.println("Sredina: " + srednia);
    }
}
