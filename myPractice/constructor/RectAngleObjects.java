package constructor;

import day31_Constructors.Rectangle;

import java.util.ArrayList;

public class RectAngleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10.0, 5.2);

        Rectangle rectangle2 = new Rectangle(5.5, 3.5);

        Rectangle rectangle3 = new Rectangle(5, 3);

        Rectangle rectangle4 = new Rectangle(8, 5);

        Rectangle rectangle5 = new Rectangle(10, 5);

        Rectangle[] rectangles = {rectangle1, rectangle2, rectangle3, rectangle4, rectangle5};

        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        for (Rectangle each : rectangles) {
            rectangleList.add(each);
        }
        System.out.println(rectangleList);

        System.out.println("--------------------------------------");

        ArrayList<Rectangle> widthLess5 = new ArrayList<>(rectangleList);
        widthLess5.removeIf(p->!(p.width<5));
        System.out.println(widthLess5);


    }
}
