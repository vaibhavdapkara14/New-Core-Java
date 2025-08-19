import java.util.Scanner;
class Q9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit : ");
        int ch = sc.nextInt();

        if( ch >= 0 && ch <= 9){
            System.out.println("It's  a digit");
            System.out.println("Replace by : * ");
        }
        else{
            System.out.print(" It's not a digit");

        }
    }
}