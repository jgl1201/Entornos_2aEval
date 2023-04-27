public class Shape {
   public String color;
   public void colorDefecto() {
       color = "negro";
   }
  
   public static void main(String[] arg) {
       Square square = new Square(20);
       System.out.println (square.area() );
   }
}

class Circle extends Shape{
   public double radius;
   public double area() {
       return Math.PI * radius * radius;
   }
   public Circle(double radius) {
       this.radius = radius;
   }
  
}

class Square extends Shape{
   public double side;
   public double area() {
       return side * side;
   }
   public Square(double side) {
       this.side = side;
   }
  
}

class RightTriangle extends Shape{
   public double base;
   private double height;
   public double area() {
       return base * height / 2;
   }
   public RightTriangle(double base, double altura) {
       this.base = base;
       this.height = altura;
   }
  
}