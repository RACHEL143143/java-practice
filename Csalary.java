import java.util.Scanner;

public class Csalary {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int salary=sc.nextInt();
    int a=salary*20/100;
    int b=salary*10/100;
    System.out.println(salary+a+b);
    }
   
}
