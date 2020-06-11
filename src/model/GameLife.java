package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameLife {
	Rectangle[][] rectangles;
	Rectangle[][] newRectangles;
	
	public GameLife(int width, int height) {
		newRectangles = new Rectangle[width][height];
		
		for (int i = 0; i < newRectangles.length; i++) {
			for (int j = 0; j < newRectangles[i].length; j++) {
				Rectangle rectangle = new Rectangle();
				rectangle.setFill(Color.BLACK);
				rectangle.setStroke(Color.WHITE);
				rectangle.setHeight(10);
				rectangle.setWidth(10);
				newRectangles[i][j]=rectangle;
			}
		}
		rectangles = newRectangles;
	}
	
	public void markRectangle(int x,int y) {
		if(rectangles[x][y].getFill().equals(Color.BLACK)) {
			rectangles[x][y].setFill(Color.RED);
		}else {
			rectangles[x][y].setFill(Color.BLACK);
		}
	}
	
	public void actualiceRectangles() {
		Rectangle[][] actualRectangles = newRectangles;
		for (int i = 0; i < rectangles.length; i++) {
			for (int j = 0; j < rectangles.length; j++) {
				int cant =0;
				int x = i-1;
				int y = j-1;
		
				if(x<0) {
					x=rectangles.length-1;
				}
				if(y<0) {
					y=rectangles[i].length-1;
				}
				if(rectangles[x][y].getFill().equals(Color.RED)){
					cant++;
				}
				x = i;
				if(rectangles[x][y].getFill().equals(Color.RED)){
					cant++;
				}
				x = i+1;
				if(x>= rectangles.length) {
					x=0;
				}
				if(rectangles[x][y].getFill().equals(Color.RED)){
					cant++;
				}
				y = j;
				if(rectangles[x][y].getFill().equals(Color.RED)){
					cant++;
				}
				y = j+1;
				if(y>= rectangles[i].length) {
					y=0;
				}
				if(rectangles[x][y].getFill().equals(Color.RED)){
					cant++;
				}
				x = i;
				if(rectangles[x][y].getFill().equals(Color.RED)){
					cant++;
				}
				x = i-1;
				if(x<0) {
					x=rectangles.length-1;
				}
				if(rectangles[x][y].getFill().equals(Color.RED)){
					cant++;
				}
				y = j;
				if(rectangles[x][y].getFill().equals(Color.RED)){
					cant++;
				}
				
				
				if(rectangles[i][j].getFill().equals(Color.RED)) {
					if(cant == 2 || cant==3) {
						actualRectangles[i][j].setFill(Color.RED);
					}
				}else {
					if(cant == 3) {
						actualRectangles[i][j].setFill(Color.RED);
					}
				}
			}
		}
		rectangles = actualRectangles;
	}
	
	public void delate() {
		rectangles = newRectangles;
	}

	public Rectangle[][] getRectangles() {
		return rectangles;
	}
	
}
