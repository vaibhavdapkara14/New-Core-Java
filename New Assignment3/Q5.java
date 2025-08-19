import java.util.Scanner;
class Q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit : ");
        int ch = sc.nextInt();

        if( ch >= 0 && ch <= 9){
            System.out.print("It's  a digit");
        }
        else{
            System.out.print(" It's not a digit");

        }
    }
}