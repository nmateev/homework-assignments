public class Main {
    public static void main(String[] args) {
        int a = 3;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + i + " ");
            if (i == 3) {
                break;
            }
        }
        System.out.println();
        int value = 0;
        for (; ; ) {
            System.out.println(value);
            value++;
            if (value == 5) {
                break;
            }
        }
        int counter = 0;
        for (char c = 'a'; c < 'z'; c++) {
            counter++;

        }
        System.out.println(counter);
    }
}
