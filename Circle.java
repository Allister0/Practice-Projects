/*
 * Allister Bell
 */
package com.bell.circleapp;

public class Circle 
    {
    
    private double radius = 1.0;
    private double area;
    private double circumference;

public Circle(double r)
        {
        radius = r;
        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;
        }

    public double getArea()
        {
        return area;
        }

    public double getCirc()
        {
        return circumference;
        }

    @Override
    public String toString()
        {
        return "Circle{" + "radius=" + radius + ", area=" + area + ", circumference=" + circumference + '}';
        }
    }
    