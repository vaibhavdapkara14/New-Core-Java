import java.util.Scanner;

class Q38 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Math marks : ");
        int Math = sc.nextInt();

        System.out.print("Enter Science marks : ");
        int Science = sc.nextInt();

        System.out.print("Enter Bio marks : ");
        int Bio = sc.nextInt();

        int Average = (Math + Science + Bio) / 3;

        if (Math >= 75 && Science >= 75 && Bio >= 75) {
            if (Average > 80) {
                System.out.println("Your Total Marks : " + (Math + Science + Bio));
                System.out.println("Your Percentage : " + Average);
                System.out.println("Pass");
            } else {
                System.out.println("Fail (Average not greater than 80)");
            }
        } else {
            System.out.println("Fail (Any subject less than 75)");
        }
    }
}