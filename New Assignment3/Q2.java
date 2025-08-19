import java.util.Scanner;
class Q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.print("UpperCase");
        }
        else{
            System.out.print(" Not UpperCase");

        }
    }
}