
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length and breadth of Rectangle:" );
        float length = input.nextFloat();
        float breadth= input.nextFloat();
        Rectangle rect= new Rectangle(length, breadth);

        System.out.print("Enter the base and height of Triangle:" );
        float base = input.nextFloat();
        float height= input.nextFloat();
        Triangle tri = new Triangle(base,height);

        System.out.print("Enter the radius of circle:");
        float radius = input.nextFloat();
        Circle cir= new Circle(radius);

        rect.printArea();
        tri.printArea();
        cir.printArea();
    }
}

abstract class Shape{
        float a,b;
        abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(float x, float y){
        a=x;b=y;}
    void printArea(){
        System.out.println("Ärea of rectangle is:"+ a*b);
    }
}
class Triangle extends Shape{
    Triangle(float x, float y){
        a=x;b=y;}
    void printArea(){
        System.out.println("Ärea of Triangle is:"+ 0.5*a*b);
    }
}
class Circle extends Shape{
    Circle(float r){
        a=r;}
    void printArea(){
        System.out.println("Ärea of Circle is:"+ 3.14*a*a );
    }
}
