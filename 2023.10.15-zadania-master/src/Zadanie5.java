public class Zadanie5 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for(int i = 0; i < 100; i++) {
            tab[i] = i + 1;
        }

        for(int element : tab) {
            System.out.print(element);
            if(element % 3 == 0) {
                System.out.print(" Fizz");
            }
            if(element % 5 == 0) {
                System.out.print(" Buzz");
            }
            System.out.println();
        }
    }
}
