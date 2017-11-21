

public class Shape {
	public static void main(String args[]) {  Square squ = new Square();  squ.seq(4);  Circle cir = new Circle();  cir.ceq(4);  Rectangle rec = new Rectangle();  rec.req(5, 6);   }} class Circle extends Question_1 {  public static void ceq(double r)  {  double pi = 3.14;  System.out.println("The area of the circle is " + pi*r*r);    } } class Rectangle extends Question_1 {  public static void req(int side1, int side2)  {  System.out.println("The area of the rectangle is "+side1 * side2);  } } class Square extends Question_1 {  public static void seq(int side)  {   System.out.println("The area of the square is " + side * side);  }
}
