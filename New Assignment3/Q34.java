import java.util.*;

class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even : " + even);
        System.out.println("Odd  : " + odd);
    }
}
