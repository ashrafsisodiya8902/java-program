public class whilesumeven {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even number: ");
    }
}