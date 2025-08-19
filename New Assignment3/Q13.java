import java.util.Scanner;
class Q13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value : ");
        int ch = sc.nextInt();

        if(ch%75==0){
            System.out.print(ch + " is a divisible by 75");
        }
       
        else{
            System.out.print(ch + " is not  divisible by 75");

        }
    }
}