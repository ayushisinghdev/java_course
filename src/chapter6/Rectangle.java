package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength( double l){
        this.length = l;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w){
        this.width = w;
    }

    public double calculatePerimeter(){
        return (2* length) + (2* width);
    }

    public double calculateArea(){
        return length*width;
    }

}
