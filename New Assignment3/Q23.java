import java.util.Scanner;

class Q23{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Money : ");
        int m  = sc.nextInt();

        if(m >= 1000){
            int note1000 = m/1000;
            System.out.println("1000 Notes : " + note1000);
            m = m%1000;
        }
        if(m >=500){
            int note500 = m/500;
            System.out.println("500 Notes : " + note500);
            m = m%500;

        }
        if(m >= 200){
            int note200 = m/200;
            System.out.println("200 Notes : " + note200);
            m = m%200;

        }
        if(m >= 100){
            int note100 = m/100;
            System.out.println("100 Notes : " + note100);
            m = m%100;

        }
        if(m >= 50){
            int note50 = m/50;
            System.out.println("50 Notes : " + note50);
            m = m%50;

        }
        if(m >= 20){
            int note20 = m/20;
            System.out.println("20 Notes : " + note20);
            m = m%20;

        }
        if(m >= 10){
            int note10 = m/10;
            System.out.println("10 Notes : " + note10);
            m = m%10;

        }
        if(m >= 5){
            int note5 = m/5;
            System.out.println("5 Notes : " + note5);
            m = m%5;

        }
        if(m >= 1){
            int note1 = m/1;
            System.out.println("1 Notes : " + note1);
            m = m%1;

        }
    }
}