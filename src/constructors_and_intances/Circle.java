package constructors_and_intances;

public class Circle {
    private double radius;
    
    //Default Constructor
    public Circle() {
    	this(0.0); // calls the parameterized constructor with a default radius 0
    }
    
    //Parameterized Constructor
    public Circle(double radius) {
    	this.radius = radius;
    }
    
    //Getter for radius
    public double getRadius() {
    	return radius;
    }
    
    //Method to calculate Area
    public double getArea() {
    	return Math.PI * radius * radius;
    }
    

    // Method to display circle info
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    // Main method to test
    public static void main(String[] args) {
        Circle c1 = new Circle();       // Uses default constructor
        Circle c2 = new Circle(5.5);    // Uses parameterized constructor

        System.out.println("Circle 1:");
        c1.display();

        System.out.println("\nCircle 2:");
        c2.display();
    }
}