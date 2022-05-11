package com.mindate.main;

import java.util.Scanner;

import com.mindate.factory.ShapesFactory;
import com.mindate.pojo.Shapes;

public class PaintApplicationMain {
	public static void main(String[] args) {
		int choice;

		System.out.println("Welcome to Paint");
		System.out.println("Menu \n 1.Circle \n 2. Triangele\n 3.Square\n Enter your Choice ");

		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();

		Shapes shapes = ShapesFactory.getShapes(choice);
		if (shapes != null)
			shapes.draw();
		else
			System.out.println("Invalid Shape Choice");
	}
}
