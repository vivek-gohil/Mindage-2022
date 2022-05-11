package com.mindate.factory;

import com.mindate.pojo.Circle;
import com.mindate.pojo.Shapes;
import com.mindate.pojo.Square;
import com.mindate.pojo.Triangle;

public class ShapesFactory {
	public static Shapes getShapes(int choice) {
		Shapes shapes = null;

		switch (choice) {
		case 1:
			shapes = new Circle();
			break;
		case 2:
			shapes = new Triangle();
			break;
		case 3:
			shapes = new Square();
			break;

//		default:
//			shapes = new Shapes();
//			break;
		}
		return shapes;
	}
}
