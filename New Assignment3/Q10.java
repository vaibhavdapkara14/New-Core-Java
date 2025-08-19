import java.util.Scanner;

class Q10{
    void equal(int a1 ,int b1){
        if(a1 == b1){
            System.out.print("Both number are same");
        }
         
    }
    void greater(int a1, int b1){
      int n = a1>b1?a1:b1; 
      System.out.print("Greater number is : " + n);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value : ");
        int a = sc.nextInt();

        System.out.print("Enter Second value : ");
        int b = sc.nextInt();

        Q10 obj = new Q10();
        obj.equal(a,b);
        obj.greater(a,b);
    }    
}