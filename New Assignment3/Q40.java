import java.util.Scanner;

class Q40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Six digit value : ");
        int num = sc.nextInt();
    
       int digit=0;
       int t = num;

        while(t>0){
          int temp = t%10;
          digit = digit * 10 + temp;
          t = t/10;
        }

        if(num == digit){
            System.out.print(num + " is palindrome");
        }
        else{
            System.out.print(num + " is  not palindrome");

        }

    }
}