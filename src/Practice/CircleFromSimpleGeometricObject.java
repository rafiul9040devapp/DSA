package Practice;

public class CircleFromSimpleGeometricObject
        extends SimpleGeometricObject {

    private double radius;

    public CircleFromSimpleGeometricObject() {
    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * Math.sqrt(getRadius());
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI *getRadius();
        return perimeter;
    }

    public double getDiameter(){
        double diameter = 2 * getRadius();
        return diameter;
    }

    public void PrintCircle(){
        System.out.println("The circle is created "+ getDateCreated() + " and the radius is "+ radius);
    }
}
