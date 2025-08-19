import java.util.Scanner;

class Q20{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);


System.out.print("Enter Science Marks: ");
int Science = sc.nextInt();
System.out.print("Enter Maths Marks: ");
int Maths = sc.nextInt();
System.out.print("Enter Hindi Marks: ");
int Hindi = sc.nextInt();
System.out.print("Enter Bio Marks: ");
int Bio = sc.nextInt();
System.out.print("Enter English Marks: ");
int English = sc.nextInt();


int Obtain = (Science + Maths + Hindi + Bio + English);

double percentage = ( Obtain/5);

System.out.println("Your Percentage is : " + percentage);



if(percenatge >= 75 && percenatge <= 100){
    System.out.print("Grade A");
}

else if(percenatge >= 60 && percenatge < 75 ){
    System.out.print("Grade B");
}

else if(percenatge >= 50 && percenatge < 60 ){
    System.out.print("Grade D");
}  


else if(percenatge >= 33 && percenatge < 50 ){
    System.out.print("Grade D");
}  

else{
    System.out.print("Fail");

}
  } 
}