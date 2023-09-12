/*
Author: Savaas Iqbal
Purpose: Calculate area, perimeter, and circumferences when user inputs values
Date: 11/20/2022
*/

import java.util.Scanner;

/**
	This program demonstrates static methods
*/

public class Geometry
{
	public static void main (String [] args)
	{
		int choice;			//the user's choice
		double value = 0;	//the value returned from the method
		char letter;		//the Y or N from the user's decision to exit
		double radius;		//the radius of the circle
		double length;		//the length of the rectangle
		double width;		//the width of the rectangle
		double height;		//the height of the triangle
		double base;		//the base of the triangle
		double side1;		//the first side of the triangle
		double side2;		//the second side of the triangle
		double side3;		//the third side of the triangle
		
		//create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);
		
		//do loop was chose to allow the menu to be displayed first
		do
		{
			printMenu();//call the printMenu method
			
			choice = keyboard.nextInt();
						
			switch (choice)
			{
				case 1:
					System.out.print("Enter the radius of the circle:  ");
					radius = keyboard.nextDouble();
					//call the circleArea method and store the result in the value variable				
					value = circleArea(radius);
					System.out.println("The area of the circle is " + value);
					break;
				case 2:
					System.out.print("Enter the length of the rectangle:  ");
					length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle:  ");
					width = keyboard.nextDouble();
					//call the rectangleArea method and store the result in the value variable
			      value = rectangleArea(length, width);
					System.out.println("The area of the rectangle is " + value);
					break;
				case 3: 
					System.out.print("Enter the height of the triangle:  ");
					height = keyboard.nextDouble();
					System.out.print("Enter the base of the triangle:  ");
					base = keyboard.nextDouble();
					//call the triangleArea method and store the result in the value variable
				   value = triangleArea(base, height);
					System.out.println("The area of the triangle is " + value);
					break;
				case 4:
					System.out.print("Enter the radius of the circle:  ");
					radius = keyboard.nextDouble();
					//call the circumference method and store the result in the value variable
			      value = circleCircumference(radius);
					System.out.println("The circumference of the circle is " + value);
					break;
				case 5:
					System.out.print("Enter the length of the rectangle:  ");
					length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle:  ");
					width = keyboard.nextDouble();
					//call the perimeter method and store the result in the value variable
					value = rectanglePerimeter(length, width);
					System.out.println("The perimeter of the rectangle is " + value);
					break;
				case 6:
					System.out.print("Enter the length of side 1 of the triangle:  ");
					side1 = keyboard.nextDouble();
					System.out.print("Enter the length of side 2 of the triangle:  ");
					side2 = keyboard.nextDouble();
					System.out.print("Enter the length of side 3 of the triangle:  ");
					side3 = keyboard.nextDouble();
					//call the perimeter method and store the result in the value variable
					value = trianglePerimeter(side1, side2, side3);
					System.out.println("The perimeter of the triangle is " + value);
					break;
				default:
					System.out.println("You did not enter a valid choice.");
			}	
			keyboard.nextLine(); //consumes the new line character after the number						
			System.out.println("Do you want to exit the program (Y/N)?:  ");
			String answer = keyboard.nextLine();
			letter = answer.charAt(0);
		}while (letter != 'Y' && letter != 'y');
	}
   public static void printMenu()//printMenu method
   {
      System.out.println("This is a geometry calculator.");
      System.out.println("Choose what you'd like to calculate");
      System.out.println("1.  Find the area of a circle");
      System.out.println("2.  Find the area of a rectangle");
      System.out.println("3.  Find the area of a triangle");
      System.out.println("4.  Find the circumference of a circle");
      System.out.println("5.  Find the perimeter of a rectangle");
      System.out.println("6.  Find the perimeter of a triangle");
      System.out.println("Enter the number of your choice:  ");
   }
   
   public static double circleArea(double r) //circle area method
   {
      double area; 
      area = Math.PI * Math.pow(r, 2); 
      return area;
   }
   
   public static double rectangleArea(double l, double w)//rectangle area method
   {
       return l * w;  
   }
   
   public static double triangleArea(double b, double h) // triangle area method
   {
      return b * h / 2; 
   }
   
   public static double circleCircumference(double r) // circle circumference
   {
      return 2 * Math.PI * r; 
   }
   
   public static double rectanglePerimeter(double l, double w) // rectangle perimeter
   {
      return 2 * l + 2 * w; 
   }
   
   public static double trianglePerimeter(double s1, double s2, double s3) // triangle perimeter
   {
      return s1 + s2 + s3; 
   }
}
/* output

This is a geometry calculator.
 Choose what you'd like to calculate
 1.  Find the area of a circle
 2.  Find the area of a rectangle
 3.  Find the area of a triangle
 4.  Find the circumference of a circle
 5.  Find the perimeter of a rectangle
 6.  Find the perimeter of a triangle
 Enter the number of your choice:  
 3
 Enter the height of the triangle:  1
 Enter the base of the triangle:  1
 The area of the triangle is 0.5
 Do you want to exit the program (Y/N)?:  
 N
 This is a geometry calculator.
 Choose what you'd like to calculate
 1.  Find the area of a circle
 2.  Find the area of a rectangle
 3.  Find the area of a triangle
 4.  Find the circumference of a circle
 5.  Find the perimeter of a rectangle
 6.  Find the perimeter of a triangle
 Enter the number of your choice:  
 3
 Enter the height of the triangle:  1
 Enter the base of the triangle:  2
 The area of the triangle is 1.0
 Do you want to exit the program (Y/N)?:  
 N
 This is a geometry calculator.
 Choose what you'd like to calculate
 1.  Find the area of a circle
 2.  Find the area of a rectangle
 3.  Find the area of a triangle
 4.  Find the circumference of a circle
 5.  Find the perimeter of a rectangle
 6.  Find the perimeter of a triangle
 Enter the number of your choice:  
 4
 Enter the radius of the circle:  1
 The circumference of the circle is 6.283185307179586
 Do you want to exit the program (Y/N)?:  
 N
 This is a geometry calculator.
 Choose what you'd like to calculate
 1.  Find the area of a circle
 2.  Find the area of a rectangle
 3.  Find the area of a triangle
 4.  Find the circumference of a circle
 5.  Find the perimeter of a rectangle
 6.  Find the perimeter of a triangle
 Enter the number of your choice:  
 4
 Enter the radius of the circle:  2
 The circumference of the circle is 12.566370614359172
 Do you want to exit the program (Y/N)?:  
 N
 This is a geometry calculator.
 Choose what you'd like to calculate
 1.  Find the area of a circle
 2.  Find the area of a rectangle
 3.  Find the area of a triangle
 4.  Find the circumference of a circle
 5.  Find the perimeter of a rectangle
 6.  Find the perimeter of a triangle
 Enter the number of your choice:  
 1
 Enter the radius of the circle:  2
 The area of the circle is 12.566370614359172
 Do you want to exit the program (Y/N)?:  
 N
 This is a geometry calculator.
 Choose what you'd like to calculate
 1.  Find the area of a circle
 2.  Find the area of a rectangle
 3.  Find the area of a triangle
 4.  Find the circumference of a circle
 5.  Find the perimeter of a rectangle
 6.  Find the perimeter of a triangle
 Enter the number of your choice:  
 5
 Enter the length of the rectangle:  1
 Enter the width of the rectangle:  1
 The perimeter of the rectangle is 4.0
 Do you want to exit the program (Y/N)?:  
 N
 This is a geometry calculator.
 Choose what you'd like to calculate
 1.  Find the area of a circle
 2.  Find the area of a rectangle
 3.  Find the area of a triangle
 4.  Find the circumference of a circle
 5.  Find the perimeter of a rectangle
 6.  Find the perimeter of a triangle
 Enter the number of your choice:  
 5
 Enter the length of the rectangle:  2
 Enter the width of the rectangle:  3
 The perimeter of the rectangle is 10.0
 Do you want to exit the program (Y/N)?:  
 N
 This is a geometry calculator.
 Choose what you'd like to calculate
 1.  Find the area of a circle
 2.  Find the area of a rectangle
 3.  Find the area of a triangle
 4.  Find the circumference of a circle
 5.  Find the perimeter of a rectangle
 6.  Find the perimeter of a triangle
 Enter the number of your choice:  
 5
 Enter the length of the rectangle:  4
 Enter the width of the rectangle:  4
 The perimeter of the rectangle is 16.0
 Do you want to exit the program (Y/N)?:  
 N
 This is a geometry calculator.
 Choose what you'd like to calculate
 1.  Find the area of a circle
 2.  Find the area of a rectangle
 3.  Find the area of a triangle
 4.  Find the circumference of a circle
 5.  Find the perimeter of a rectangle
 6.  Find the perimeter of a triangle
 Enter the number of your choice:  
 6
 Enter the length of side 1 of the triangle:  1
 Enter the length of side 2 of the triangle:  1
 Enter the length of side 3 of the triangle:  1
 The perimeter of the triangle is 3.0
 Do you want to exit the program (Y/N)?:  
 Y
 */
   