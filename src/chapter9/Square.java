package chapter9;

public class Square extends Rectangle{

    @Override
    public double calculatePerimeter(){
        return length*sides;
    }

    public void print(String what){
        System.out.println("I am Square");
    }
}
