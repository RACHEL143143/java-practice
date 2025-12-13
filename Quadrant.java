import java.util.Scanner;

public class Quadrant {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       if(a>0 &&b>0){
        System.out.println("quadrant 1");
       }else if(a<0 && b>0){
        System.out.println("quadrant2");
       }else if(a<0&&b<0){
        System.out.println("quadrant 3");
       }else{
        System.out.println("quadrant 4");
       }
}
}
