import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        int sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int copy=num1;
        for (; num1 != 0; ) {
            temp = num1 % 10;
            sum = sum * 10 + temp;
            num1 = num1 / 10;
        }
        if(sum==copy){
            System.out.println("pallindrome number");
        }
        else {
            System.out.println("not pallindrome");
        }

    }

}