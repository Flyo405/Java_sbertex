package circle;

class main{
    public static void main(String[] args) {
        circle circle = new circle(6, "red");
        System.out.println(circle.toString());
    }
}

public class circle {
    private int radius;
    private String color;

    public circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle {" +
                "radius: " + radius +
                " color: " + color +
                " area: " + area() +
                ", perimeter: " + perimeter() +
                '}';
    }
}

