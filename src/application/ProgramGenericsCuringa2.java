package application;

import entities.CircleCuringa;
import entities.RectangleCuringa;
import entities.ShapeCuringas;

import java.util.ArrayList;
import java.util.List;

public class ProgramGenericsCuringa2 {

    public static void main(String[] args) {

        List<ShapeCuringas> myShapes = new ArrayList<>();
        myShapes.add(new RectangleCuringa(3.0, 2.0));
        myShapes.add(new CircleCuringa(2.0));

        List<CircleCuringa> myCircles = new ArrayList<>();
        myCircles.add(new CircleCuringa(2.0));
        myCircles.add(new CircleCuringa(3.0));

        System.out.println("Total area: " + totalArea(myShapes));

    }

    public static double totalArea(List<? extends ShapeCuringas> list) {
        double sum = 0.0;
        for (ShapeCuringas shape : list) {
            sum += shape.area();
        }
        return sum;
    }
}
