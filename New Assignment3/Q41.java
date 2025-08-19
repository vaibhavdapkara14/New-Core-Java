import java.util.Scanner;

class Q41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three digit value : ");
        int num = sc.nextInt();
    
       int digit=0;
       int t = num;

while(t>0){
          int i = t%10;
          digit = digit + (i*i*i);
          t = t/10;
        }
        System.out.print(digit);

        if(num == digit){
            System.out.print(num + " is Armstrong");
        }
        else{
            System.out.print(num + " is  not Armstrong");

        }

    }
}