package entities;

import java.util.Arrays;

public  class TesteTomas {

    public static String intersecction(double x0, double y0, double r0, double x1, double y1, double r1) {


        double[] ArrayR = new double[6];


        double x2 = 0.0;
        double y2 = 0.0;
        double x3 = 0.0;
        double y3 = 0.0;
        double x4 = 0.0;
        double y4 = 0.0;

        double d;
        // circle 1:(x0,y0),radius r0
        // circle 2:(x1,y1),radius r1

        d = Math.sqrt(Math.pow(x1 - x0, (2)) + Math.pow(y1 - y0, (2)));

        // non intersecting
        if (d > r0 + r1) {
            System.out.println("non intersecting");

        }
        //One circle within other
        if (d < Math.abs(r0 - r1)) {
            System.out.println("One circle within other");

        }

        //coincident circles
        if (d == 0 && r0 == r1) {
            System.out.println("coincident circles");

        } else {


            double a = Math.pow(r0, (2)) - Math.pow(r1, (2) + Math.pow(d, (2)) / (2 * d));
            double h = Math.sqrt(Math.pow(r0, (2)) - Math.pow(a, (2)));

            x2 = x0 + a * (x1 - x0) / d;
            y2 = y0 + a * (y1 - y0) / d;
            x3 = x2 + h * (y1 - y0) / d;
            y3 = y2 - h * (x1 - x0) / d;
            x4 = x2 - h * (y1 - y0) / d;
            y4 = y2 + h * (x1 - x0) / d;

            ArrayR[0] = x2;
            ArrayR[1] = y2;
            ArrayR[2] = x3;
            ArrayR[3] = y3;
            ArrayR[4] = x4;
            ArrayR[5] = y4;



            return Arrays.toString(ArrayR);
        }

        return Arrays.toString(ArrayR);
    }


}


