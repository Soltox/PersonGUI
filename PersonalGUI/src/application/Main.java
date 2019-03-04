package application;
	

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;






public class Main extends Application {
	
	//Create smallest children in instance Data

	private TextField oname = new TextField();
	private TextField orelease = new TextField();
	private TextField oweight = new TextField();
	private TextField oinstock = new TextField();

	
	public static void main(String[] args) {
		launch(args);
	}






	@Override
	public void start(Stage primaryStage) {
		
			BorderPane root = new BorderPane();
			root.setLeft(displayobject());
			root.setCenter(requestobject());
			
			
			
			Scene scene = new Scene(root,500,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("PersonGUI");
			primaryStage.show();
			
			
		 
	}
	
	//Method for BorderPane left to show the objects
		private Pane displayobject() {		
			GridPane objectshower = new GridPane();
			
			Label name = new Label("Name: ");
			Label release = new Label("Release: ");
			Label weight = new Label("Weight: ");
			Label instock = new Label("In Stock: ");
			
			
			objectshower.add(name, 0, 0);
			objectshower.add(release, 0, 1);
			objectshower.add(weight, 0, 2);
			objectshower.add(instock, 0, 3);
			return objectshower;
	}
		
		
	//Method for UserInput in Center
	private Pane requestobject() {
	GridPane requester = new GridPane();

	Label name = new Label("Name: ");
	Label release = new Label("Release: ");
	Label weight = new Label("Weight: ");
	Label instock = new Label("In Stock: ");
	
	requester.add(name, 0, 0);
	requester.add(release, 0, 1);
	requester.add(weight, 0, 2);
	requester.add(instock, 0, 3);
	requester.add(oname, 1, 0);
	requester.add(orelease, 1, 1);
	requester.add(oweight, 1, 2);
	requester.add(oinstock, 1, 3);	
		
	return requester;
	}
}
