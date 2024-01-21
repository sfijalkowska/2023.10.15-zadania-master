import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] tab = new int[10];
        //int[] tab = {66, 75, 44, 56, 38, 56, 10, 93, 87, 93};
        Random random = new Random();
        for(int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(0, 101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        int iloscPorownan = 0;
        boolean zamiana = true;
        int maxIndex = 9;
        while(zamiana) {
            zamiana = false;
            for(int i = 0; i < maxIndex; i++) {
                iloscPorownan++;
                if(tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    zamiana = true;
                }
            }
            maxIndex--;
        }

        for(int element : tab) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("Ilosc porownan: " + iloscPorownan);
    }
}
