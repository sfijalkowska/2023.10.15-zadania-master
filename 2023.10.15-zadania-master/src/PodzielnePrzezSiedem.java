import java.util.Random;

public class PodzielnePrzezSiedem {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();
        /*for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(0, 101);
            while (tab[i] % 7 != 0) {
                tab[i] = random.nextInt(0, 101);
            }
            System.out.println(tab[i]);
        }*/

        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(0, 15) * 7;
            System.out.println(tab[i]);
        }

        /*int i = 0;
        while(i < tab.length) {
            tab[i] = random.nextInt(0, 101);
            if(tab[i] % 7 != 0) {
                continue;
            }
            System.out.println(tab[i]);
            i++;
        }*/
    }
}
