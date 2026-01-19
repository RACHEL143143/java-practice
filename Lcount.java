import java.util.Scanner;

public class Lcount {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] count=new int[10];
   while(n>0){
    int a=n%10;
    count[a]++;
    n/=10;
   }
   for(int i=0;i<10;i++){
      if(count[i]>0){
        System.out.println("digit:"+i+"count"+count[i]);
      }
   }
}
}
