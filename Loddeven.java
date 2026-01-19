import java.util.Scanner;

public class Loddeven {
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int even=0,odd=0,count=0;
    while(n>0){
        int a=n%10;
        count++;
        if(a%2==0){
            even++;
        }else{
            odd++;
        }n/=10;
        }
        if(even==count){
            System.out.println("even");
        }else if(odd==count){
            System.out.println("odd");
        }else{
            System.out.println("mixed");
        }
    }
}
