import java.util.Scanner;
class Q19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        if(ch == 'i'|| ch == 'I'){
           System.out.print("Enter your age : ");
           int age = sc.nextInt();

           if(age>=18){
            System.out.print("You are Eligible for Voting");
           }
            else{
            System.out.print("You are not Eligible for Voting");
            

        }

        }
        else{
            System.out.print("You are not Eligible for Voting");
            

        }
    }
}
