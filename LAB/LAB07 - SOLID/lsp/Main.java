package lsp;
public class Main {
    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) { //Change Object Rectangle
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Square reg2 = new Square(5); // set to side of square

        reg2.setSide(20); // set to new side of square
        System.out.println("====   Square  ====");
        System.out.println("Area is (20x20) = ");
        System.out.println("Area = " + reg2.getArea());
    }
}
