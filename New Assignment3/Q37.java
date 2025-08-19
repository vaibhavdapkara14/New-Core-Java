import java.util.Scanner;

class Q37{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current Month unit : ");
        int Cunit = sc.nextInt();

         System.out.print("Enter Last Month unit : ");
        int Lunit = sc.nextInt();
        int Bill = 0;
       int unit = Cunit - Lunit;

        if(unit > 0 && unit <= 100){
            Bill = unit * 2;
            System.out.println("Unit : " + unit);
            System.out.println("Bill : " + Bill);

        }
        
        else if(unit > 100 && unit <= 200){
            Bill = 200 + (unit%100) * 3;
            System.out.println("Unit : " + unit);
            System.out.println("Bill : " + Bill);

        }
        
        else if(unit > 200 && unit <= 300){
            Bill = 200 +  300 + (unit%200) * 4;
            System.out.println("Unit : " + unit);
            System.out.println("Bill : " + Bill);

        }
        
        else if(unit > 300 ){
            int Total = (unit-300)*5;
            Bill = 200 + 300 + 400 + Total;
            System.out.println("Unit : " + unit);
            System.out.println("Bill : " + Bill);

        }

    }
}