/*
 * @ (#) TestRectangle.java   1.0    8/25/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;

import java.util.Scanner;

/*
 * @desscription: This class represents a bank with many bank accounts
 * @author: Quoc Luu
 * @version: 1.0
 * @date: 8/25/2024

 */

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a Rectangle object
        Rectangle rc= new Rectangle();

        // Input length and width
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width: ");
        double width  = sc.nextDouble();

        // Set length and width
        rc.setLength(length);
        rc.setWidth(width);

        // Print perimeter, area, and string
        System.out.println(rc);

        sc.close();
    }
}
