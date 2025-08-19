import java.util.Scanner;
class Q17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A'  && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.print(ch + " is a Alphabet letter");
        }
         else if( ch >= '0' && ch <= '9'){
            System.out.print(ch + " is a digit");

         }
        else {
            System.out.print(ch + " is  a Special character");

        }
    }
}