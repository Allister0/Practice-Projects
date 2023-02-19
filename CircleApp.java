/*
 * Allister Bell
\*/

package com.bell.circleapp;


public class CircleApp {

    public static void main(String[] args) 
        {
        
        Circle c = new Circle(3.5);
        
        System.out.println(c);
        System.out.println(c.toString());
        
        System.out.println(c.getArea());
        System.out.println(c.getCirc());
        
        Cylinder cy = new Cylinder(2.5, 5);
        System.out.println(cy.toString());
    }
}
