import java.util.Scanner;

class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number up to square you want");
        int n =sc.nextInt();
        for(int i=2;i<=2*n;i+=2){
            System.out.println(i);
        }
    }
}