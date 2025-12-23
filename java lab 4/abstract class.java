import java.util.Scanner;

abstract class Shape {
    int dimension1;
    int dimension2;
    abstract public void printArea();
    
}
class Rectangle extends Shape{
    Rectangle(int length,int breadth){
        dimension1=length;
        dimension2=breadth;
    }
    public void printArea(){
        int area=dimension1*dimension2;
        System.out.println("Area of Rectangle: "+area);
    }
}
class Triangle extends Shape{
    Triangle(int base,int height){
        dimension1=base;
        dimension2=height;
    }
    public void printArea(){
        double area=0.5*dimension1*dimension2;
        System.out.println("Area of Triangle: "+area);
    }
}

class Circle extends Shape{
    Circle(int radius){
        dimension1=radius;
    }
    public void printArea(){
        double area=3.14*dimension1*dimension1;
        System.out.println("Area of Circle: "+area);
    }
}

class ShapeDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenthg and breadth of a rectangle: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Shape rectangle=new Rectangle(x,y);
        rectangle.printArea();
        System.out.println("Enter the base and height of a triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Shape triangle=new Triangle(a,b);
        triangle.printArea();
        System.out.println("Enter the radius of a circle: ");
        int r=sc.nextInt();
        Shape circle=new Circle(r);
        circle.printArea();
    }
}