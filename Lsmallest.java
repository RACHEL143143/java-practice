import java.util.Scanner;

public class Lsmallest {
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=n%10;
    while(n>0){
        int b =n%10;
        if(a>b){
          a=b;
        }n/=10;
    }
         System.out.println("low:"+a);
    
   
}
}