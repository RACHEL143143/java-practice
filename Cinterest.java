import java.util.Scanner;

public class Cinterest {
    
       public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int amount=sc.nextInt();
    int inter=sc.nextInt();
    int year=sc.nextInt();
    System.out.println(amount*inter*year/100);
       }
}
