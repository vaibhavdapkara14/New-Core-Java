import java.util.Scanner;
class Q12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value : ");
        int ch = sc.nextInt();

        if(ch>0){
            System.out.print("It's  a positive Number");
        }
        else if(ch==0){
            System.out.print(" It's not a Positive or Negative Number");

        }
       
        else{
            System.out.print(" It's not a Even Number");

        }
    }
}