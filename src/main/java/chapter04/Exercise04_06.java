package Chapter4;

public class Ex4_6 {
    public static void main(String[] args){

        double a1 = Math.toRadians(Math.random() * 361);
        double a2 = Math.toRadians(Math.random() * 361);
        double a3 = Math.toRadians(Math.random() * 361);
        System.out.println(a1 + " " + a2 + " " + a3 );

        int radius = 40;

        double x1 = radius * Math.cos(a1);
        double y1 = radius * Math.sin(a1);
        double x2 = radius * Math.cos(a2);
        double y2 = radius * Math.sin(a2);
        double x3 = radius * Math.cos(a3);
        double y3 = radius * Math.sin(a3);
        System.out.println(x1 + " " + x2 + " " + x3 );

        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        System.out.println("The angles are " + Math.round(A * 100)/100.0 + " " + Math.round(B * 100)/100.0 + " " + Math.round(C * 100)/100.0);


    }
}
