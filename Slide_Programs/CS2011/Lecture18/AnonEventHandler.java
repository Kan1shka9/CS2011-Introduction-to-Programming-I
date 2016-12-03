package CS2011.Lecture18;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AnonEventHandler extends Application {
	
	@Override
	public void start(Stage primaryStage){
		
		Button b = new Button("Click Me!");
		
		// Anonymous because we never name the class
		EventHandler<Event> handler = new EventHandler<Event>(){
			@Override
			public void handle(Event event) {
				JOptionPane.showMessageDialog(null, "Thanks!");
			}			
		};
		b.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
		
		StackPane pane = new StackPane();
		pane.getChildren().add(b);
		
		Scene sc = new Scene(pane, 300, 300);
	
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}