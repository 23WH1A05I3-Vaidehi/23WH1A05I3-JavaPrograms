package JavaPrograms;

class Area {
    public int area(int side) {
        return side * side;
    }

    public int area(int length, int width) {
        return length * width;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Area_overload {
    public static void main(String[] args) {
        Area a = new Area();

        System.out.println("Area of square: " + a.area(5));
        System.out.println("Area of rectangle: " + a.area(5, 10));
        System.out.println("Area of circle: " + a.area(7.0));
    }
}
