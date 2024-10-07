package javaPrograms2;

class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
       
    }
    public double getLength() {
        return length;
        }

    public void setWidth(double width) {
        this.width = width;
        }
    public double getWidth() {
        return width;
       
    }
}

public class Rec {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5.0);
        r.setWidth(3.0);

        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
    }
}
