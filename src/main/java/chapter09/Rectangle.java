package chapter09;

public class Rectangle {



  private double width ;
  private double height;

  public Rectangle() {
    this.height = 1d;
    this.width = 1d;
  }

  public Rectangle(double width, double height) {
    this.height = height;
    this.width = width;
  }

  public double getArea() {
    return this.height * this.width;
  }

  public double getPerimeter() {
    return (this.height + this.width) * 2;
  }

  @Override
  public String toString() {
    return "Rectangle [width=" + width + ", height=" + height +
      ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
  }
  // getters and setters
  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }
  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
