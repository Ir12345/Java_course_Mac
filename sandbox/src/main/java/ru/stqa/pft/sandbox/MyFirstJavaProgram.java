package ru.stqa.pft.sandbox;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class MyFirstJavaProgram {


  public static void main(String[] args) {
    hello("Irina");

   Square s = new Square(5);
//    s.l = 5;
    System.out.println("Area of square with side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 3);
//    r.a = 4;
//    r.b = 3;
     System.out.println("Area of rectangle with sides " + r.a + " and " + r.b + " = " + r.area());

  }

  public static void hello(String somebody) {

    System.out.println("Hello " + somebody + "!");

  }

//  public static double area(Square s) {
//
//    return s.l * s.l;
//  }

//  public static double area(Rectangle r) {
//
//    return r.a * r.b;
//
//  }
}

