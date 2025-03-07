import java.util.Scanner;

class q1{
    public static void main(String [] args){
        System.out.println("enter number upto natural number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}