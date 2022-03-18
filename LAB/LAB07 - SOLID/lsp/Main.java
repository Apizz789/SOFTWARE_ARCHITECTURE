// package com.solid.lsp;


public class Main {

    private static final int width = 2;
    private static final int height = 10;

    public static void main(String[] args) { //Change Object Rectangle
       Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Square reg2 = new Square(4000);

        reg2.setSide(20); // set to new side of square
        System.out.println("====   Square  ====");
        System.out.println("Area = " + reg2.getArea());
    }
}