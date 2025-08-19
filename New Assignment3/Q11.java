import java.util.Scanner;
class Q11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value : ");
        int ch = sc.nextInt();

        if(ch%2==0){
            System.out.print("It's  a Even Number");
        }
       
        else{
            System.out.print(" It's not a Even Number");

        }
    }
}