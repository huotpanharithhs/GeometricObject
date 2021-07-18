package Geometric;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        if (radius >= 0)
            return Math.PI * radius * radius;
        System.out.println("កាំត្រូវតែធំជាង ០");
        return 0;
    }
    public double getPerimeter() {
        if (radius >= 0)
            return 2 * Math.PI * radius;
        System.out.println("កាំត្រូវតែធំជាង ០");
        return 0;
    }
    public double getDiameter() {
        if (radius >= 0)
            return 2 * radius;
        System.out.println("កាំត្រូវតែធំជាង ០");
        return 0;
    }
    public void printCircle(){
        System.out.println("រង្វង់មានកាំ " + radius + "\nក្រឡាផ្ទៃ = "
        + getArea() + "\nបរិមាត្រ = " + getPerimeter() + "\nអង្កត់ផ្ចិត = " + getDiameter() + toString() );
    }
}
