import java.util.Scanner;

class Q30{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Five digit value : ");
        int num = sc.nextInt();

        int digit=0;

        while(num > 0){
         int t = num%10;
         digit = digit * 10 + t;
         num = num/10;
        }
        System.out.println("Reversed number is : " + digit);
    }
}