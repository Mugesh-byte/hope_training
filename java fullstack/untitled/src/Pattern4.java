import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=1;j<=a-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}