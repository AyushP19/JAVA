
import java.util.Scanner;

class sumOfTable{
    public static void main(String[] args) {
        int sum=0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table:");
        int tab =sc.nextInt();
        for(int i=1;i<=10;i++){
          sum = tab*i+sum;

        }
        System.out.println("sumOfTable:"+sum);
    }
}