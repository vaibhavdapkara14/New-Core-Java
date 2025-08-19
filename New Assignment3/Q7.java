import java.util.Scanner;
class Q7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UpperCase");
            char lower = Character.toLowerCase(ch);
            System.out.println(lower);

        }
        else{
            System.out.print(" Not UpperCase");

        }
    }
}