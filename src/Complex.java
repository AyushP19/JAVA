import java.util.Scanner;
class Complex {

        int real , imag;
        void setComplex(int real,int imag){
            this.real=real;
            this.imag=imag;
        }
        void showComplex(){
            System.out.println("complex number: "+real+"+"+imag+"i");
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int r= sc.nextInt();
            int i= sc.nextInt();
            Complex c1= new Complex();
            c1.setComplex(r,i);
            c1.showComplex();
        }




}
