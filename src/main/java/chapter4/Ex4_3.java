package Chapter4;

public class Ex4_3 {
    public static void main(String[] args){
        //Atlanta
        double ax = 33.7489954;
        double ay = 284.3879824;
        // Charlotte (35.2270869, 280.8431267)
        double cx = 35.2270869;
        double cy = 280.8431267;
        //Savannah (32.0835407, 281.0998342)
        double sx = 32.0835407;
        double sy = 281.0998342;
        // Orlando (28.5383355, 281.3792365)
        double ox = 28.5383355;
        double oy= 281.3792365;

        /*(Geography: estimate areas) Use the GPS locations for Atlanta, Georgia; Orlando, Florida;
         Savannah, Georgia; and Charlotte, North Carolina in the figure in Section 4.1 to compute the estimated area
         enclosed by these four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the distance
         between two cities. Divide the polygon into two triangles and use the formula in Programming Exercise 2.19 to
         compute the area of a triangle.)*/
        final double RADIUSOFEARTH = 6371.01;
        double x1, y1, x2, y2, x3, y3, x4, y4;
        x1 = Math.toRadians(ax);
        y1 = Math.toRadians(ay);
        x2 = Math.toRadians(cx);
        y2 = Math.toRadians(cy);
        x3 = Math.toRadians(sx);
        y3 = Math.toRadians(sy);
        x4 = Math.toRadians(ox);
        y4 = Math.toRadians(oy);

        double AC = RADIUSOFEARTH * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 -y2));
        double AS = RADIUSOFEARTH * Math.acos(Math.sin(x1)*Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 -y3));
        double SO = RADIUSOFEARTH * Math.acos(Math.sin(x3)*Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 -y4));
        double CO = RADIUSOFEARTH * Math.acos(Math.sin(x2)*Math.sin(x4) + Math.cos(x2) * Math.cos(x4) * Math.cos(y2 -y4));
        double AO = RADIUSOFEARTH * Math.acos(Math.sin(x1)*Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 -y4));
        /*
        * +----------------+
        |   A            C |
        |                |
        |   S            O |
        +----------------+
        */

        double s1 = (AS + SO + AO)/2;
        double area1 = Math.pow((s1*(s1 - AS)*(s1 - SO)*(s1 - AO)),0.5);

        double s2 = (AC + CO + AO)/2;
        double area2 = Math.pow((s2*(s2 - AC)*(s2 - CO)*(s2 - AO)),0.5);

        double total = area1 + area2;

        System.out.println("The estimated area enclosed by these four cities is " + total);


    }
}
