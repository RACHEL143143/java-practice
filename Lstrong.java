import java.util.Scanner;

public class Lstrong {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=n;
    int fact=1;
    while(n>0){
        int a=n%10;
        for(int i=1;i<=a;i++){
             fact*=i;
        }n/=10;
    }
     if(num==fact){
      System.out.println("strong");
     }else{
        System.out.println("not");
     }
    }
}
