import java.util.Scanner;

class Q42{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 4 digits): ");
        int num = sc.nextInt();

        if(num >= 1 && num <= 9999){
            int rounded =  Math.round(num / 10.0) * 10;
            System.out.println("Rounded Number: " + rounded);
        } else {
            System.out.println("Please enter a number between 1 and 9999.");
        }
    }
}
