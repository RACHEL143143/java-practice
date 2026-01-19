import java.util.Scanner;

public class Lzero {
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int dig=0;
    int tence=1;
    while(n>0){
        int a=n%10;
        if(a!=0){
            dig+=a*tence;
            tence*=10;
        }n/=10;
    }
    System.out.println(dig);
}
}
