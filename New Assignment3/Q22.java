// import java.util.Scanner;

// class Q22{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         double Compactprice = 456.56;
//         double Compactoff = 456.56 * 0.07;
//         double FullSizeprice = 460.50; 
//         double FullSizeoff = 460.50 * 0.07;

//         System.out.print("You Want Renting Car (Y/N) : ");
//         char ch = sc.next().charAt(0);

//         if(ch == 'Y' || ch == 'y'){

//         System.out.print("Which Type Car You Want (Compact / FullSize): ");
//         String Cartype = sc.nextLine();

//              if(Cartype == "Compact"){
//             System.out.println("You select Compact Car  ");

//             System.out.print("You have a Coupon code (Y/N) : ");
//             char coupan = sc.next().charAt(0);

//                  if( coupan == 'Y' || coupan == 'y'){
//                 System.out.print("After Applied Code Your Compact rented car price is :" + Compactoff);
//                  }
//                  else{
//                 System.out.print("Your Compact rented car price is :" + Compactprice);
//                  }


//             }
//             else if(Cartype == "FullSize"){
//             System.out.print("You select FullSize Car  ");

//             System.out.print("You have a Coupon code (Y/N) : ");
//             char coupan = sc.next().charAt(0);

//               if( coupan == 'Y' || coupan == 'y'){
//                 System.out.print("After Applied Code Your FullSize rented car price is :" + FullSizeoff);
//                  }
//                  else{
//                 System.out.print("Your FullSize rented car price is :" + FullSizeoff);
//                  }

//             }
//             else{
//             System.out.print("This car is not Avaiable");
//             }
          
//         }
//         else{
//             System.out.print("OK Thankyou Sir");
//         }
//     }
// }

import java.util.Scanner;

class Q22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double Compactprice = 456.56;
        double Compactoff = Compactprice - (Compactprice * 0.07);
        double FullSizeprice = 460.50;
        double FullSizeoff = FullSizeprice - (FullSizeprice * 0.07);

        System.out.print("Do you want to rent a car? (Y/N): ");
        char ch = sc.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            System.out.print("Which type of car do you want (C for Compact / F for FullSize): ");
            char carType = sc.next().charAt(0);

            if (carType == 'C' || carType == 'c') {
                System.out.println("You selected Compact Car");
                System.out.print("Do you have a coupon code? (Y/N): ");
                char coupon = sc.next().charAt(0);
                if (coupon == 'Y' || coupon == 'y') {
                    System.out.println("Price after discount: $" + Compactoff);
                } else {
                    System.out.println("Price: $" + Compactprice);
                }

            } else if (carType == 'F' || carType == 'f') {
                System.out.println("You selected FullSize Car");
                System.out.print("Do you have a coupon code? (Y/N): ");
                char coupon = sc.next().charAt(0);
                if (coupon == 'Y' || coupon == 'y') {
                    System.out.println("Price after discount: $" + FullSizeoff);
                } else {
                    System.out.println("Price: $" + FullSizeprice);
                }

            } else {
                System.out.println("This car type is not available.");
            }
        } else {
            System.out.println("OK, thank you.");
        }
    }
}
