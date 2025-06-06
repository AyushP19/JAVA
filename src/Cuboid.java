public class Cuboid {
    int length, breadth,height;
    void setCuboid(int length,int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;

    }
    void getCuboid(){
        System.out.println("length: "+length);
        System.out.println("breadth: "+breadth);
        System.out.println("height: "+height);
    }
    int Volume(){
        int vol = length*breadth*height;
        return vol;
    }
    public static void main(String[] args){
        Cuboid c =new Cuboid();
        c.setCuboid(2,3,4);
        c.getCuboid();
       int a= c.Volume();
       System.out.println("volume of cuboid: "+a);
    }
}
