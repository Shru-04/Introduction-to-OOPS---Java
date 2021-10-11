package  com.company;

import java.util.Scanner;

class Circle{
    double radius;
    String color;
    Circle(){
        this.radius = 0;
        this.color = "Not defined";
    }
    Circle(double radius)
    {
        this.radius = radius;
    }
    Circle (double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }
    double getRadius(){ return radius;}
    double getArea(){   return (Math.PI*radius*radius); }
}

class Cylinder extends Circle{
    double height;
    Cylinder(){
        super();
        this.height = 0;
    }
    Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }
    double getHeight(){    return height;   }
    double getArea(){   return ((2*Math.PI*super.radius)*(super.radius + height));      }
    double getVolume(){     return (Math.PI * super.radius * super.radius * height);    }
    public boolean equals(Cylinder c){
        if (c.getArea() == this.getArea() && c.getVolume() == this.getVolume() && c.color.equals(this.color))
            return true;
        return false;
    }
}

public class Prog3 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        boolean res;
        System.out.println("Enter the height, radius and Colour of 1st Cylinder :-");
        Cylinder c1 = new Cylinder(ob.nextDouble(),ob.nextDouble(),ob.next());
        System.out.println("Enter the height, radius and Colour of 2nd Cylinder :-");
        Cylinder c2 = new Cylinder(ob.nextDouble(),ob.nextDouble(),ob.next());
        res = c1.equals(c2);
        System.out.println("\n\nArea of 1st Cylinder = "+c1.getArea());
        System.out.println("Volume of 1st Cylinder = "+c1.getVolume());
        System.out.println("\nArea of 2nd Cylinder = "+c2.getArea());
        System.out.println("Volume of 2nd Cylinder = "+c2.getVolume());
        if (res == true)
            System.out.println("\nBoth the Cylinders are similar !!");
        else
            System.out.println("\nThe Cylinders are not similar !!");
    }
}