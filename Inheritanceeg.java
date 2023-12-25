import java.util.*;
import java.math.*;;

 abstract class Shape
{
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape
{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
 public double area()
 {
    double val = Math.PI*radius*radius;
    return val;
 }
 public double perimeter()
 {
    double per = 2*Math.PI*radius;
    return per;
 }
}
 class Rectangle extends Shape
{
    private double length,breath;
    public Rectangle(double length,double breath)
    {
        this.length=length;
        this.breath=breath;
    }
 public double area()
 {
    double recarea = length*breath ;
    return recarea;
 }
 public double perimeter()
 {
    double recper = 2*(length+breath);
    return recper;
 }

}

public class Inheritanceeg {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breath:");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        Rectangle r = new Rectangle(l,b);
        double are=r.area();
        double per=r.perimeter();
        System.out.println("Area of Rectangle:"+are+"\n"+"Perimeter of Rectangle:"+per);
        System.out.println("Enter the radius:");
        double radius=sc.nextDouble();
        Circle c = new Circle(radius);
        double care=c.area();
        double cper=c.perimeter();
        System.out.println("Area of Circle:"+care+"\n"+"Perimeter of Circle:"+cper);
    }
}
