class hello {
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

}

class Box {
    public static void main(String[] args){
        hello b1=new hello();
        b1.setDimension(2,3,4);
        b1.showDimension();
    }
}