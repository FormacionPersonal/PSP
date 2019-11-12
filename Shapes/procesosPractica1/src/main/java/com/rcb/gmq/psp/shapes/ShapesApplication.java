package com.rcb.gmq.psp.shapes;

public class ShapesApplication {

    public static void main(String ... args) {
        if (args.length == 0) {
            System.out.println("ERROR: debe indicar un valor entre 1 y 4");
            return;
        }
        Integer menuOption = Integer.valueOf(args[0]);
        if ( menuOption < 0 || menuOption > 4) {
            System.out.println("ERROR: debe estar entre 1 y 4");
            return;
        }
        Shapes shape = null;
        switch (menuOption) {
            case 1:
                shape = new Triangle(3,4);
                break;
            case 2:
                shape = new Circle(4);
                break;
            case 3:
                shape = new Rectangle(4,5);
                break;
            case 4:
                shape = new Square(7);
            default:
                System.out.println("ERROR: debe estar entre 1 y 4");
                break;
        }

        if (shape != null) {
            System.out.println("Área : "+shape.calculateArea());
            System.out.println("Perímetro : "+shape.calculatePerimeter());
        }
    }
}
