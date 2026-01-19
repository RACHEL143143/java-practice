import java.util.Scanner;

public class Lfirstoddeven {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=n/100;
    if(a%2==0){
        System.out.println("even");
    }else{
        System.out.println("odd");
    }
}
}
