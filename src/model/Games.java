package model;

import javafx.scene.shape.Rectangle;

public class Games {
	GameLife gLife;
	
	public Games(int width, int height) {
		gLife = new GameLife(width,height);
	}
	
	public Rectangle[][] actualizeGameLifeRetangles() {
		gLife.actualiceRectangles();
		return gLife.getRectangles();
	}
	
	public Rectangle[][] clickRectangle(int x,int y) {
		gLife.markRectangle(x, y);
		return gLife.getRectangles();
	}
}
