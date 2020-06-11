package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Games;

public class Main extends Application {
	private GamesGUI gamesGUI;
	private Games games;
	
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("gameLifeGUI.fxml"));
		/*Pane pane = fxmlLoader.load();
		int x = (int) (pane.getWidth()/10);
		int y = (int) (pane.getHeight()/10);
		*/
		games = new Games(60,60);
		gamesGUI = new GamesGUI(stage,games);
		fxmlLoader.setController(gamesGUI);
		Parent root = fxmlLoader.load();
		stage.setMaxHeight(600);
		stage.setMaxWidth(600);
		stage.setMinHeight(600);
		stage.setMinWidth(600);
		Scene scene = new Scene(root);
		
		stage.setTitle("GameLife");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	

}
