import java.util.Scanner;
class Q4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.print("It's  a alphabet");
        }
        else{
            System.out.print(" It's not a alphabet");

        }
    }
}