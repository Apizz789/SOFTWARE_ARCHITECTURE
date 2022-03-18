package com.solid.lsp;


public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) { //Change Object Rectangle
       GeometryRectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        GeometryRectangle reg2 = new Square(5);

        reg2.setSide(20); // set to new side of square
        reg2.setWidth(width);
        reg2.setHeight(height);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg2.getArea());
    }
}
