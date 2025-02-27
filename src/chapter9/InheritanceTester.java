package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {

        Mother mother = new Mother();
        mother.setName("Veena");

        System.out.println(mother.getName() + mother.getGender());

        //Person person = new Person();
        Employee employee = new Employee();
        //person.getAge();
        //employee.getAge();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print();
        square.print("Ayushi");

        testSquareOverride();

    }

        public static void testSquareOverride(){
            Rectangle rectangle = new Rectangle();
            rectangle.setLength(4);
            rectangle.setWidth(8);
            System.out.println(rectangle.calculatePerimeter());

            Square square = new Square();
            square.setLength(4);
            square.setWidth(8);
            System.out.println(square.calculatePerimeter());

    }
}
