/*
 * @ (#) Rectangle.java   1.0    8/25/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;

/*
 * @desscription:
 * @author: Quoc Luu
 * @version: 1.0
 * @date: 8/25/2024
 */
public class Rectangle {
    private double length;
    private double width;
    /**
     * Default constructor
     */
    public Rectangle() {
        this(0.0, 0.0);
    }
    /**
     * Constructor with patameters
     * @param l The length of the rectangle
     * @param w The Width of the rectangle
     * @throws IllegalArgumentException if width or length is less than 0
     */
    public Rectangle(double l, double w) {
        if(length < 0 || width >0 ){
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        length = l;
        width = w;
    }

    /**
     * Get the length of the rectangle
     * @return the length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Set the length of the rectangle
     * @param length the length of the rectangle
     * @throws IllegalAccessException if length is less than 0
     */
    public void setLength(double length) {
        if(length<0){
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }
    /**
     * Get the width of the rectangle
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }
    /**
     * Set the width of the rectangle
     * @param width the width of the rectangle
     * @throws IllegalAccessException if width is less than 0
     */
    public void setWidth(double width) {
        if(width<0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    /**
     * Get the perimeter of rectangle
     * @return get the perimeter of rectangle
     */
    public double getPerimeter() {
        return 2*(length+width);
    }

    /**
     * Get the area of rectangle
     * @return the area of rectangle
     */
    public double getArea() {
        return length*width;
    }
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", perimeter=" + getPerimeter() + ", area=" + getArea() + "]";
    }
}

