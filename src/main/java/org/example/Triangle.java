package org.example;
import java.util.Scanner;
public class Triangle {

    double calculate(double a, double b, double c){
        if (a + b < c || a + c < b || b + c < a) {
          return 0;

        }
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

}
