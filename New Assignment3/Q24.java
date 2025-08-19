import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        int digit1 = num / 100;        
        int digit2 = (num / 10) % 10;  
        int digit3 = num % 10;         

        int sum = digit1 + digit2 + digit3;

        System.out.println("Sum of digits: " + sum);
    }
}

// 340/100 = 3
// 340/10 => 34%10 => 4
// 340%10 => 0

