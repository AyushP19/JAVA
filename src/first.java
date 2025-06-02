import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        int i,temp,sum=0;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
//        int num2= sc.nextInt();
        for(;num1!=0;)
        {
            temp =num1%10;
            sum=sum*10+temp;
            num1=num1/10;
        }
        System.out.println(sum);
    }
}
