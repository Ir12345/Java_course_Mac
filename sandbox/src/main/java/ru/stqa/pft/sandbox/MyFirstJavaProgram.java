package ru.stqa.pft.sandbox;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class MyFirstJavaProgram {


  public static void main(String[] args) {
    hello("Irina");

   double l = 5;
    System.out.println("Area of square with side " + l + " = " + area(l));

    double a = 4;
    double b = 3;
     System.out.println("Area of rectangle with sides " + a + " and " + b + " = " + area(a,b));

  }

  public static void hello(String somebody) {

    System.out.println("Hello " + somebody + "!");

  }

  public static double area(double len) {

    return len *len;
  }

  public static double area(double a, double b) {

    return a * b;

  }
}
