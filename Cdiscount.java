import java.util.Scanner;

public class Cdiscount {
       public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double discount=sc.nextDouble();
    double damount=n*discount/100;
    System.out.println(n-damount);

    }
}
