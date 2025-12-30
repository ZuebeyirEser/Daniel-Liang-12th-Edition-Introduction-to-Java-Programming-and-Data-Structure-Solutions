public class Ex9 {
    /*(Area and perimeter of a rectangle) Write a program that displays the area and
    perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula:
    area = width * height
     */
    public static void main(String[] args) {
        float width = 4.5f;
        float height = 7.9f;
        float area  = width * height;
        float perimeter = 2*(width+height);
        System.out.println("Area of the rectangle is: "+ area + "and perimeter of the rectangle is:" + perimeter);
    }
}
