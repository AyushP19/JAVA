import java.util.Scanner;

class cubeBtnTwo{
    public static void main(String[] args) {
       int sum=0;
        Scanner sc = new Scanner(System.in);
         System.out.println("enter first number");
        int first = sc.nextInt();
         System.out.println("enter second number");
        int second = sc.nextInt();
        for(int i=first;i<=second;i++){
            sum = sum + (i*i*i);
        }

         System.out.println("sum of cube"+sum);

        
    }
}