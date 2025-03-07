import java.util.Scanner;

class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number uto square you want");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i*i);
        }
    }
}