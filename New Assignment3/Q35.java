import java.util.Scanner;

class Q35{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a four digit number: ");
int n = sc.nextInt();

int sum = 0;
int AgainSum = 0;
for(int i=1; i<=4; i++){
  int t = n%10;
    sum += t;
    n = n/10; 
     
     
}
  


if(sum > 9){
    while(sum>0){
        int p = sum%10;
        AgainSum += p;
        sum = sum/10;
    }
System.out.println("Sum is : " + AgainSum);

}
else{
System.out.println("Sum is : " + sum);

}



}

}