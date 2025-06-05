public class Box {
        int length , breadth, height;
         void setDimension(int length,int breadth,int height){
            this.length = length;
           this.breadth=breadth;
            this.height=height;
        }
         void showDimension(){
            System.out.println("length: "+length);
            System.out.println("breadth: "+breadth);
            System.out.println("height: "+height);
        }
    public static void main(String[] args){
    Box b1=new Box();
    b1.setDimension(2,3,4);
    b1.showDimension();
    }
}
