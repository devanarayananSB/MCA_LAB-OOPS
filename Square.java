public class Square {
    double side;
    void getData(double a)
    {
        side=a;
    }
    double calArea()
    {
        return side*side;
    }
    public static void main(String[] args) 
    {
     Square s=new Square();
     s.getData(8);
     System.out.println("Area of Rectangle= "+s.calArea());   
    }
}
