package ui;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.Games;

public class GamesGUI {
	private Games games;
	private Stage window;
	
	@FXML
	private Pane paneGameLife;
	
	public GamesGUI(Stage win,Games games) {
		window = win;
		this.games = games;
	}
	
	public void initialize() {
		
		update();
	}
	
	public void update() {
		GridPane pane = new GridPane();
		pane.setPrefSize(600, 600);
		pane.setMinSize(600, 600);
		pane.setMaxSize(600, 600);
		Rectangle[][] rectangles = games.actualizeGameLifeRetangles();
		for (int i = 0; i < rectangles.length; i++) {
			for (int j = 0; j < rectangles.length; j++) {
				Rectangle actual = new Rectangle();
				actual = rectangles[i][j];
				actual.setLayoutX(i*10);
				actual.setLayoutY(j*10);
				pane.add(actual, i, j);
			}
		}
		paneGameLife.getChildren().add(pane);
	}
}
