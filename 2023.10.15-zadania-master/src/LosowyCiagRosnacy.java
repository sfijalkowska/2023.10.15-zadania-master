import java.util.Random;

public class LosowyCiagRosnacy {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random losowacz = new Random();
        /*tab[0] = losowacz.nextInt(0, 101);
        for(int i = 1; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(0, 101);
            while(tab[i] < tab[i-1]) {
                tab[i] = losowacz.nextInt(0, 101);
            }
            System.out.println(tab[i]);
        }*/

        tab[0] = losowacz.nextInt(0, 101);
        System.out.println(tab[0]);
        for(int i = 1; i < 10; i++) {
            tab[i] = losowacz.nextInt(101 - tab[i-1]) + tab[i - 1];
            System.out.println(tab[i]);
        }
    }
}
