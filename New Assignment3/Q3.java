import java.util.Scanner;
class Q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.print("LowerCase");
        }
        else{
            System.out.print(" Not LowerCase");

        }
    }
}