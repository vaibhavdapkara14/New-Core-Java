import java.util.Scanner;
class Q8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
            char Upper = Character.toUpperCase(ch);
            System.out.println(Upper);

        }
        else{
            System.out.print(" Not LowerCase");

        }
    }
}