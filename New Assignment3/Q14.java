import java.util.Scanner;
class Q14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value : ");
        int a = sc.nextInt();
        System.out.print("Enter Second value : ");
        int b = sc.nextInt();

        if(a%b==0){
            System.out.print(a+ " is a divisible by " + b);
        }
       
        else{
            System.out.print(a + " is not  divisible by " + b);

        }
    }
}