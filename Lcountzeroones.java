import java.util.Scanner;

public class Lcountzeroones {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int zero=0,one=0;
    while(n>0){
        int a=n%10;
    if(a==1){
      one++;
    }else{
        zero++;
    }n/=10;
    }
    System.out.println("ones:"+one);
        System.out.println("zero:"+zero);
    
}
}
