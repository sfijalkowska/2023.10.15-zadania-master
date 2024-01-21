import java.util.Random;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[] tab = new int[10];
        //int[] tab = {66, 75, 44, 56, 38, 56, 10, 93, 87, 93};
        Random random = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(0, 101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();


        int[] countTab = new int[101];
        for(int element : tab) {
            countTab[element]++;
        }

        int index = 0;
        for(int i = 0; i < countTab.length; i++) {
            for(int j = 0; j < countTab[i]; j++) {
                tab[index] = i;
                System.out.print(tab[index] + " ");
                index++;
            }
        }
    }
}
